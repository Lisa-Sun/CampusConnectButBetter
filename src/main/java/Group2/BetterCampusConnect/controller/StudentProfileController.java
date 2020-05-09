package Group2.BetterCampusConnect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentProfileController {


    @GetMapping("/StudentProfile")
    public String login(Model model) {
    
        return "StudentProfile";
    }


}