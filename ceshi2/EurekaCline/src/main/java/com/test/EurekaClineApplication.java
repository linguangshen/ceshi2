package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
//@MapperScan("com.com.Dao")
@MapperScan("com.com.Dao")
public class EurekaClineApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClineApplication.class,args);
    }
}
