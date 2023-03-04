package com.sportyshoes.service;

import java.util.List;

import com.sportyshoes.dao.CustomerDao;
import com.sportyshoes.dao.CustomerDaoImpl;
import com.sportyshoes.entities.Customer;

public class CustomerServiceImpl implements CustomerService{
	CustomerDao customerDao=new CustomerDaoImpl();
	@Override
	public List<Customer> getAllCustomer() {		
		return customerDao.getAll();
	}

	@Override
	public Customer getCustomer(int id) {
		return customerDao.get(id);
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.insert(customer);
	}

}
