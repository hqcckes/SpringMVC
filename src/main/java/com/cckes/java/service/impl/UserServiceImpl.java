package com.cckes.java.service.impl;

import com.cckes.java.DAO.UserDAO;
import com.cckes.java.entity.User;
import com.cckes.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alvinyuan on 2017/5/8.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    private UserDAO userDao;

    @Autowired
    public UserServiceImpl(UserDAO userDAO){
        this.userDao = userDAO;
    }

    public void saveUsers(List<User> us) {
        for (User u:us){
            userDao.save(u);
        }
    }

    public List<User> getAllUsernames() {
        return userDao.findAll();
    }
}
