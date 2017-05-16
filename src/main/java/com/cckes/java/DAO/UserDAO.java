package com.cckes.java.DAO;

import com.cckes.java.entity.User;

import java.util.List;

/**
 * Created by alvinyuan on 2017/5/8.
 */
public interface UserDAO {
    public int save(User u);
    public List<User> findAll();
}
