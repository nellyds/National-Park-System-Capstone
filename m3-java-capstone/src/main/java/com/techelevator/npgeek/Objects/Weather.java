package com.techelevator.npgeek.Objects;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Weather {
	private String parkCode;
	private Integer fiveDayForecastValue;
	private Integer low;
	private Integer high;
	private String forecast;
	

	public String getParkCode() {
	    return parkCode;
	}
	public void setParkCode(String parkCode) {
	    this.parkCode = parkCode;
	}
	public Integer getFiveDayForecastValue() {
	    return fiveDayForecastValue;
	}
	public void setFiveDayForecastValue(Integer fiveDayForecastValue) {
	    this.fiveDayForecastValue = fiveDayForecastValue;
	}
	public Integer getLow() {
	    return low;
	}
	public void setLow(Integer low) {
	    this.low = low;
	}
	public Integer getHigh() {
	    return high;
	}
	public void setHigh(Integer high) {
	    this.high = high;
	}
	public String getForecast() {
	    return forecast;
	}
	public void setForecast(String forecast) {
	    this.forecast = forecast;
	}
	public String image(String forecast) {
		if(forecast.equals("snow")) {
			return "snow";
		}
		if(forecast.equals("rain")) {
			return "rain";
		}
		if(forecast.equals("partly cloudy")) {
			return "partlyCloudy";
		}
		if(forecast.equals("thunderstorms")) {
		return "thunderstorms";	
		}
		if(forecast.equals("sunny")) {
			return "sunny";
		}
		if(forecast.equals("cloudy")) {
			return "cloudy";
			}
		return null;
		}
	
	public String forecastMessage(String forecast) {
	    if(forecast.equals("snow")) {
	        return "pack snowshoes";
	    }
	    if(forecast.equals("rain")) {
	        return "pack rain gear and wear waterproof shoes";
	    }
	    if(forecast.equals("thunderstorms")) {
	        return "seek shelter and avoid hiking on exposed ridges";
	    }
	    if(forecast.equals("sunny")) {
	        return "pack sunblock";
	    }
	    return null;
	    
	}
	public String tempMessage(Integer low, Integer high) {
	    if((high-low)>20) {
	        return "wear breathable layers";
	    }
	    if(high>75) {
	        return "bring an extra gallon of water";
	    }
	    if(low<20) {
	        return "dangers of exposure to frigid temperatures";
	    }
	    
	    return null;
	    
	}
	
public BigDecimal highFtoC(Integer high){
	BigDecimal newTemp = new BigDecimal((high-32)/1.8);
	return newTemp.setScale(2,RoundingMode.CEILING);
	
	}
	public BigDecimal lowFtoC(Integer low){
		BigDecimal newTemp = new BigDecimal((low-32)/1.8);
		return newTemp.setScale(2,RoundingMode.CEILING);
	}
}
