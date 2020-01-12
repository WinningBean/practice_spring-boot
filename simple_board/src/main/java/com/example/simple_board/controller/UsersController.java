package com.example.simple_board.controller;

import com.example.simple_board.repository.UsersRepository;
import com.example.simple_board.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private JoinService joinService;

    @PostMapping(value = "/joinRequest")
    public String joinRequest(@RequestParam Map<String, String> paramMap){
        String userId = paramMap.get("user_id");
        String userPw = paramMap.get("user_pw");
        String userNm = paramMap.get("user_nm");

        joinService.joinUser(userId, userPw, userNm);

        return "index";
    }

}