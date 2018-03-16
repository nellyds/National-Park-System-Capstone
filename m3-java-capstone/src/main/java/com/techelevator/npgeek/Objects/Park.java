package com.techelevator.npgeek.Objects;

public class Park {

	private String parkCode;
	private String parkName;
	private String state;
	private int acreage;
	private int elevationInFeet;
	private double milesOfTrail;
	private int numberOfCampSites;
	private String climate;
	private int yearFounded;
	private int annualVisitorCount;
	private String inspirationalQuote;
	private String quoteSource;
	private String parkDescription;
	private int entryFree;
	private int numberOfSpecies;
	private int amountOfSurveys;
	public String getParkCode() {
		return parkCode;
	}
	
	public String toLowerCase(String parkCode) {
		return parkCode.toLowerCase();
	}
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	public String getParkName() {
		return parkName;
	}
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAcreage() {
		return acreage;
	}
	public void setAcreage(int acreage) {
		this.acreage = acreage;
	}
	public int getElevationInFeet() {
		return elevationInFeet;
	}
	public void setElevationInFeet(int elevationInFeet) {
		this.elevationInFeet = elevationInFeet;
	}
	public double getMilesOfTrail() {
		return milesOfTrail;
	}
	public void setMilesOfTrail(double milesOfTrail) {
		this.milesOfTrail = milesOfTrail;
	}
	public int getNumberOfCampSites() {
		return numberOfCampSites;
	}
	public void setNumberOfCampSites(int numberOfCampSites) {
		this.numberOfCampSites = numberOfCampSites;
	}
	public String getClimate() {
		return climate;
	}
	public void setClimate(String climate) {
		this.climate = climate;
	}
	public int getYearFounded() {
		return yearFounded;
	}
	public void setYearFounded(int yearFounded) {
		this.yearFounded = yearFounded;
	}
	public int getAnnualVisitorCount() {
		return annualVisitorCount;
	}
	public void setAnnualVisitorCount(int annualVisitorCount) {
		this.annualVisitorCount = annualVisitorCount;
	}
	public String getInspirationalQuote() {
		return inspirationalQuote;
	}
	public void setInspirationalQuote(String inspirationalQuote) {
		this.inspirationalQuote = inspirationalQuote;
	}
	public String getQuoteSource() {
		return quoteSource;
	}
	public void setQuoteSource(String quoteSource) {
		this.quoteSource = quoteSource;
	}
	public String getParkDescription() {
		return parkDescription;
	}
	public void setParkDescription(String parkDescription) {
		this.parkDescription = parkDescription;
	}
	public int getEntryFree() {
		return entryFree;
	}
	public void setEntryFree(int entryFree) {
		this.entryFree = entryFree;
	}
	public int getNumberOfSpecies() {
		return numberOfSpecies;
	}
	public void setNumberOfSpecies(int numberOfSpecies) {
		this.numberOfSpecies = numberOfSpecies;
	}

	public int getAmountOfSurveys() {
		return amountOfSurveys;
	}

	public void setAmountOfSurveys(int amountOfSurveys) {
		this.amountOfSurveys = amountOfSurveys;
	}
	
//	parkCode VARCHAR(10) PRIMARY KEY,
//	parkName VARCHAR(200) NOT NULL,
//	state VARCHAR(30) NOT NULL,
//	acreage INTEGER NOT NULL,
//	elevationInFeet INTEGER NOT NULL,
//	milesOfTrail REAL NOT NULL,
//	numberOfCampsites INTEGER NOT NULL,
//	climate VARCHAR(100) NOT NULL,
//	yearFounded INTEGER NOT NULL,
//	annualVisitorCount INTEGER NOT NULL,
//	inspirationalQuote TEXT NOT NULL,
//	inspirationalQuoteSource VARCHAR(200) NOT NULL,
//	parkDescription TEXT NOT NULL,
//	entryFee INTEGER NOT NULL,
//	numberOfAnimalSpecies INTEGER NOT NULL
//	
}
