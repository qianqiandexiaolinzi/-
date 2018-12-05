package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by vickl on 2018/12/3.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    @ResponseBody
    public String HellWorld(){
        return "HELLO WORLD";
    }
    @RequestMapping("en")
    public String hello(){
        return "/user/index";
    }

    @RequestMapping("save")
    @ResponseBody
    public User save(User user){
        return userService.save(user);
    }
}
