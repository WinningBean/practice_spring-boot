package com.example.simple_board.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userId;
    private String userPw;
    private String userNm;

}