package com.sportyshoes.service;

import java.util.List;

import com.sportyshoes.dao.CategoryDao;
import com.sportyshoes.dao.CategoryDaoImpl;
import com.sportyshoes.entities.Category;

public class CategoryServiceImpl implements CategoryService {
	CategoryDao categoryDao=new CategoryDaoImpl();
		
	@Override
	public List<Category> getAllCategory() {		
		return categoryDao.getAll();
	}

	@Override
	public Category getCategory(int id) {
		return categoryDao.get(id);
	}

	@Override
	public void addCategory(Category category) {
		categoryDao.insert(category);
	}

}
