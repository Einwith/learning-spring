package com.frankmoley.lil.learningspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CourseApiApp {

    public static void main(String[] args) {

        SpringApplication.run(CourseApiApp.class, args);
    }
}
