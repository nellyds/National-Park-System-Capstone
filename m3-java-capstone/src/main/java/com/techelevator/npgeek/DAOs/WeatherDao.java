package com.techelevator.npgeek.DAOs;

import java.util.List;

import com.techelevator.npgeek.Objects.Weather;





public interface WeatherDao {

	/**
	 * This returns a 5 day forecast for a specific park
	 * @return 5 day forecast for a park
	 * @author jonathanziernicki
	 * @param String parkCode, from a Park object
	 */
	List<Weather> getWeatherForPark(String parkCode);
	}

