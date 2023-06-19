package com.redcat.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redcat.projectspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
