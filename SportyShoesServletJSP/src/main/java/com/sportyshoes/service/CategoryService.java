package com.sportyshoes.service;

import java.util.List;

import com.sportyshoes.entities.Category;

public interface CategoryService {
	public List<Category> getAllCategory();
	public Category getCategory(int id);
	public void addCategory(Category category);
}
