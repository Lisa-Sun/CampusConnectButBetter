package Group2.BetterCampusConnect.controller;

import Group2.BetterCampusConnect.model.nosql.CourseOverview;
import Group2.BetterCampusConnect.model.nosql.CourseOverviewRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {


	@Autowired
	CourseOverviewRepository courseOverviewRepo;

	
	
	@RequestMapping("/coursebrowser")
	public String courseGeneral(Model model,HttpServletRequest request)
	{
	Object sessionChecker = request.getSession().getAttribute("userId");
	if (sessionChecker == null) {
		return "redirect:login";
	} 
	/*Use this line as current user's id:*/
	//String id = request.getSession().getAttribute("userId").toString();
	
		//model.addAttribute("courses", courseOverviewRepo.findAll());
		return "coursebrowser";
	}
	
	@RequestMapping("/courses")
	public String courseSearch(@RequestParam(name = "query", required = false, defaultValue = "") String query, Model model )
	{
		
		if(query.equals("")){
		
			model.addAttribute("courses", courseOverviewRepo.findAll());
		}else {
			List<CourseOverview> results = courseOverviewRepo.search(query);
			if(results.size()==0) {
				model.addAttribute("query",query);
				return "noresults";
			}
			model.addAttribute("courses", results);
		}
		return "courses";
	}
	
}

