package com.process.shop.service;

import com.process.shop.model.User;

import java.util.List;

public interface UserService {

    User createUser(Object user);

    User updateUser(Object userUpdated, Long id);

    User getUserById(Long id);

    List<User> findAllUsers();
    
    
}


