package com.ssg;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ssg.dao")
public class SMApplication {
    public static void main(String[] args) {

        SpringApplication.run(SMApplication.class,args);
    }
}