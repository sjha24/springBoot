package com.saurav.SpringAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"ComponentScanTest"})
public class CustomConfiguration {
    @Bean("saurav")
    public Student getStudent(){
        System.out.println("Spring call int config bean of student");
        return new Student("Saurav jha");
    }
    @Bean("subham")
    @Lazy
    public Student getStudent2(){
        System.out.println("Spring call int config bean of student");
        return new Student("Subham Rajput");
    }
}
