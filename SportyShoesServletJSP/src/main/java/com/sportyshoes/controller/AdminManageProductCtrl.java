package com.sportyshoes.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sportyshoes.entities.Product;
import com.sportyshoes.service.ProductService;
import com.sportyshoes.service.ProductServiceImpl;

@WebServlet("/adminManageProducts")
public class AdminManageProductCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductService productService=new ProductServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		List<Product> products=productService.getAllProduct(); 
		//out.println("<br> Products :  <br>" + products);
		
		req.setAttribute("products", products);
		RequestDispatcher rd=req.getRequestDispatcher("manageProducts.jsp");
		rd.forward(req, resp);
	}
}
