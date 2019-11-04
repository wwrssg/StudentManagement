package com.ssg.controller;

import com.ssg.pojo.Student;
import com.ssg.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    // 注入业务对象
    private StudentService studentService;

    // 存储预返回页面的数据对象
    private Map<String, Object> result = new HashMap<>();

    /**
     * 根据学生与班级名查询指定/全部学生信息列表
     */
    @PostMapping("/selectAll")
    @ResponseBody
    public Object selectAllStudent() {
        List<Student> list = studentService.selectAll();
        return list;
    }

    /**
     * 添加学生信息
     */
    /*@PostMapping("/addStudent")
    @ResponseBody
    public Map<String, Object> addStudent(Student student) {
        // 判断学号是否已存在
        if(studentService.findBySno(student) != null) {
            result.put("success", false);
            result.put("msg", "该学号已经存在! 请修改后重试!");
            return result;
        }
        // 添加学生信息
        if (studentService.insert(student) > 0) {
            result.put("success", true);
        } else {
            result.put("success", false);
            result.put("msg", "添加失败! (ಥ_ಥ)服务器端发生异常!");
        }

        return result;
    }*/

    /**
     * 根据id修改指定的学生信息
     */
    @PostMapping("/editStudent")
    @ResponseBody
    public Map<String, Object> editStudent(Student student) {
        if (studentService.update(student) > 0) {
            result.put("success", true);
        } else {
            result.put("success", false);
            result.put("msg", "添加失败! (ಥ_ಥ)服务器端发生异常!");
        }
        return result;
    }

    /**
     * 根据id删除指定的学生信息
     */
    @PostMapping("/deleteStudent")
    @ResponseBody
    public Map<String, Object> deleteStudent(@RequestParam(value = "ids[]", required = true) Integer[] ids) {

        if (studentService.deleteById(ids) > 0) {
            result.put("success", true);
        } else {
            result.put("success", false);
        }
        return result;
    }

}
