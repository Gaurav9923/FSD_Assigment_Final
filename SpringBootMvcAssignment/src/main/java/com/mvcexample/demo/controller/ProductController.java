package com.mvcexample.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvcexample.demo.entity.Products;
import com.mvcexample.demo.service.ProductServices;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductServices productServices;
	
	@PostMapping("/addProduct/{userId}")
	public String  addProduct(@RequestBody Products product,@PathVariable("userId")Integer userId) {
	 boolean res= productServices.createProduct(product, userId);	
	 if(res)
		 return "product added";
	 else
		 return "product Not added";
		
	}
	
	@GetMapping("/getAllProducts/{userId}")
	public ResponseEntity<?> getAllProductsByUserId(@PathVariable("userId") Integer userId){
		List<Products> res=productServices.fetchAllProductsByUser(userId);
		
		if(res==null) {
			return new ResponseEntity<String>("Not Found",HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Products>>(res,HttpStatus.OK);
	}
	
	@GetMapping("/getProduct/{productId}")
	public ResponseEntity<?> getProductsByProductId(@PathVariable("productId") Integer productId){
		System.out.println(productId);
		
		Products res=productServices.fetchProduct(productId);
		System.out.println(res);
		
		if(res==null) {
			return new ResponseEntity<String>("Not Found",HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Products>(res,HttpStatus.OK);
	}
	
	
	@PutMapping("/updateProduct")
	public ResponseEntity<?> updateProduct(@RequestBody Products product){
		boolean res=productServices.updateProduct(product);
		
		if(!res) {
			return new ResponseEntity<String>("Not Updated",HttpStatus.CONFLICT);
		}
		return new ResponseEntity<String>("Updated",HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteProduct/{pid}")
	public ResponseEntity<?> deleteProduct(@PathVariable Integer pid){
		System.out.println(pid);
		boolean res=productServices.deleteProduct(pid);
		
		if(!res) {
			return new ResponseEntity<String>("Not Deleted",HttpStatus.CONFLICT);
		}
		return new ResponseEntity<String>("Deleted",HttpStatus.OK);
	}

}
