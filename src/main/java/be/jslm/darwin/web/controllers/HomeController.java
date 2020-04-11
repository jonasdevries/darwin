package be.jslm.darwin.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/activities")
    public String activities(){
        return "activities";
    }

    @GetMapping("/createActivity")
    public String createActivity(){
        return "createActivity";
    }

    @GetMapping("/members")
    public String members(){
        return "members";
    }

}
