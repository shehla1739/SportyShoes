package com.sportyshoes.service;

import java.util.List;

import com.sportyshoes.entities.Order;


public interface OrderService {
	public List<Order> getAllOrder();
	public Order getOrder(int id);
	public void addOrder(Order order);
}
