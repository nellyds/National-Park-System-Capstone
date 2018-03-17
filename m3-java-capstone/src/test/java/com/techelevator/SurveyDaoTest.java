package com.techelevator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.npgeek.Jdbc.JdbcParkDao;
import com.techelevator.npgeek.Objects.Park;

public class SurveyDaoTest extends DAOIntegrationTest {

	private JdbcParkDao testSurvey;
	private Integer newSurveyId;


	@Before
	public void setUp() throws Exception {
	    testSurvey = new JdbcParkDao(getDataSource());
	    JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
	    
	    String sqlParkIns = ("INSERT INTO survey_result (parkcode, parkname, state, acreage, elevationinfeet, milesoftrail, numberofcampsites, climate, yearfounded, annualvisitorcount, inspirationalquote, inspirationalquotesource, parkdescription, entryfee, numberofanimalspecies) "
	            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING parkcode");
	    newSurveyId = jdbcTemplate.queryForObject(sqlParkIns, Integer.class, "AAA", "ParkName", "AA", 20, 21, 22.0, 23, "hot",  2000, 12, "cool", "coolio", "neat", 15, 2);
	    
	}
//	@Test
//	public void testAllParks() {
//	    List<Park> parkInfo = testSurvey.getAllParks();
//	    for(Park p : parkInfo) {
//	        if(p.getParkCode().contentEquals(newSurveyId)){
//	            assertEquals(newSurveyId, p.getParkCode());
//	            assertEquals("ParkName", p.getParkName());
//	            assertEquals("hot", p.getClimate());
//	            assertEquals(20, p.getAcreage());
//
//
//	            return;
//	        }
//	    }
//	    fail("Test Park was not found");
//	}
	}
