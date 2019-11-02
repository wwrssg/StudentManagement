package com.ssg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class SendMail {

    @Autowired
    private JavaMailSender jms; //自动注入的Bean

    @Scheduled(cron = "30 7 20 ? * *")
    @RequestMapping("/send")
    @ResponseBody
    public String sendMail() {
//        JavaMailSenderImpl jms = new JavaMailSenderImpl();
        //建立邮件消息
        SimpleMailMessage mainMessage = new SimpleMailMessage();
        //发送者
        mainMessage.setFrom("wwrssg@qq.com");
        //接收者
        mainMessage.setTo("sun_sg@suixingpay.com");
        //发送的标题
        mainMessage.setSubject("测试邮件");
        //发送的内容
        mainMessage.setText("这是邮件");
        jms.send(mainMessage);
        return "已发送邮件！";
    }
}