package com.ssg.service.impl;

import com.ssg.dao.StudentMapper;
import com.ssg.dao.TeacherMapper;
import com.ssg.entity.Message;
import com.ssg.pojo.Student;
import com.ssg.pojo.Teacher;
import com.ssg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Message login(String id, String password,int identity) {
        //1是老师 2是学生
        if(identity==1){
            Message message=new Message();
            Teacher dataBaseTeacher=teacherMapper.login(id);
            if(dataBaseTeacher.getTPWD().equals(password)){
                //登陆成功
                message.setFlag(true);
                message.setObject(dataBaseTeacher);
                message.setState(dataBaseTeacher.getTNAME()+" 登陆成功！");
                return message;
            }else{
                message.setFlag(false);
                message.setObject(dataBaseTeacher);
                message.setState("登录失败，请重试");
                return message;
            }
        }else if(identity==2){
            Message message=new Message();
            Student dataBaseStudent=studentMapper.login(id);
            if(dataBaseStudent.getSPWD().equals(password)){
                //登陆成功
                message.setFlag(true);
                message.setObject(dataBaseStudent);
                message.setState(dataBaseStudent.getSNAME()+" 登陆成功！");
                return message;
            }else{
                message.setFlag(false);
                message.setObject(dataBaseStudent);
                message.setState("登录失败，请重试");
                return message;
            }
        }else{
            Message message=new Message();
            message.setFlag(false);
            message.setObject(null);
            message.setState("请使用老师或者学生的账号登录");
            return message;
        }
    }


}
