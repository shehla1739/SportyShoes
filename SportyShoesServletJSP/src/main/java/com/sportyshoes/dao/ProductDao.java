package com.sportyshoes.dao;

import java.util.List;

import com.sportyshoes.entities.Product;

public interface ProductDao {
	public List<Product> getAll();
	Product get(int id);
	void insert(Product product);
	void update(Product product); 
	void delete(Product product);
}
