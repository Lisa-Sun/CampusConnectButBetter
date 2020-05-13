package Group2.BetterCampusConnect.controller;

import Group2.BetterCampusConnect.model.FinancialPlanOverview;
import Group2.BetterCampusConnect.model.FinancialPlanOverviewRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 

public class FinanceController {

    @Autowired
    FinancialPlanOverviewRepository FinancialPlanOverview;


    @RequestMapping("/financialPlanningBrowser")
    public String FinancialPlan(Model model)
    {
        return "financialPlanningBrowser";
    }

    @RequestMapping("/FinancialPlanning")
    public String planSearch(@RequestParam(name = "query", required = false, defaultValue = "") String query, Model model)
    {
        if (query.equals("")) {
            model.addAttribute("plans", FinancialPlanOverview.findAll());
        }
        return "finanicalPlanning";
    }
}