package com.sportyshoes.service;

import java.util.List;

import com.sportyshoes.entities.Product;

public interface ProductService {
	public List<Product> getAllProduct();
	public Product getProduct(int id);
	public void addProduct(Product product);
}
