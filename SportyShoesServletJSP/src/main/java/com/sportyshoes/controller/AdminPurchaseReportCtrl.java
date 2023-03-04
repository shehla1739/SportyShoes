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

import com.sportyshoes.entities.Order;

import com.sportyshoes.service.OrderService;
import com.sportyshoes.service.OrderServiceImpl;

@WebServlet("/adminPurchaseReport")
public class AdminPurchaseReportCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	OrderService orderService = new OrderServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		List<Order> orders=orderService.getAllOrder();
//		for(Order tempOrder:orders) {
//			out.println("<br> Orders Id:  <br>" + tempOrder.getId());		
//			out.println("<br> Product :  <br>" + tempOrder.getProduct());
//			out.println("<br> User :  <br>" + tempOrder.getUser());
//		}	
		
		req.setAttribute("orders", orders);
		RequestDispatcher rd=req.getRequestDispatcher("purchaseReport.jsp");
		rd.forward(req, resp);
	}
}
