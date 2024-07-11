package com.mvcexample.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.mvcexample.demo.entity.Products;
import com.mvcexample.demo.entity.User;
import com.mvcexample.demo.repository.ProductRepo;
import com.mvcexample.demo.repository.UserRepo;

@Service
public class ProductServices {
	@Autowired
	ProductRepo productRepo;
	@Autowired
	UserRepo userRepo;
		
	public boolean createProduct(Products product,Integer userId) {
		Optional<User> user=userRepo.findById(userId);
		product.setUserFk(user.get());
		Products res=productRepo.save(product);
		if(res!=null) {
			return true;
		}
		return false;
	}
	
	public boolean updateProduct(Products updateProduct) {
		Optional<Products> oldProduct=	productRepo.findById(updateProduct.getPid());
		oldProduct.get().setPname(updateProduct.getPname());
		
		Products res=productRepo.save(oldProduct.get());
		
		if(res!=null)
			return true;
		else
			return false;
	}
	
	public boolean deleteProduct(Integer pid) {
		Optional<Products> product=	productRepo.findById(pid);
		productRepo.delete(product.get());
		
		Optional<Products> res=	productRepo.findById(pid);
		
		if(res.isEmpty())
			return true;
		else
			return false;
	}
	
	public List<Products> fetchAllProductsByUser(Integer uid){
		Optional<User> user=userRepo.findById(uid);
		
		List<Products> lis=productRepo.findByUserFk(user.get());
		
		return lis;
	}
	
	public Products fetchProduct(Integer pid){
		Optional<Products> productOp=productRepo.findById(pid);		
		System.out.println(productOp.get());
		return productOp.get();
	}
	
	
		
		
	

}
