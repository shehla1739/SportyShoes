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
import com.sportyshoes.entities.Product;
import com.sportyshoes.service.CategoryService;
import com.sportyshoes.service.CategoryServiceImpl;

@WebServlet("/addCategory")
public class AddCategoryController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	CategoryService categoryService=new CategoryServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		String txt1=req.getParameter("txt1");
		//out.println("Product Added" + txt1);
		String productName=req.getParameter("categoryName");
		String categoryDesc=req.getParameter("categoryDesc");
				
		Category tempCategory=new Category(categoryDesc, categoryDesc);
		categoryService.addCategory(tempCategory);		
		
		req.setAttribute("msg", "Category added Successfully..");
		RequestDispatcher rd=req.getRequestDispatcher("addminHome.jsp");
		rd.forward(req, resp);
	}
}
