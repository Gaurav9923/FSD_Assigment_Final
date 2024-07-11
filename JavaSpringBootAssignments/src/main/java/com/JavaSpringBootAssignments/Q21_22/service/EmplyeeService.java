package com.JavaSpringBootAssignments.Q21_22.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JavaSpringBootAssignments.Q21_22.entity.Employee;
import com.JavaSpringBootAssignments.repository.EmployeeRepo;

@Service
public class EmplyeeService {
	

	EmployeeRepo empRepo;
	
	@Autowired
    public EmplyeeService(EmployeeRepo empRepo) {
        this.empRepo = empRepo;
        
    }
	
	
	public String addEmployee(Employee emp) {
		
		Employee res=empRepo.save(emp);
		if(res!=null) {
			return "Employee saved to database";
		}
		return "Employee Not saved to database";
	}
}
