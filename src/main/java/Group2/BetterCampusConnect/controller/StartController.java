package Group2.BetterCampusConnect.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StartController {

	/* Setting home page here */
	@GetMapping("/")
	public String index(HttpServletRequest request) {
		Object sessionChecker = request.getSession().getAttribute("userId");
		if (sessionChecker == null) {
			return "redirect:login";
		} else {
			return "redirect:StudentProfile?id=" + request.getSession().getAttribute("userId").toString();
		}

	}


	@GetMapping("/hello")
	public String greeting1(Model model) {

		return "greeting";
	}

	@GetMapping("/hello1")
	public String greeting2(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
}