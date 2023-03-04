package com.sportyshoes.dao;

import com.sportyshoes.entities.User;

public interface UserDao {
	User get(int id);
	public void insert(User user);
	public User get(String username,String password);
	public void update(User user);
}

