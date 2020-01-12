package com.example.simple_board.service;

import com.example.simple_board.model.Users;
import com.example.simple_board.repository.UsersRepository;

import javax.servlet.http.HttpServletRequest;

public class JoinService {
    public void joinUser(HttpServletRequest request, UsersRepository usersRepository){
        String userId = request.getParameter("user_id");
        String userPw = request.getParameter("user_pw");
        String userNm = request.getParameter("user_nm");

        Users users = new Users();
        users.setUser_id(userId);
        users.setUser_pw(userPw);
        users.setUser_nm(userNm);

        usersRepository.save(users);
    }
}
