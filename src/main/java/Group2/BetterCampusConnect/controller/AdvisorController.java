package Group2.BetterCampusConnect.controller;

import Group2.BetterCampusConnect.model.AdvisorInfo;
import Group2.BetterCampusConnect.model.AdvisorRepository;

import Group2.BetterCampusConnect.model.Student;
import Group2.BetterCampusConnect.model.StudentRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdvisorController
{
	@Autowired StudentRepository studentRepository;
	@GetMapping("/myAdvisor")
	public String displayAdvisor(Model model,HttpServletRequest request)
	{
		Object sessionChecker = request.getSession().getAttribute("userId");
		if (sessionChecker == null) {
			return "redirect:login";
		}
		Student currentStudent = studentRepository.findByStudentId(sessionChecker.toString());
		AdvisorInfo studentAdvisor = currentStudent.getLastNameFirstTwo();
		model.addAttribute("advisorInfo", studentAdvisor);
		return "advisor";
	}
}