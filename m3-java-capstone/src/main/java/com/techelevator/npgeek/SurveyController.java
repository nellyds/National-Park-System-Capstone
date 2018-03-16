package com.techelevator.npgeek;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.npgeek.DAOs.SurveyDao;
import com.techelevator.npgeek.Objects.Survey;

@Controller
public class SurveyController {

	@Autowired
	SurveyDao surveyDao;
	@RequestMapping(path="/surveyInput", method=RequestMethod.GET)
	public String displaySurvery() {
		return "surveyInput";
	}

	@RequestMapping(path="/surveyResult", method=RequestMethod.POST)
	public String showSurveyResult(ModelAttribute survey, ModelMap modelHolder) {
		
	List<Survey> surveys = surveyDao.getAllSurveys();
	
	surveyDao.addSurvey((Survey) survey);

	 modelHolder.put("surveys", surveys);

	 return "/surveyInput";
	}

}