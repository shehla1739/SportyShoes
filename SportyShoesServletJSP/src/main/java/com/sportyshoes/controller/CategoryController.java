package com.sportyshoes.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sportyshoes.dao.CategoryDao;
import com.sportyshoes.dao.CategoryDaoImpl;
import com.sportyshoes.entities.Category;

@WebServlet("/category")
public class CategoryController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private CategoryDao categoryDao=new CategoryDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		String txt1=req.getParameter("txt1");
		out.println("hello Categories" + txt1);
		List<Category> categories=categoryDao.getAll();
		out.println("<br> <br> Categories: <br>" + categories);
	}
	
}
