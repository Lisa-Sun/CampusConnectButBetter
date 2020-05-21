package Group2.BetterCampusConnect.controller;

import Group2.BetterCampusConnect.model.ImpDates;
import Group2.BetterCampusConnect.model.ImpDatesRepository;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

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
public class ImportantDatesController
{
	@Autowired
	ImpDatesRepository impDatesRepo;

	@RequestMapping("/ImportantDates")
    public String FinancialPlan(Model model)
    {
    	model.addAttribute("ImpDates", impDatesRepo.findAll());
        return "/ImportantDates";
    }


}