package com.ssg.dao;

import com.ssg.pojo.Course;
import com.ssg.pojo.Score;

import java.util.List;

/**
 * @author Adminstrator
 */
public interface ScoreMapper {

    List<Score> getAllScore();

    Score getScoreById(Integer sNo);

    void createScore(Score score);

    void deleteScore(String where);

    void updateScore(Score score);

}
