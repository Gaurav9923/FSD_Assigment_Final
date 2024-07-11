package com.JavaSpringBootAssignments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JavaSpringBootAssignments.Q21_22.entity.Employee;
import com.JavaSpringBootAssignments.Q21_22.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
