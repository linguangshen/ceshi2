package com.test.Controller;

import com.test.User;
import com.test.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserFeign userFeign;

    @RequestMapping("/user/{username}")
    public User query(@PathVariable("username") String userName){
        String i =userName;
        return userFeign.qureyOne(userName);
    }
}
