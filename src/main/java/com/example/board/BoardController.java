package com.example.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
    @RequestMapping("/board/list")
    public String boardlist(){
        return "boardlist";
    }
}
