package com.JavaSpringBootAssignments.Q21_22.entity;

import java.util.Set;

import org.springframework.data.repository.cdi.Eager;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class User {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	Integer id;
	
	String userName;
	String userAddress;
	Integer userAge;
	
	@OneToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)		
	Set<Orders> ordersFk;
	

    
   
	
	
}
