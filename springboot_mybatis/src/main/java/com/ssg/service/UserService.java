package com.ssg.service;

import com.ssg.entity.Message;
import org.springframework.stereotype.Service;


@Service
public interface UserService {

    Message login(String id, String password,int identity);
}
