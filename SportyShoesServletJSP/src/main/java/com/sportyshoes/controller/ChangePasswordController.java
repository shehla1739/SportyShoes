package com.sportyshoes.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sportyshoes.service.UserService;
import com.sportyshoes.service.UserServiceImpl;


@WebServlet("/adminChangePasswordOLD")
public class ChangePasswordController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService userService = new UserServiceImpl();
		String username=req.getParameter("username");
		String oldPassword=req.getParameter("oldPassword");
		String newPassword=req.getParameter("newPassword");
		 userService.updatePassword(username, oldPassword, newPassword);
		 req.setAttribute("msg", "Password updated successfully");
		 RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		 rd.forward(req, resp);
	}
}
