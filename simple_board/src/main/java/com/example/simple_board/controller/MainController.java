package com.example.simple_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @GetMapping(value = "/") // method = RequestMethod.POST == @PostMapping
    public String Index(){
        return "index";
    }

    @RequestMapping(value = "/joinPage")
    public String joinPage(){
        return "join";
    }

    @RequestMapping(value = "loginPage")
    public String loginPage(){
        return "login";
    }
}