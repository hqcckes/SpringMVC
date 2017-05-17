package com.cckes.java.service;

import com.cckes.java.entity.User;

import java.util.List;

/**
 * Created by alvinyuan on 2017/5/8.
 */
public interface UserService {

    void saveUsers(List<User> us);
    List<User> getAllUsernames();
}
