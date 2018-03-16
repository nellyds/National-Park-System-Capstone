package com.techelevator.npgeek.Jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.Objects.Survey;

@Component
public class JdbcSurveyDao implements com.techelevator.npgeek.DAOs.SurveyDao{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcSurveyDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Survey> getAllSurveys() {
		List<Survey> allSurveys = new ArrayList<>();
		String sqlSelectAllSurveys = "SELECT * FROM survey_result";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllSurveys);
		while(results.next()) {
			allSurveys.add(mapRowToSurvey(results));
		}
		return allSurveys;
	}
	
	public Survey getSurveyById(int surveyId) {
		Survey survey = null;
		String sqlSelectSurveyById = "SELECT * FROM survey_result WHERE surveyId = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectSurveyById, surveyId);
		if(results.next()) {
			survey = mapRowToSurvey(results);
		}
		return survey;
	}
	@Override
	public void addSurvey(Survey survey) {
		String sqlAddSurvey = "INSERT INTO survey_result (parkcode,emailaddress,state,activitylevel) VALUES (?,?,?,?)";
		jdbcTemplate.update(sqlAddSurvey, survey.getParkCode(), survey.getEmailAddress(),survey.getState(),survey.getActivityLevel());
	}

	

	private Survey mapRowToSurvey(SqlRowSet row) {
		Survey survey = new Survey();
		survey.setSurveyId(row.getInt("surveyId"));
		survey.setParkCode(row.getString("parkCode"));    		
		survey.setEmailAddress(row.getString("emailAddress"));
		survey.setState(row.getString("state"));
		survey.setActivityLevel(row.getString("activityLevel"));
		return survey;
		
		
	}

	@Override
	public Survey getSurveyByCode(int surveyId) {
		Survey survey = null;
		String sqlSelectSurveyById = "SELECT * FROM survey WHERE surveyId = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectSurveyById, surveyId);
		if(results.next()) {
			survey = mapRowToSurvey(results);
		}
		return survey;
	}
}





