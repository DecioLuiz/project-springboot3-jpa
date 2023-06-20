package com.redcat.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redcat.projectspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
