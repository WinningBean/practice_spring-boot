package com.example.simple_board.service;

import com.example.simple_board.model.Users;
import com.example.simple_board.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UserPasswordHashClass userPasswordHashClass;

    public String joinUser(String userId, String userPw, String userNm){

        if (userId.equals("") || userPw.equals("") || userNm.equals("")) return "join";

        Users users = new Users();
        users.setUserId(userId);
        users.setUserPw(userPasswordHashClass.getSHA256(userPw));
        users.setUserNm(userNm);

        usersRepository.save(users);
        return "index";
    }
}
