package com.sportyshoes.service;

import com.sportyshoes.entities.User;

public interface UserService {
	public User get(int id);
	void insert(User user);
	User get(String username, String password);
	void updatePassword(String username,String password,String newPassword);
	void changePasswordNew(int Id, String newPassword);
}
