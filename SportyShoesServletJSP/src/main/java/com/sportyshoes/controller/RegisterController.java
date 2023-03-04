package com.sportyshoes.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sportyshoes.entities.User;
import com.sportyshoes.service.UserService;
import com.sportyshoes.service.UserServiceImpl;

@WebServlet("/register")
public class RegisterController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	UserService userService=new UserServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		String userName=req.getParameter("username");
		String password=req.getParameter("password");
		String userType=req.getParameter("usertype");
		//out.println("details: " + username + " : " + password);
		User user=new User(userName, password, userType);
		
		userService.insert(user);
		req.setAttribute("msg", "User registered Successfully..");
		RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
		rd.forward(req, resp);
		
	}

}
