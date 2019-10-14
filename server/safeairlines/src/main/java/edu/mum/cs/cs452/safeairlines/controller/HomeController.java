package edu.mum.cs.cs452.safeairlines.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value ={"/home", "/"}, method = RequestMethod.GET)
public class HomeController {

    @GetMapping("/")
    public String loadHome(){
        return "home";
    }
}
