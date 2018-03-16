package com.techelevator.npgeek.Jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.DAOs.WeatherDao;
import com.techelevator.npgeek.Objects.Weather;

@Component
public class JdbcWeatherDao implements WeatherDao {

private JdbcTemplate jdbcTemplate;

@Autowired
public JdbcWeatherDao(DataSource dataSource) {
    jdbcTemplate = new JdbcTemplate(dataSource);
}

@Override
public List<Weather> getWeatherForPark(String parkCode) {
    String getWeatherSql = "select * from weather where parkCode = ? order by fivedayforecastvalue asc ";

    List<Weather> weatherList = new ArrayList<>();
    SqlRowSet results = jdbcTemplate.queryForRowSet(getWeatherSql,parkCode);
    
    while(results.next()) {
        Weather weatherObj = mapRowToWeather(results);
        weatherList.add(weatherObj);
    }
    return weatherList;
}

private Weather mapRowToWeather(SqlRowSet results) {
    Weather weatherObj = new Weather();
    weatherObj.setFiveDayForecastValue(results.getInt("fiveDayForecastValue"));
    weatherObj.setParkCode(results.getString("parkCode"));
    weatherObj.setForecast(results.getString("forecast"));
    weatherObj.setHigh(results.getInt("high"));
    weatherObj.setLow(results.getInt("low"));



    return weatherObj;
}
}
