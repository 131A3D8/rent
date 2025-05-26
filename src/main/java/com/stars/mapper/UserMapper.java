package com.stars.mapper;

import com.stars.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper  {

    int addUser(User user);//添加用户
    String SelectUser(String username);//查询用户
    String LoginUser(String username, String password);//登录
}