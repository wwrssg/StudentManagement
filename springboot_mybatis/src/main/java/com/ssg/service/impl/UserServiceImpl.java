package com.ssg.service.impl;

import com.ssg.dao.UserMapper;
import com.ssg.pojo.User;
import com.ssg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return  userMapper.findAll();
    }
}
