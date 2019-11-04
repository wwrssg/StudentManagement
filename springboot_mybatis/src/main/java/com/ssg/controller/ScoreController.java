package com.ssg.controller;

import com.ssg.pojo.Score;
import com.ssg.service.ScoreService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Adminstrator
 */
@RestController
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @RequestMapping("/select")
    public Object selectAllScore() {
        List<Score> list = scoreService.getAllScore();
        return list;
    }

    @RequestMapping("/update")
    public Object updateScore(@Param("sNo") Integer sNo) {
        Score score = scoreService.getScoreById(sNo);
        return score;
    }

    @RequestMapping("/create")
    public String createScore(@Param("score") Score score) {
        scoreService.createScore(score);
        return "forward:/score/create";
    }

    @RequestMapping("/delete")
    public String deleteScore(@Param("score") String where) {
        scoreService.deleteScore(where);
        return "forward:/score/delete";
    }

}
