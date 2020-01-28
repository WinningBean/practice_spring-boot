package com.example.simple_board.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fileName;
    private String filePath;
//    @ManyToOne
//    @JoinColumn(name = "userId")
//    @JsonIgnoreProperties({"passworf"})
//    private Users user;
}
