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
import javax.servlet.http.HttpSession;

import com.sportyshoes.entities.Product;
import com.sportyshoes.entities.User;
import com.sportyshoes.service.ProductService;
import com.sportyshoes.service.ProductServiceImpl;
import com.sportyshoes.service.UserService;
import com.sportyshoes.service.UserServiceImpl;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter(); 
		
		String username=req.getParameter("username");
		String password = req.getParameter("password");
		User tempUser=userService.get(username, password);
		// set session for user id 
		HttpSession session=req.getSession();
		session.setAttribute("user", tempUser);
		session.setAttribute("userId", tempUser.getId());
		
		//If user is Admin the forward to adminHome page else forward to user Pge
		
		if(tempUser!=null && tempUser.getUserType().equals("admin"))
		{
			
			RequestDispatcher rd=req.getRequestDispatcher("adminHome.jsp");
			rd.forward(req, resp);
		}
		else
		{			
			//set Product attribute
			ProductService productService=new ProductServiceImpl();
			List<Product> products = productService.getAllProduct();
			out.println("<br> Products : " + products);
			
			req.setAttribute("products", products);
			RequestDispatcher rd=req.getRequestDispatcher("userHome.jsp");
			rd.forward(req, resp);
		}

		
	}

}
