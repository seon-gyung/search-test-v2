package site.metacoding.searchproject.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import site.metacoding.searchproject.domain.boardTbl.BoardTbl2;
import site.metacoding.searchproject.domain.boardTbl.BoardTbl2Repository;

@Controller
public class BoardTbl2Controller {
    
    private BoardTbl2Repository boardTbl2Repository;

    public BoardTbl2Controller(BoardTbl2Repository boardTbl2Repository){
        this.boardTbl2Repository = boardTbl2Repository;
    }

    @GetMapping("/search")
    public String search(Model model){
        List<BoardTbl2> boards = boardTbl2Repository.findAll();
        model.addAttribute("boards", boards);
        return "home";
    }
}
