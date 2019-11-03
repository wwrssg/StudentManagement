package com.ssg.dao;

import com.ssg.pojo.Student;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface StudentMapper {

   public Student login(String SNO);

}
