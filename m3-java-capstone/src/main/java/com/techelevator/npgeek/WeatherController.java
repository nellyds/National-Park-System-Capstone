package com.techelevator.npgeek;

import org.springframework.stereotype.Controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.npgeek.DAOs.ParkDao;
import com.techelevator.npgeek.DAOs.WeatherDao;
import com.techelevator.npgeek.Objects.Park;



	@Controller
	public class WeatherController {
	@Autowired
	WeatherDao weatherDao;
	
	@Autowired
	ParkDao parkDao;

	@RequestMapping(path="/",method=RequestMethod.GET)
	public String displayAllParks(ModelMap modelHolder) {
	    List<Park> parks = parkDao.getAllParks();
	    modelHolder.put("parks", parks);
	    
	    return "listView";
	}

	@RequestMapping(path="/detailView", method=RequestMethod.GET)
	public String displayAddForm(@RequestParam String parkCode, ModelMap modelHolder) {
	    modelHolder.put("fiveDayForecast", weatherDao.getWeatherForPark(parkCode));
		return "detailView";
	}

	
	

}
