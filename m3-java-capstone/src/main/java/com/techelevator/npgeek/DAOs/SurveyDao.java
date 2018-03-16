package com.techelevator.npgeek.DAOs;

import java.util.List;

import com.techelevator.npgeek.Objects.Survey;

public interface SurveyDao {
	
	public Survey getSurveyByCode(int surveyId);
	
	public List<Survey> getAllSurveys();

	void addSurvey(Survey survey);
}