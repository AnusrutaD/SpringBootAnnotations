package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
//@ComponentScan(basePackages = {"com.mypack"})
public class MyConfig {

    @Bean("Student1")
    public Student getStudent(){
//        System.out.println("Creating new Student");
        return new Student("student1");
    }

    @Bean("student2")
    public Student createStudent(){
//        System.out.println("Creating new Student");
        return new Student("student2");
    }

    @Bean
    public Date getDate(){
        System.out.println("Creating new Date");
        return new Date();
    }
}
