package com.ssg.dao;

import com.ssg.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface StudentMapper {

   public Student login(String SNO);

   // 根据班级与学生名获取指定或全部学生信息列表
   List<Student> selectAll();

   // 根据学号查询指定学生信息
   Student findBySno(Integer sNo);

   // 添加班级信息
   int insert(Student student);

   // 根据id修改指定学生信息
   int update(Student student);

   // 根据id删除指定学生信息
   int deleteById(Integer[] ids);

}
