package com.sportyshoes.service;

import java.util.List;

import com.sportyshoes.dao.OrderListDao;
import com.sportyshoes.dao.OrderListDaoImpl;
import com.sportyshoes.entities.OrderList;

public class OrderListServiceImpl implements OrderListService {
	OrderListDao orderListDao = new OrderListDaoImpl();
	@Override
	public List<OrderList> getAllOrderList() {
		return orderListDao.getAll();
	}

	@Override
	public OrderList getOrderList(int id) {
		return orderListDao.get(id);
	}

	@Override
	public void addOrderList(OrderList orderList) {
		orderListDao.insert(orderList);
	}

}
