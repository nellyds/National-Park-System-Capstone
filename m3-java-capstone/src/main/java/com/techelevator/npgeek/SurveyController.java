package com.techelevator.npgeek;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.npgeek.DAOs.ParkDao;
import com.techelevator.npgeek.DAOs.SurveyDao;
import com.techelevator.npgeek.Objects.Survey;

@Controller
public class SurveyController {

	@Autowired
	SurveyDao surveyDao;
	@Autowired
	ParkDao parkDao;
	@RequestMapping(path="/surveyInput", method=RequestMethod.GET)
	public String displaySurvery() {
		return "surveyInput";
	}

	@RequestMapping(path="/surveyResult", method=RequestMethod.POST)
	public String showSurveyResult(@ModelAttribute Survey survey, ModelMap modelHolder) {
		
	List<Survey> surveys = surveyDao.getAllSurveys();
	
	surveyDao.addSurvey(survey);

	 modelHolder.put("surveys", surveys);

	 return "redirect:/surveyResult";
	}
	
	@RequestMapping(path="/surveyResult", method=RequestMethod.GET)
	public String displaySurvey(ModelMap modelHolder) {
		modelHolder.put("parks",parkDao.getParksBySurveyRank());

		return "surveyResult";
	}

}