package com.ssg.controller;

import com.ssg.pojo.Course;
import com.ssg.service.CourseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Adminstrator
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/select")
    public Object selectAllCourse() {
        List<Course> list = courseService.getAllCourse();
        return list;
    }

    @RequestMapping("/update")
    public Object updateCourse(@Param("cno") Integer cNo) {
        Course course = courseService.getCourseById(cNo);
        return course;
    }

    @RequestMapping("/create")
    public String createCourse(@Param("course") Course course) {
        courseService.createCourse(course);
        return "forward:/course/create";
    }

    @RequestMapping("/delete")
    public String deleteCourse(@Param("course") String where) {
        courseService.deleteCourse(where);
        return "forward:/course/delete";
    }

}
