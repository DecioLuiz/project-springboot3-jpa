package com.redcat.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redcat.projectspring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
