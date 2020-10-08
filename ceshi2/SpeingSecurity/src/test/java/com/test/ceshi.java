package com.test;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ceshi {
    @Test
    public void test(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String xiaolin = bCryptPasswordEncoder.encode("zhangsan");
        System.out.println(xiaolin);
    }
}
