package com.redcat.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redcat.projectspring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
