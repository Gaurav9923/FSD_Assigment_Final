package com.JavaSpringBootAssignments.Q21_22.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
public class Employee {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	Integer id;
	
	String name;
	String address;
	Integer age;
	
	
}
