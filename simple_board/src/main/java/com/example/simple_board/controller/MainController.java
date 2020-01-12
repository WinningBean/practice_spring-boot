package com.example.simple_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = "/") // method = RequestMethod.POST == @PostMapping
    public String Index(){
        return "index";
    }

    @RequestMapping(value = "/joinPage")
    public String joinPage(){
        return "join";
    }
}