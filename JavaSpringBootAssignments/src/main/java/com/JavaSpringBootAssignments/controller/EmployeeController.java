package com.JavaSpringBootAssignments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.JavaSpringBootAssignments.Q21_22.entity.Employee;
import com.JavaSpringBootAssignments.Q21_22.service.EmplyeeService;


@Controller
public class EmployeeController {
	
	
	EmplyeeService emplyeeService;
	
	
	
	public EmployeeController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public EmployeeController(EmplyeeService emplyeeService) {
		this.emplyeeService=emplyeeService;
	}
	
	
	public String addEmpData() {
		
		Employee emp=Employee.builder().name("Gaurav").address("MH").age(22).build();
		String result=emplyeeService.addEmployee(emp);
		return result;
	}
	
	
	
}
