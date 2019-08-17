package com.jackiedeng.edu.web.controller;

import com.jackiedeng.education.model.User;
import com.jackiedeng.education.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    public IUserService userService;
    @RequestMapping("findById")
    public String find(Integer id){
        System.out.println("..............");
        User user=userService.findById(id);
        System.out.println(id);
        return null;
    }
}
