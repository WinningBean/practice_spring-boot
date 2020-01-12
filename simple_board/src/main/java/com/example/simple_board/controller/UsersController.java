package com.example.simple_board.controller;

import com.example.simple_board.repository.UsersRepository;
import com.example.simple_board.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

}