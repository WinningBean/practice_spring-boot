package com.example.simple_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ImageController {
    @GetMapping("/image/feed")
    public String imageFeed(){
        return "image/feed";
    }

    @PostMapping("/image/upload")
    public String imageUpload(){
        return "image/upload";
    }
}
