package com.ssg.controller;

import com.alibaba.fastjson.JSON;
import com.ssg.entity.Message;
import com.ssg.pojo.User;
import com.ssg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(@RequestParam(value = "uid", required = false, defaultValue = "null")String id,
                        @RequestParam(value = "pwd",required = false,defaultValue = "null") String password,
                        @RequestParam(value = "ity",required = false,defaultValue = "null") int identity){

        Message message= userService.login(id,password,identity);
        return JSON.toJSONString(message);
    }

}
