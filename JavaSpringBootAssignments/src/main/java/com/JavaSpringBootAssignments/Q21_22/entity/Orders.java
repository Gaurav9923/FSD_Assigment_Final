package com.JavaSpringBootAssignments.Q21_22.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Orders {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	Integer id;
	
	String item;
	
	
	
	
}
