package com.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "EurekaCline")
public interface UserFeign {
    @RequestMapping("/user/user/{userName}")
    public User qureyOne(@PathVariable("userName") String userName);
}
