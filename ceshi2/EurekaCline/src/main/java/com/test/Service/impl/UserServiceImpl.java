package com.test.Service.impl;

import com.test.Dao.UserMapper;
import com.test.Service.UserService;
import com.test.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryOne(String userName) {
        return userMapper.queryOne(userName);
    }
}
