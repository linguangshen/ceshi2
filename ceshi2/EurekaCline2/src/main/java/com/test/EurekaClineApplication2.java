package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan("com.com.Dao")
@EnableFeignClients(basePackages = "com.com")
@EnableEurekaClient
public class EurekaClineApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClineApplication2.class,args);
    }
}
