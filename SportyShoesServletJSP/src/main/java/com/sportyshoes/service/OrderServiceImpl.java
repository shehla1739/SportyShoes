package com.sportyshoes.service;

import java.util.List;

import com.sportyshoes.dao.OrderDao;
import com.sportyshoes.dao.OrderDaoImpl;
import com.sportyshoes.entities.Order;

public class OrderServiceImpl implements OrderService{
	OrderDao orderDao=new OrderDaoImpl();
	
	@Override
	public List<Order> getAllOrder() {
		return orderDao.getAll();
	}

	@Override
	public Order getOrder(int id) {
		return orderDao.get(id);
	}

	@Override
	public void addOrder(Order order) {
		orderDao.insert(order);
	}

}
