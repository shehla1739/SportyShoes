<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.sportyshoes.entities.Order" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Purchase Report</title>
</head>
<body>
	<h3> <center> Purchase Report </center> </h3> </h3>	
	
		<table border=1>
		<tr>
			<th> Order Id </th>
			<th> Order Date</th>			
			<th> Product Name</th>
			<th> Brand</th>
			<th> Price</th>
			<th> Order Quantity</th>
			<th> Total Amoun1 </th>
			<th> Customer Name </th>
		</tr>
		<% List<Order> orders=(List<Order>)request.getAttribute("orders");
			for(Order tempOrder:orders){
			%>
		<tr>			
			<td><%= tempOrder.getId()%> </td> 
			<td> <%=tempOrder.getOrderDate()%> </td> 
			<td> <%=tempOrder.getProduct().getProductName()%></td> 
			<td> <%=tempOrder.getProduct().getBrand() %></td> 
			<td> <%=tempOrder.getProduct().getPrice() %></td> 	
			<td> <%=tempOrder.getOrderQuantity()%></td> 
			<td> <%=tempOrder.getProduct().getPrice()* tempOrder.getOrderQuantity()%></td> 

			<td> <%=tempOrder.getUser().getUserName() %></td> 
			
		<%} %>
		</tr>
		</table>
	</form>
	<br>
	<br>
	<a href="adminHome.jsp"><b> Back to Admin Home </b> </a>
</body>
</html>