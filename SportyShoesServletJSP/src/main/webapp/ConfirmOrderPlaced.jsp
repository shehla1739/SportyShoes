<%@page import="javax.swing.text.StyledEditorKit.ForegroundAction"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, com.sportyshoes.entities.Product,com.sportyshoes.entities.Order, com.sportyshoes.service.ProductService, com.sportyshoes.service.ProductServiceImpl" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success! order Confirmation</title>
</head>
<body>

	<h1>Sporty Shoes</h1> <br>
	<hr>
	<hr>
	<h3> <% request.getAttribute("msg"); %> </h3>
<%-- 	User Id : <%= session.getAttribute("userId") %> --%>
	
<%-- 	Order Details : <br> <%= request.getAttribute("order") %> --%>
	<table border=1>
	<tr><th> Order Ref No </th>
		<th> Product Name</th>
		<th> Price </th>
		<th> Quantity </th>
		<th> Total amount </th>
		<th> Order Date </th>
	</tr>	
	<% Order tempOrder= (Order)request.getAttribute("order"); %>
	
	<tr><td> <%= tempOrder.getId() %> </td>
		<td> <%= tempOrder.getProduct().getProductName() %></td>
		<td> <%= tempOrder.getProduct().getPrice() %> </td>
		<td> <%= tempOrder.getOrderQuantity() %> </td>
		<td> <%= tempOrder.getProduct().getPrice()*tempOrder.getOrderQuantity() %> </td>
		<td> <%= tempOrder.getOrderDate() %> </td>
	</tr>	
	</table>
	<br> <br>
	<a href="userHome.jsp"> <b>Back to Home </b></a>
</body>
</html>