package com.mvcexample.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvcexample.demo.entity.Products;
import com.mvcexample.demo.entity.User;

public interface ProductRepo extends JpaRepository<Products, Integer> {
	public List<Products> findByUserFk(User userFk);
	 public Products findByPid(Integer pid);
}
