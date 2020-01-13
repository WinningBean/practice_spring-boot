package com.example.simple_board.controller;

import com.example.simple_board.service.JoinService;
import com.example.simple_board.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class UsersController {

    @Autowired
    private JoinService joinService;

    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/joinRequest")
    public String joinRequest(@RequestParam Map<String, String> paramMap){
        String userId = paramMap.get("user_id");
        String userPw = paramMap.get("user_pw");
        String userNm = paramMap.get("user_nm");

        return joinService.joinUser(userId, userPw, userNm);
    }

    @PostMapping(value = "/loginRequest")
    public String loginRequest(@RequestParam Map<String, String> paramMap){
        String userId = paramMap.get("user_id");
        String userPw = paramMap.get("user_pw");

        return loginService.login(userId, userPw);
    }
}