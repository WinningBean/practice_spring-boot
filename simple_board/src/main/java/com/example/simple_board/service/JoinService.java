package com.example.simple_board.service;

import com.example.simple_board.model.Users;
import com.example.simple_board.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    @Autowired
    private UsersRepository usersRepository;

    public String joinUser(String userId, String userPw, String userNm){

        if (userId.equals("") || userPw.equals("") || userNm.equals("")) return "join";

        Users users = new Users();
        users.setUser_id(userId);
        users.setUser_pw(userPw);
        users.setUser_nm(userNm);

        usersRepository.save(users);
        return "index";
    }
}
