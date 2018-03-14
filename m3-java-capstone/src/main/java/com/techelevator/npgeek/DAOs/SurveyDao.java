package com.techelevator.npgeek.DAOs;

import java.util.List;

import com.techelevator.npgeek.Survey;
import com.techelevator.npgeek.Objects.Park;

public interface SurveyDao {
	
	public Survey getSurveyByCode(int surveyId);
	
	public List<Survey> getAllSurveys();
}