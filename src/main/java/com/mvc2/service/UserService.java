package com.mvc2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc2.dao.UserDao;
import com.mvc2.model.User;



@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		
		return userDao.saveUser(user);
		
	}
	
	
	

}
