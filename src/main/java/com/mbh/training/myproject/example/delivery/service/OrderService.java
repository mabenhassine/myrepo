package com.mbh.training.myproject.example.delivery.service;

import com.mbh.training.myproject.example.delivery.model.Order;

import java.util.List;

public interface OrderService {
    public List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order createOrder(Order order);
    Order updateOrder(Long id, Order order);
    void deleteOrder(Long id);

}
