package com.techelevator.npgeek.DAOs;

import java.util.List;

import com.techelevator.npgeek.Objects.Park;

public interface ParkDao {
	
	public Park getParkByCode(String parkCode);
	
	public List<Park> getAllParks();
}


