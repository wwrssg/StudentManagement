package com.ssg.service.impl;

import com.ssg.dao.StudentMapper;
import com.ssg.pojo.Student;
import com.ssg.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-03 14:39
 *
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    //注入Mapper接口对象
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public Student findBySno(Integer sNo) {
        return studentMapper.findBySno(sNo);
    }

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int deleteById(Integer[] ids) {
        return studentMapper.deleteById(ids);
    }

}
