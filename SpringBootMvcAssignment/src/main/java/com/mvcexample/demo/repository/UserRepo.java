package com.mvcexample.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvcexample.demo.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	public User findByUname(String name);
	

}
