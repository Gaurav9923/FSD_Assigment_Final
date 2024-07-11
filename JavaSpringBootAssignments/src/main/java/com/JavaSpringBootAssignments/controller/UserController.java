package com.JavaSpringBootAssignments.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.JavaSpringBootAssignments.Q21_22.entity.Employee;
import com.JavaSpringBootAssignments.Q21_22.entity.Orders;
import com.JavaSpringBootAssignments.Q21_22.entity.User;
import com.JavaSpringBootAssignments.Q21_22.service.EmplyeeService;
import com.JavaSpringBootAssignments.Q21_22.service.UserService;


@Controller
public class UserController {
	
	
	
	UserService userService;
	
	public UserController() {
		
	}

	@Autowired
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	
	
	
	public String addUserData() {
		Set<Orders>tempOrder=new HashSet<>();
		Orders o1=new Orders();
		o1.setItem("MOBILE");
		Orders o2=new Orders();
		o2.setItem("Laptop");
		Orders o3=new Orders();
		o3.setItem("Desktop");
		
		tempOrder.add(o1);
		tempOrder.add(o2);
		tempOrder.add(o3);
		
		User user=new User();
		user.setUserName("Gaurav");
		user.setUserAge(22);
		user.setUserAddress("MH11");
		user.setOrdersFk(tempOrder);
		
		String res=userService.addUser(user);
		
		return res;
	}
	
	
	public List<User> getAllUsers(){
		
		List<User>lis=userService.getAllUser();
		return lis;
	}

	}
