package com.rohitk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohitk.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
