package Group2.BetterCampusConnect.controller;

import Group2.BetterCampusConnect.model.nosql.CourseOverviewRepository;
import Group2.BetterCampusConnect.model.nosql.LoginData;
import Group2.BetterCampusConnect.model.nosql.LoginRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("userId")
@Controller
public class LoginController
{

	@Autowired
	LoginRepository loginData;
	
	@PostMapping(value = "/login")
	public String loginGeneral(
			@RequestParam(name = "username", required = true, defaultValue = "")String username, 
			@RequestParam(name = "password", required = true, defaultValue = "")String password,  
			Model model, HttpServletResponse httpResponse)
	{
		Optional<LoginData> login = loginData.findByLogin(username, password);
		if(login.isPresent()) {
			model.addAttribute("userId",login.get().id);
			
			return "redirect:hello";
		}else {
			model.addAttribute("valid", false);
			return "login";
		}
		
	}


	 @GetMapping("/login")
	    
    public String login(Model model) {
    	model.addAttribute("valid", true);
        return "login";
    }



} 
