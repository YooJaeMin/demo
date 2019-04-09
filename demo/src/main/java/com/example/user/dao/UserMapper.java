package com.example.user.dao;

import java.util.List;

import com.example.user.dto.User;

public interface UserMapper {
	
	public List<User> getAll() throws Exception;
	
	public void toSha(User user) throws Exception;
	
	public User getProfile(String id) throws Exception;
	
}
