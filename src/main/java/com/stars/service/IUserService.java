package com.stars.service;

import com.stars.model.User;

public interface IUserService {
    int addUser(User user);
    String LoginUser(String username, String password);
    String SelectUser(String username);
}
