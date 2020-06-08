package Group2.BetterCampusConnect.controller;

import Group2.BetterCampusConnect.model.nosql.CourseOverviewRepository;
import Group2.BetterCampusConnect.model.nosql.LoginData;
import Group2.BetterCampusConnect.model.nosql.LoginRepository;
import Group2.BetterCampusConnect.model.Student;
import Group2.BetterCampusConnect.model.StudentRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.Optional;
import java.util.Random;
import javax.naming.spi.ObjectFactory;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@SessionAttributes("userId")
@Controller
public class LoginController
{

	@Autowired
	LoginRepository loginData;

	@Autowired
	private StudentRepository studentRepo;

	
	@RequestMapping(value = "/login", method = RequestMethod.GET, params = "action=LOGOUT")
	public String logout(HttpServletRequest request, HttpServletResponse response, SessionStatus status )
	{
		status.setComplete();
		    request.getSession().invalidate();

		try
		{
			request.logout();
		
			return "logout";

		}
		catch(Exception e)
		{
			return "ErrorPage";
		}
		//Object sessionChecker = request.getSession().getAttribute("userId");
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST, params="action=Login")
	public String loginGeneral(
			@RequestParam(name = "username", required = true, defaultValue = "")String username, 
			@RequestParam(name = "password", required = true, defaultValue = "")String password,
			Model model, HttpServletResponse httpResponse )
	{
		
		Optional<LoginData> login = loginData.findByLogin(username, password);
		if(login.isPresent()) {
			model.addAttribute("userId",login.get().id);
			return "redirect:StudentProfile?id="+login.get().id;
		}else {
			model.addAttribute("valid", false);
			model.addAttribute("userExists", true);
			model.addAttribute("missingInput", true);
			return "login";
		}
		
	}

	@RequestMapping(value = "/login", method=RequestMethod.POST, params="action=Register")
	public String loginGeneral(
			@RequestParam(name = "username", required = true, defaultValue = "")String username, 
			@RequestParam(name = "password", required = true, defaultValue = "")String password,
			@RequestParam(name = "repeatPassword", required = true, defaultValue = "")String repeatPassword, 
			@RequestParam(name = "studentFirstName", required = true, defaultValue = "")String firstName,
			@RequestParam(name = "studentLastName", required = true, defaultValue = "")String lastName,
			@RequestParam(name = "major", required = true, defaultValue = "")String major,
			Model model, HttpServletResponse httpResponse )
	{
		Optional<LoginData> login = loginData.findById(username);
		if(login.isPresent()) {
			System.out.println("LKDSF");
			model.addAttribute("valid", true);
			model.addAttribute("userExists", false);
			model.addAttribute("missingInput", true);
			return "login";


		}
		else if("".equals(username) || "".equals(password)|| "".equals(firstName)|| "".equals(lastName) || "".equals(repeatPassword) || "".equals(major))
		{
						System.out.println("LKDSF_1");

			model.addAttribute("valid", true);
			model.addAttribute("userExists", true);
			model.addAttribute("missingInput", false);
			return "login";

		}
		else
		{
						System.out.println("LKDSF_2");

			Random rand = new Random();
			int id = rand.nextInt(900);
			while(loginData.findById(Integer.toString(id)).isPresent())
			{
				id = rand.nextInt(900);
			}
			loginData.save(new LoginData(Integer.toString(id), false, username,"",password));
			Student newStudent = new Student();
			newStudent.setfirstName(firstName);
			newStudent.setlastName(lastName);
			newStudent.setemail(username);
			newStudent.setpwd(password);
			newStudent.setemail(username);
			newStudent.setstudentId(Integer.toString(id));
			newStudent.setmajor(major);
			newStudent.setminor("");
			newStudent.setdegreelevel("");
			double gpa = 0.0;
			newStudent.setgpa(new BigDecimal(gpa));
			newStudent.setaccountbalance(new BigDecimal(gpa));
			studentRepo.save(newStudent);


			model.addAttribute("userId", Integer.toString(id));
			System.out.println("LKDSF_4");

			return "redirect:StudentProfile?id="+Integer.toString(id);

		}
				
	}

	 @GetMapping("/login")
	    
    public String login(Model model) {
    	model.addAttribute("valid", true);
    	model.addAttribute("userExists", true);
    	model.addAttribute("missingInput", true);
        return "login";
    }



}