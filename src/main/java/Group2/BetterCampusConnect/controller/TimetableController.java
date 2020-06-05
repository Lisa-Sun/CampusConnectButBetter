package Group2.BetterCampusConnect.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;

import Group2.BetterCampusConnect.model.Student;
import Group2.BetterCampusConnect.model.StudentRepository;
import Group2.BetterCampusConnect.model.Schedule;
import Group2.BetterCampusConnect.model.nosql.Course;
import Group2.BetterCampusConnect.model.nosql.CourseRepository;


@Controller
public class TimetableController
{

	@Autowired
	StudentRepository studentRepo;

	@Autowired
	CourseRepository courseRepo;

	@GetMapping("myTimeTable")
	public String goTimeTable(Model model,HttpServletRequest request)
	{
		Student student = new Student();
		Object sessionChecker = request.getSession().getAttribute("userId");
		if(sessionChecker == null) {return "redirect:login";}
		else {student = studentRepo.findByStudentId(sessionChecker.toString());}
	
		Schedule studentSchedule = student.getSchedule();
		
		List<String>monClasses = studentSchedule.getMonday();
		List<String>tuesClasses = studentSchedule.getTuesday();
		List<String>wedClasses = studentSchedule.getWednesday();
		List<String>thursClasses = studentSchedule.getThursday();
		List<String>friClasses = studentSchedule.getFriday();
		
		//Optional<Course> courseFound;
		DateTimeFormatter dateFormat  = DateTimeFormatter.ofPattern("yyyy-MM-dd HH a");
		for(int i = 0; i < monClasses.size(); i++)
		{
			Optional<Course> courseOptionalFound = courseRepo.findById(monClasses.get(i));
			Course course = courseOptionalFound.get();
			String courseName =course.name + course.sectionNumber;
			courseName = courseName + "\n";
			courseName = courseName + course.building;

			LocalDateTime classDate = course.startTime;
			String formattedDate = classDate.format(dateFormat);
			

			DayOfWeek dayOfWeek = classDate.getDayOfWeek();
			String weekdayString = dayOfWeek.toString().toLowerCase();
			weekdayString = weekdayString.substring(0,1).toUpperCase() + weekdayString.substring(1);

			String thymeLeafId = "student" + weekdayString;

			int classStartHour = classDate.getHour();
			String classStringStartHour = Integer.toString(classStartHour);
			if(classStartHour > 12)
			{
				classStartHour = classStartHour - 12;
				classStringStartHour = Integer.toString(classStartHour);
				if (classStartHour >= 8)
				{
					classStringStartHour = classStringStartHour +"p";
				}
			}
			
			thymeLeafId += classStringStartHour;
			thymeLeafId += "Schedule";
			model.addAttribute(thymeLeafId, courseName);
			model.addAttribute("classDate", courseName);

		}
		return "/timetable";
	}
}
