package com.sportyshoes.service;

import java.util.List;

import com.sportyshoes.entities.OrderList;

public interface OrderListService {
	public List<OrderList> getAllOrderList();
	public OrderList getOrderList(int id);
	public void addOrderList(OrderList orderList);
}
