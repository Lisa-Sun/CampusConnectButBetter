package Group2.BetterCampusConnect.controller;


import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Group2.BetterCampusConnect.model.Student;
import Group2.BetterCampusConnect.model.StudentRepository;

@Controller
public class StudentInfoController {
	
	@Autowired
	private StudentRepository repo;
	public StudentInfoController() {}
	
    @GetMapping("/studentinfo")
    public String getStudentinfo(Model model, @RequestParam String id, HttpServletRequest request) {
    	Object sessionChecker = request.getSession().getAttribute("userId");
		if (sessionChecker == null) {
			return "redirect:login";
		} 
		/*Use this line as current user's id:*/
		//String id = request.getSession().getAttribute("userId").toString();
    	Student students = repo.findByStudentId(id);
    	model.addAttribute("studentVar",students);
        return "/studentinfo";
    }
    
    
    @PostMapping(path="/studentinfo")
    public String updateUser(@ModelAttribute("studentVar") Student stu,BindingResult bindresult) {
    	repo.save(stu);
        return "redirect:/studentinfo?id="+stu.getstudentId();
    }

    @GetMapping("/accountbalance")
    public String getaccountbalance(Model model, @RequestParam String id, HttpServletRequest request) {
    	Object sessionChecker = request.getSession().getAttribute("userId");
		if (sessionChecker == null) {
			return "redirect:login";
		} 
		/*Use this line as current user's id:*/
		//String id = request.getSession().getAttribute("userId").toString();
    	Student students = repo.findByStudentId(id);
    	model.addAttribute("studentVar",students);
        return "/accountbalance";
    }
    
    @PostMapping(path="/accountbalance")
    public String updateAccountBalance(BigDecimal amount,String id) {
    	Student students = repo.findByStudentId(id);
    	BigDecimal oldAmount = students.getaccountbalance();
    	BigDecimal amountPaid = amount;
    	students.setaccountbalance(oldAmount.subtract(amountPaid));
    	repo.save(students);
        return "redirect:/accountbalance?id="+id;
    }
}	