package com.cckes.java.DAO;

import com.cckes.java.entity.User;

import java.util.List;

/**
 * Created by alvinyuan on 2017/5/8.
 */
public interface UserDAO {
    int save(User u);
    List<User> findAll();
}
