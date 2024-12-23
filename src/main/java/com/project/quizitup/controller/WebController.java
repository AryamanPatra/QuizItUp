package com.project.quizitup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index(){
        return "index.html";
    }
    
    @GetMapping("/login")
    public String login(){
        return "login.html";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup.html";
    }

    @GetMapping("/home")
    public String home(){
        return "home.html";
    }

    @GetMapping("/quizcreator")
    public String quiz(){
        return "quizcreator.html";
    }

    

}
