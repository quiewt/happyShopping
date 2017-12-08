package com.wbz.service;

import com.wbz.entity.User;

import java.util.List;

/**
 * Created by wei on 2016/10/7.
 */
public interface UserService {
    public List<User> getAllUsers();

    public User login(String name,String password);



}
