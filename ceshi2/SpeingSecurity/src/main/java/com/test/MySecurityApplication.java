package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableEurekaClient
@EnableFeignClients(basePackages = "com.com")
public class MySecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySecurityApplication.class,args);
    }
}
