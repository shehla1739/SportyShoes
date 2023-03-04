package com.sportyshoes.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sportyshoes.dao.OrderDao;
import com.sportyshoes.dao.OrderDaoImpl;
import com.sportyshoes.entities.Order;
import com.sportyshoes.entities.Product;
import com.sportyshoes.entities.User;
import com.sportyshoes.service.OrderService;
import com.sportyshoes.service.OrderServiceImpl;
import com.sportyshoes.service.ProductService;
import com.sportyshoes.service.ProductServiceImpl;
import com.sportyshoes.service.UserService;
import com.sportyshoes.service.UserServiceImpl;

@WebServlet("/AddOrderTest")
public class AddOrderTestController extends HttpServlet{	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProductService productService=new ProductServiceImpl();
		UserService userService = new UserServiceImpl();
		OrderService orderService=new OrderServiceImpl();
		
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		out.println("hello");
		// Create booking object
		int productId=2;
		int userId=3;
		int orderQty=3;
					java.util.Date javaDate = new java.util.Date();
					java.sql.Date mySQLDate = new java.sql.Date(javaDate.getTime());			

					 Product tempProduct=productService.getProduct(productId); 
					 User tempUser=userService.get(userId); 
					 Order tempOrder=new Order(orderQty, mySQLDate);
					 tempOrder.setUser(tempUser); 
					 tempOrder.setProduct(tempProduct);
					 orderService.addOrder(tempOrder);	
				
					 out.println("<br>  tempProduct : " +  tempProduct);
					 out.println("<br> tempUser : " + tempUser);
					 out.println("<br> OrderDetails : " + tempOrder);
					 
							
	}
	
}
