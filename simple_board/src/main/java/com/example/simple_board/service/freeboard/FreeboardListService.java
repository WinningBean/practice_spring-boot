package com.example.simple_board.service.freeboard;

import com.example.simple_board.model.Freeboard;
import com.example.simple_board.repository.FreeboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class FreeboardListService {

    @Autowired
    private FreeboardRepository freeboardRepository;

    @Autowired
    private HttpSession session;

//    public String freeboardList(int pageNum){
//        PageRequest pageRequest = PageRequest.of(pageNum-1, 10, Sort.Direction.DESC, "freeId");
//        Page<Freeboard> freeboardPage = freeboardRepository.findAll(pageRequest);
//
//        if (freeboardPage.getSize() == 0){
//            session.setAttribute("boardList", new ArrayList<Freeboard>());
//            return "feeboard";
//        }
//        List<Freeboard> freeboardList = freeboardPage.getContent();
//        session.setAttribute("boardList", freeboardList);
//        return


    public String freeboardList()
    {
        List<Freeboard> freeboardList = freeboardRepository.findAll();
        session.setAttribute("boardList", freeboardList);
        return "freeboard";
    }
}
