package Group2.BetterCampusConnect.controller;

import Group2.BetterCampusConnect.model.nosql.LoginData;
import Group2.BetterCampusConnect.model.nosql.LoginRepository;

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
public class LoginController
{
	@GetMapping(value = "/login_init")
	@PostMapping(value = "/login_init")
	public String loginGeneral(Model model)
	{
		System.out.println("dd");
		model.addAttribute("loginData", new LoginData());
		return "login";
	}

	


} 
