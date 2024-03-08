package com.process.shop.service;

import com.process.shop.model.User;

import java.util.List;

public class UserServicelmpl implements UserService{


    @Override
    public User  createUser(Object user) {
        return new User();
    }

    @Override
    public User  updateUser(Object userUpdated, Long id) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

}
