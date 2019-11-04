package com.ssg.service;

import com.ssg.pojo.Course;

import java.util.List;

/**
 * @author Adminstrator
 */
public interface CourseService {

    // 查询多条
    List<Course> getAllCourse();

    // 查询一条
    Course getCourseById(Integer cNo);

    // 添加
    void createCourse(Course course);

    // 删除
    void deleteCourse(String where);

    // 修改
    void updateCourse(Course course);

}
