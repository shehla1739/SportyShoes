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

import com.sportyshoes.dao.ProductDao;
import com.sportyshoes.dao.ProductDaoImpl;
import com.sportyshoes.entities.Category;
import com.sportyshoes.entities.Product;
import com.sportyshoes.service.CategoryService;
import com.sportyshoes.service.CategoryServiceImpl;
import com.sportyshoes.service.ProductService;
import com.sportyshoes.service.ProductServiceImpl;

@WebServlet("/addProduct")
public class AddProductController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	ProductService productService=new ProductServiceImpl();
	CategoryService categoryService=new CategoryServiceImpl();

	@Override
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		String txt1=req.getParameter("txt1");
		//out.println("Product Added" + txt1);
		String productName=req.getParameter("productName");
		String brand=req.getParameter("brand");
		String productDesc=req.getParameter("productDesc");
		int quantityInStock=Integer.parseInt(req.getParameter("quantityInStock"));
		int price=Integer.parseInt(req.getParameter("price"));
		int categoryId=Integer.parseInt(req.getParameter("categoryId"));
		
		Product tempProduct=new Product(productName, brand, productDesc, quantityInStock, price);
		Category tempCategory=categoryService.getCategory(categoryId);
		
		tempCategory.addProduct(tempProduct);
		productService.addProduct(tempProduct);
		
		List<Product> products = productService.getAllProduct();
		req.setAttribute("products", products);
		
		req.setAttribute("msg", "Product added Successfully..");
		RequestDispatcher rd=req.getRequestDispatcher("manageProducts.jsp");
		rd.forward(req, resp);
	}
}
