package Group2.BetterCampusConnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Group2.BetterCampusConnect.model.Student;
import Group2.BetterCampusConnect.model.StudentRepository;

@Controller
public class StudentProfileController {


	@Autowired
	private StudentRepository repo;
	public StudentProfileController() {}
	
    @GetMapping("/StudentProfile")
    public String getStudentProfile(Model model, @RequestParam String id) {
    	Student students = repo.findByStudentId(id);
    	model.addAttribute("Student",students);
        return "/StudentProfile";
    }


}