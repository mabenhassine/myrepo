package com.mbh.training.myproject.example.delivery.repository;

import com.mbh.training.myproject.example.delivery.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
