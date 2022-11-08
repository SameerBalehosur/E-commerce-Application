package com.testyantra.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testyantra.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
