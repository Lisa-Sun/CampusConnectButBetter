package Group2.BetterCampusConnect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("userId")
@Controller
public class StartController {

    @GetMapping("/hello")
    public String greeting1(Model model) {
        
        return "greeting";
    }
    
   
     @GetMapping("/hello1")
    public String greeting2(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}