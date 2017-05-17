package com.cckes.java.controller;


import com.cckes.java.entity.User;
import com.cckes.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    private UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("")
    public String home() {
//        List<User> us = new ArrayList<User>();
//        User u = new User();
//        u.setUsername("AlvinYuan");
//        us.add(u);
//        u = new User();
//        u.setUsername("Mark");
//        us.add(u);
//        userService.saveUsers(us);
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<User> json() {
        return userService.getAllUsernames();
    }
}