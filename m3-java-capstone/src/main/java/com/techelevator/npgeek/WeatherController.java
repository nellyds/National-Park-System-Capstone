package com.techelevator.npgeek;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
		modelHolder.put("park", parkDao.getParkByCode(parkCode));

	    	
	    
		return "detailView";
	}

	@RequestMapping(path="/detailView", method=RequestMethod.POST)
	public String displayAddForm( @RequestParam String isCelsius, @RequestParam String parkCode,ModelMap modelHolder , HttpSession session) {
	    	
		 boolean tempType = false;
		if(isCelsius.equals("false")) {
			tempType = false;
		} else if(isCelsius.equals("true")) {
			tempType = true;

		}
		modelHolder.put("parkCode", parkCode);
		session.setAttribute("tempType",tempType);

		

		return "redirect:/detailView";
	}
	
	
	

}
