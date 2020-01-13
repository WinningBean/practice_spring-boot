package com.example.simple_board.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "freeboard")
public class Freeboard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "freeId")
    private Long freeId;

    @Column(name = "writer")
    private String writer;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

//    @Column(name = "writeTime")
//    private LocalTime writeTime;
}
