package com.sportyshoes.service;

import java.util.List;

import com.sportyshoes.dao.ProductDao;
import com.sportyshoes.dao.ProductDaoImpl;
import com.sportyshoes.entities.Product;

public class ProductServiceImpl implements ProductService {
	ProductDao productDao=new ProductDaoImpl();
	
	@Override
	public List<Product> getAllProduct() {
		return productDao.getAll();
	}

	@Override
	public Product getProduct(int id) {
		return productDao.get(id);
	}

	@Override
	public void addProduct(Product product) {
		productDao.insert(product);

	}

}
