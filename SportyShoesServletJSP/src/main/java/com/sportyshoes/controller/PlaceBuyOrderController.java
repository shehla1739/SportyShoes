package com.sportyshoes.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sportyshoes.entities.Category;
import com.sportyshoes.entities.Order;
import com.sportyshoes.entities.Product;
import com.sportyshoes.entities.User;
import com.sportyshoes.service.OrderService;
import com.sportyshoes.service.OrderServiceImpl;
import com.sportyshoes.service.ProductService;
import com.sportyshoes.service.ProductServiceImpl;
import com.sportyshoes.service.UserService;
import com.sportyshoes.service.UserServiceImpl;

@WebServlet("/PlaceBuyOrder")
public class PlaceBuyOrderController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	ProductService productService=new ProductServiceImpl();
	UserService userService = new UserServiceImpl();
	OrderService orderService=new OrderServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();

		try {
			int productId=Integer.parseInt(req.getParameter("productId"));
			int userId=Integer.parseInt(req.getParameter("customerId"));
			int orderQty=Integer.parseInt(req.getParameter("orderQuantity"));
			// Create booking object
			java.util.Date javaDate = new java.util.Date();
			java.sql.Date mySQLDate = new java.sql.Date(javaDate.getTime());			

			 Product tempProduct=productService.getProduct(productId); 
			 User tempUser=userService.get(userId); 
			 Order tempOrder=new Order(orderQty, mySQLDate); 
			 tempOrder.setUser(tempUser); 
			 tempOrder.setProduct(tempProduct);
			 orderService.addOrder(tempOrder);			
			
		req.setAttribute("msg", "Order placed Successfully..");
		req.setAttribute("order", tempOrder);
		RequestDispatcher rd=req.getRequestDispatcher("ConfirmOrderPlaced.jsp");
		rd.forward(req, resp);
			
	    } catch (NumberFormatException e) {
	        //Log it if needed
	    	System.out.println("not a number -> Number-Format-exception"); 
	    }

		
	}
}
