package com.ssg.dao;

import com.ssg.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

   public List<User> findAll();

}
