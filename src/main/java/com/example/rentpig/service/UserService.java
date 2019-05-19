package com.example.rentpig.service;

import com.example.rentpig.entity.User;
import com.example.rentpig.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(String usermail){
        return userMapper.getUser(usermail);
    }

    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }

    @Transactional
    public void addUser(User user){
        userMapper.addUser(user);
    }

    @Transactional
    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    @Transactional
    public void  deleteUser(String usermail){
        userMapper.deleteUser(usermail);
    }
}
