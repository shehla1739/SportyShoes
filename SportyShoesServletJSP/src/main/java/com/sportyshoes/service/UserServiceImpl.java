package com.sportyshoes.service;

import com.sportyshoes.dao.UserDao;
import com.sportyshoes.dao.UserDaoImpl;
import com.sportyshoes.entities.User;

public class UserServiceImpl implements UserService{
	UserDao userDao=new UserDaoImpl();

	public void insert(User user) {
		userDao.insert(user);	
	}

	public User get(String username, String password) {
		return userDao.get(username, password);
	}

	public void updatePassword(String username, String password, String newPassword) {
		User tempUser= userDao.get(username, newPassword);
		tempUser.setPassword(newPassword);
		userDao.update(tempUser);
	}

	@Override
	public void changePasswordNew(int Id, String newPassword) {
		User tempUser=userDao.get(Id);
		tempUser.setPassword(newPassword);
		userDao.update(tempUser);
	}

	@Override
	public User get(int id) {		
		return userDao.get(id);
	}

	
}
