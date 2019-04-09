package com.example.user.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.dao.UserMapper;
import com.example.user.dto.User;

@Service
public class UserService {
 
    @Autowired
    UserMapper userMapper;
    
    public List<User> getAll() throws Exception{
        return userMapper.getAll();
    }
    
    public void toSha(User user) throws Exception{
    	userMapper.toSha(user);
    }
    
    public User getProfile(String id) throws Exception{
        return userMapper.getProfile(id);
    }
    
}