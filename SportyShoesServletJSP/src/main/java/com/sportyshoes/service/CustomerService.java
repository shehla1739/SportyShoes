package com.sportyshoes.service;

import java.util.List;

import com.sportyshoes.entities.Customer;

public interface CustomerService {
	public List<Customer> getAllCustomer();
	public Customer getCustomer(int id);
	public void addCustomer(Customer customer);
}
