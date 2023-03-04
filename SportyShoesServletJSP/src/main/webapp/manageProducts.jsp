<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.sportyshoes.entities.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage Products</title>
</head>
<body>
	<h3> <center> Manage Products </center> </h3> </h3>	
	<br><br>
		<a href="addProduct.jsp"> <b> Add New Product </b></a> 
		<br><br>
		<table border=1>
		<tr>
			<th> ProductName </th>
			<th> Brand</th>
			<th> Product Desc</th>
			<th> Price</th>
			<th> Quantity in Stock</th>
		</tr>
		<% List<Product> products=(List<Product>)request.getAttribute("products");
			for(Product tempProduct:products){
			%>
		<tr>			
			<td><%=tempProduct.getProductName() %> </td> 
			<td> <%=tempProduct.getBrand() %> </td> 
			<td> <%=tempProduct.getProductDesc() %></td> 
			<td> <%=tempProduct.getPrice() %> </td>
			<td> <%=tempProduct.getQuantity() %> </td> 			
			<td> 
				<form action="./AdminUpdatProduct" method="post">
					 <input type="hidden" name="productId" value=<%= tempProduct.getId() %>>					   
					 <input type="submit" value="Update" >
				 </form>
			</td>
			<td>	 
				 <form action="./AdminDeleteProduct" method="post">
					 <input type="hidden" name="productId" value=<%= tempProduct.getId() %>>					   
					 <input type="submit" value="Delete" >
				 </form>
			</td>
			<%} %>
		</tr>
		</table>
	</form>
</body>
</html>