package com.stars.service.impl;

import com.stars.mapper.UserMapper;
import com.stars.model.User;
import com.stars.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user)
    {
        return userMapper.addUser(user);
    }
    @Override
    public String LoginUser(String username, String password)
    {
        return userMapper.LoginUser(username,password);
    }
    @Override
    public String SelectUser(String username)
    {
        return userMapper.SelectUser(username);
    }

}
