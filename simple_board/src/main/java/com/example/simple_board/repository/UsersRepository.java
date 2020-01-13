package com.example.simple_board.repository;

import com.example.simple_board.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByUserIdAndUserPw(String userId, String userPw);
}
