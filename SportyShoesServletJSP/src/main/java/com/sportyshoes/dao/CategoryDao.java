package com.sportyshoes.dao;

import java.util.List;

import com.sportyshoes.entities.Category;

public interface CategoryDao {
	public List<Category> getAll();
	Category get(int id);
	void insert(Category category);
	void update(Category category); 
	void delete(Category category);
}
