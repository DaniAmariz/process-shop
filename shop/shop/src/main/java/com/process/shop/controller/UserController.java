package com.process.shop.controller;


import com.process.shop.model.User;
import com.process.shop.service.UserService;
import com.process.shop.service.UserServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("user/id{id}")
    public User getUserById(){
        return userService.getUserById(1L);

    }

}
