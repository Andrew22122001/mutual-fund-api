package com.mutualfunds.ordersimulator.repository;

import com.mutualfunds.ordersimulator.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
