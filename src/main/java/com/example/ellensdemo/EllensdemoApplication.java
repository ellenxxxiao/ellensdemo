package com.example.ellensdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.ellensdemo.mapper")
public class EllensdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EllensdemoApplication.class, args);
    }

}
