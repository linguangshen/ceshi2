package com.test.Dao;

import com.test.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {

    @Select("select * from tb_user where username=#{username}")
    public User queryOne(String username);
}
