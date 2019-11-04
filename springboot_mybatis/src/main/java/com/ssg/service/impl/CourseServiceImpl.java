package com.ssg.service.impl;

import com.ssg.dao.CourseMapper;
import com.ssg.pojo.Course;
import com.ssg.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Adminstrator
 */
@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> getAllCourse() {
        return courseMapper.getAllCourse();
    }

    @Override
    public Course getCourseById(Integer cNo) {
        return courseMapper.getCourseById(cNo);
    }

    @Override
    public void createCourse(Course course) {
        courseMapper.createCourse(course);
    }

    @Override
    public void deleteCourse(String where) {
        courseMapper.deleteCourse(where);
    }

    @Override
    public void updateCourse(Course course) {
        courseMapper.updateCourse(course);
    }

}
