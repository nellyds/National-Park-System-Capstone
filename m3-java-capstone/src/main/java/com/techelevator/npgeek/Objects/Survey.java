package com.techelevator.npgeek.Objects;

public class Survey {

private int surveyId;
private String parkCode;
private String emailAddress;
private String state;
private String activityLevel;
public int getSurveyId() {
	return surveyId;
}
public void setSurveyId(int surveyId) {
	this.surveyId = surveyId;
}
public String getParkCode() {
	return parkCode;
}
public void setParkCode(String parkCode) {
	this.parkCode = parkCode;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getActivityLevel() {
	return activityLevel;
}
public void setActivitylevel(String activityLevel) {
	this.activityLevel = activityLevel;
}
	
	
//	surveyId INTEGER PRIMARY KEY DEFAULT NEXTVAL('seq_surveyId'),
//	parkCode VARCHAR(10) NOT NULL,
//	emailAddress VARCHAR(100) NOT NULL,
//	state VARCHAR(30) NOT NULL,
//	activityLevel VARCHAR(100) NOT NULL
	
}
