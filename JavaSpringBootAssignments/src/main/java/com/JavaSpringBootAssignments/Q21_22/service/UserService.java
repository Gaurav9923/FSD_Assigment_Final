package com.JavaSpringBootAssignments.Q21_22.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JavaSpringBootAssignments.Q21_22.entity.User;
import com.JavaSpringBootAssignments.repository.UserRepo;

@Service
public class UserService {
	
	UserRepo userRepo;
	
	@Autowired
	public UserService(UserRepo userRepo) {
		this.userRepo=userRepo;
	}

	public String addUser(User user) {
		User temp=userRepo.save(user);
		if(temp!=null) {
			return "User added";
		}
		return "User Not added";
	}
	
	
	public List<User> getAllUser() {
		List<User> temp=userRepo.findAll();
		if(temp!=null) {
			return temp;
		}
		System.out.println("No User Found");
		return null;
	}
}
