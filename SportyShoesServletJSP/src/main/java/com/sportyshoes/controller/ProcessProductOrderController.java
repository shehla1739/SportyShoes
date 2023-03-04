package com.sportyshoes.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sportyshoes.entities.Order;
import com.sportyshoes.entities.Product;
import com.sportyshoes.entities.User;
import com.sportyshoes.service.OrderService;
import com.sportyshoes.service.OrderServiceImpl;
import com.sportyshoes.service.ProductService;
import com.sportyshoes.service.ProductServiceImpl;
import com.sportyshoes.service.UserService;
import com.sportyshoes.service.UserServiceImpl;

@WebServlet("/ProcessProductOrder")
public class ProcessProductOrderController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	ProductService productService = new ProductServiceImpl();
	OrderService orderService=new OrderServiceImpl();
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int productId=Integer.parseInt(req.getParameter("productId"));
		
		//get product and customer objects
	
		Product tempProduct = productService.getProduct(productId);
		
		//create order object
		
		//
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter(); 
	
		out.println("<br> <b> Product ID:</b>" + productId);	
		out.println("<br> <b> Product Details:</b>" + tempProduct);
		req.setAttribute("product", tempProduct);
		RequestDispatcher rd=req.getRequestDispatcher("orderDetails.jsp");
		rd.forward(req, resp);
		
		
	}

}
