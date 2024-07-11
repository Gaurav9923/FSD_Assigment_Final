package com.JavaSpringBootAssignments;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.JavaSpringBootAssignments.Q21_22.entity.User;
import com.JavaSpringBootAssignments.controller.EmployeeController;
import com.JavaSpringBootAssignments.controller.UserController;

@SpringBootApplication
public class JavaSpringBootAssignmentsApplication {
	
	
	
	public static void main(String[] args) {
		  ApplicationContext context= SpringApplication.run(JavaSpringBootAssignmentsApplication.class, args);
		  
		  
		  
		  /*Q21 ==>Create a Spring Boot application that inserts data into a MySQL database table using
			JPA and Hibernate. The application should use Spring Data JPA to map the table to a
			Java object and then insert the data into the table.*/
		EmployeeController emp=  context.getBean(EmployeeController.class);
	    String res = emp.addEmpData();
		System.out.println(res);
		
		
		 /*Q22 ==>Create a Spring Boot application that uses Spring Data JPA to retrieve data from a
				database. The application should have entities for users and orders, and should
				allow for querying orders by user.*/
		
		UserController user=  context.getBean(UserController.class);
		String userResult=user.addUserData();
		System.out.println(userResult);
		
		
		List<User> list=user.getAllUsers();
		System.out.println(list);
		
		
		
		
		
	}
	
	
	
	
	

}
