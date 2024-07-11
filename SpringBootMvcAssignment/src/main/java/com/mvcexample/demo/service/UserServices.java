package com.mvcexample.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvcexample.demo.entity.User;
import com.mvcexample.demo.repository.UserRepo;

@Service
public class UserServices {
	
	@Autowired
	UserRepo userRepo;
	
	public User registerUser(User user) {
		User temp=userRepo.save(user);
		return temp;
	}
	
	public Integer logInUser(String name,String password) {
	   User user=userRepo.findByUname(name);
	   if(user.getUpassword().equals(password)) {
		   return user.getUid();
	   }
	   return 0;
	   
	}
	
	
}
