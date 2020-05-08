package Group2.BetterCampusConnect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StartController {

    @GetMapping("/hello")
    public String greeting1(Model model) {
        model.addAttribute("name", "Charlie");
        return "greeting";
    }
    
    @GetMapping("/login")
    public String login(Model model) {
    
        return "login";
    }

     @GetMapping("/hello1")
    public String greeting2(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}