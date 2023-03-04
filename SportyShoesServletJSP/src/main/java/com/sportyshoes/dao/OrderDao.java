package com.sportyshoes.dao;

import java.util.List;

import com.sportyshoes.entities.Order;

public interface OrderDao {
	public List<Order> getAll();
	Order get(int id);
	void insert(Order order);
	void update(Order order); 
	void delete(Order order);
}
