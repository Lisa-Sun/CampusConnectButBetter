package Group2.BetterCampusConnect.controller;

import Group2.BetterCampusConnect.model.FinancialPlanOverview;
import Group2.BetterCampusConnect.model.FinancialPlanOverviewRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller 

public class FinanceController {

    @Autowired
    FinancialPlanOverviewRepository FinancialPlanOverviewRepo;


    @RequestMapping("/financialPlanningBrowser")
    public String FinancialPlan(Model model,HttpServletRequest request)
    {
    	Object sessionChecker = request.getSession().getAttribute("userId");
		if (sessionChecker == null) {
			return "redirect:login";
		} 
		/*Use this line as current user's id:*/
		//String id = request.getSession().getAttribute("userId").toString();
        return "financialPlanningBrowser";
    }

    @RequestMapping("/FinancialPlanning")
    public String planSearch(@RequestParam(name = "query", required = false, defaultValue = "") String query, Model model)
    {
        if (query.equals("")) {
            model.addAttribute("plans", FinancialPlanOverviewRepo.findAll());
        }
        else {
            List<FinancialPlanOverview> results = (List<FinancialPlanOverview>)FinancialPlanOverviewRepo.search(query);
            if (results.size() == 0) {
                model.addAttribute("query", query);
                return "No Results";
            }
            model.addAttribute("plans", results);
        }
        return "financialPlanning";
    }
}