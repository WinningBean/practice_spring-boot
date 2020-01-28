package com.example.simple_board.service.freeboard;

import com.example.simple_board.model.Freeboard;
import com.example.simple_board.repository.FreeboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FreeboardWriteService {

    @Autowired
    FreeboardRepository freeboardRepository;

    public void write(String title, String content, String writer){
        Freeboard freeboard = new Freeboard();
        freeboard.setTitle(title);
        freeboard.setContent(content);
        freeboard.setWriter(writer);
        LocalDateTime dateTime = LocalDateTime.now();
        freeboard.setCreatedDate(dateTime);
        freeboard.setModifiedDate(dateTime);
        freeboardRepository.save(freeboard);
    }
}
