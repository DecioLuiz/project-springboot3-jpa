package com.redcat.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redcat.projectspring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
