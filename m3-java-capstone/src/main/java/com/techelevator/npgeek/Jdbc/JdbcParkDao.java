package com.techelevator.npgeek.Jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.DAOs.ParkDao;
import com.techelevator.npgeek.Objects.Park;



@Component
public class JdbcParkDao implements ParkDao{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcParkDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Park> getAllParks() {
		List<Park> allParks = new ArrayList<>();
		String sqlSelectAllParks = "SELECT * FROM PARK";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllParks);
		while(results.next()) {
			allParks.add(mapRowToPark(results));
		}
		return allParks;
	}
	
	public Park getParkById(int parkCode) {
		Park park = null;
		String sqlSelectParkByCode = "SELECT * FROM survey WHERE parkCode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectParkByCode, parkCode);
		if(results.next()) {
			park = mapRowToPark(results);
		}
		return park;
	}
	private Park mapRowToPark(SqlRowSet row) {
		Park park = new Park();
		park.setParkCode(row.getString("parkCode"));
		park.setParkName(row.getString("parkName")); 
		park.setState(row.getString("state"));
		park.setAnnualVisitorCount(row.getInt("annualVisitorCount"));
		park.setElevationInFeet(row.getInt("elevationInFeet"));
		park.setClimate(row.getString("climate"));
		park.setNumberOfCampSites(row.getInt("numberOfCampSites"));
		park.setMilesOfTrail(row.getDouble("milesOfTrail"));
		park.setInspirationalQuote(row.getString("inspirationalQuote"));
		park.setQuoteSource(row.getString("inspirationalQuoteSource"));
		park.setParkDescription(row.getString("parkDescription"));
		park.setEntryFree(row.getInt("entryFee"));
		park.setNumberOfSpecies(row.getInt("numberOfAnimalSpecies"));
		
		
		park.setAcreage(row.getInt("acreage"));
		park.setYearFounded(row.getInt("yearFounded"));
		return park;
		
		
	}

	@Override
	public Park getParkByCode(String parkCode) {
		Park park = null;
		String sqlSelectParkByCode = "SELECT * FROM survey WHERE parkCode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectParkByCode, parkCode);
		if(results.next()) {
			park = mapRowToPark(results);
		}
		return park;
	}



	
	
}

