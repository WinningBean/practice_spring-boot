package com.example.simple_board.controller;

import com.example.simple_board.service.freeboard.FreeboardInfoService;
import com.example.simple_board.service.freeboard.FreeboardListService;
import com.example.simple_board.service.freeboard.FreeboardWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class FreeboardController {

    @Autowired private FreeboardListService freeboardListService;
    @Autowired private FreeboardWriteService freeboardWriteService;
    @Autowired private FreeboardInfoService freeboardInfoService;

    private int returnIntValue(String stringToInt){
        return Integer.parseInt(stringToInt);
    }

    @GetMapping("/freeboard")
    public String freeboard(){ //@RequestParam(value = "pageNum", defaultValue = "1")String pageNum){
        String page;
//        page = freeboardListService.freeboardList(returnIntValue(pageNum));
        page = freeboardListService.freeboardList();
        return page;
    }

    @PostMapping("/freeboardWriteRequest")
    public String freeboardWriteRequest(@RequestParam Map<String, String> paramMap){
        String title = paramMap.get("title");
        String content = paramMap.get("content");
        String writer = paramMap.get("writer");

        freeboardWriteService.write(title, content, writer);

        return "redirect:/freeboard";
    }

    @GetMapping("freeBoardInfo")
    public String getPost(@RequestParam(value = "freeId")String freeId){
        String page = freeboardInfoService.getFreeboardPost(freeId);
        return page;
    }
}
