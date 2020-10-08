package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.test.dao")
public class DoubleApplication {
    public static void main(String[] args) {
        SpringApplication.run(DoubleApplication.class,args);
    }
}
