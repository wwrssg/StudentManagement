package com.ssg.service;

import com.ssg.pojo.Score;

import java.util.List;

/**
 * @author Adminstrator
 */
public interface ScoreService {

    List<Score> getAllScore();

    // 查询一条
    Score getScoreById(Integer sNo);

    // 添加
    void createScore(Score score);

    // 删除
    void deleteScore(String where);

    // 修改
    void updateScore(Score score);

}
