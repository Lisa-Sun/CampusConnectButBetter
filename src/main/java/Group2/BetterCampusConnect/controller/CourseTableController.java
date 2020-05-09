package Group2.BetterCampusConnect.controller;

import Group2.BetterCampusConnect.model.nosql.CourseOverview;
import Group2.BetterCampusConnect.model.nosql.CourseOverviewRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseTableController {


	@Autowired
	CourseOverviewRepository courseOverviewRepo;

	@RequestMapping("/course")
	public String courseGeneral(Model model)
	{
		model.addAttribute("courseOverview", courseOverviewRepo.findAll());
		return "courseTable";
	}
}

