package com.stars.service;

public interface IUserService {
    int addUser();
    String LoginUser(String username, String password);
    String SelectUser(String username);
}
