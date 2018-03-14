package com.techelevator.npgeek.Objects;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.npgeek.DAOs.SurveyDao;

@Controller
public class SurveyController {

	@Autowired
	SurveyDao surveyDao;
	
	@RequestMapping(path="/surveyInput", method=RequestMethod.GET)
	public String displaySurveyInputPage(ModelMap modelHolder){
		List<Survey> surveys= surveyDao.getAllSurveys();
		modelHolder.put("surveys", surveys);
		return "surveyInput";
	}
}
