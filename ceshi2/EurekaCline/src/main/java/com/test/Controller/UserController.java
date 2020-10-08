package com.test.Controller;

import com.test.Service.UserService;
import com.test.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{userName}")
    public User qureyOne(@PathVariable("userName") String userName){
        User user = userService.queryOne(userName);
        return user;
    }
}
