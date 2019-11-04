package com.ssg.service.impl;

import com.ssg.dao.CourseMapper;
import com.ssg.dao.ScoreMapper;
import com.ssg.pojo.Score;
import com.ssg.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Adminstrator
 */
@Service
@Transactional
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public List<Score> getAllScore() {
        return scoreMapper.getAllScore();
    }

    @Override
    public Score getScoreById(Integer sNo) {
        return scoreMapper.getScoreById(sNo);
    }

    @Override
    public void createScore(Score score) {
        scoreMapper.createScore(score);
    }

    @Override
    public void deleteScore(String where) {
        scoreMapper.deleteScore(where);
    }

    @Override
    public void updateScore(Score score) {
        scoreMapper.updateScore(score);
    }
}
