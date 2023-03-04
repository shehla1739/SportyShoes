package com.sportyshoes.dao;

import java.util.List;

import com.sportyshoes.entities.OrderList;

public interface OrderListDao {
	public List<OrderList> getAll();
	OrderList get(int id);
	void insert(OrderList orderList);
	void update(OrderList orderList); 
	void delete(OrderList orderList);
}

