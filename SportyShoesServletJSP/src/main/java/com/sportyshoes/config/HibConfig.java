package com.sportyshoes.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.sportyshoes.entities.Category;
import com.sportyshoes.entities.Customer;
import com.sportyshoes.entities.Order;
import com.sportyshoes.entities.OrderList;
import com.sportyshoes.entities.Product;
import com.sportyshoes.entities.User;


public class HibConfig {
public static SessionFactory getSessionFactory() {	
		Configuration configuration=new Configuration();
		Properties properties=new Properties();
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/sportyshoesdb");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "root");
		properties.put(Environment.HBM2DDL_AUTO, "update");
		properties.put(Environment.SHOW_SQL, true);
		properties.put(Environment.FORMAT_SQL, true);
		properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
		configuration.setProperties(properties);
			
		
		configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(Category.class);
		configuration.addAnnotatedClass(Customer.class);
		configuration.addAnnotatedClass(Order.class);
		//configuration.addAnnotatedClass(OrderList.class);
		configuration.addAnnotatedClass(Product.class);
	
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		return sessionFactory;
	}
}