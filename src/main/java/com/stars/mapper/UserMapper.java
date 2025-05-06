package com.stars.mapper;

import com.stars.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper  {

    int addUser();
    String SelectUser(String username);
    String LoginUser(String username, String password);
}