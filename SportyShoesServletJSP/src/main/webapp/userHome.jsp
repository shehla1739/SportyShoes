<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*, com.sportyshoes.entities.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Sporty Shoes Customer</title>
</head>
<body>

	<h1>Sporty Shoes</h1> <br>
	<hr>
	<hr>
	<h3>  </h3>
<%-- 	User Id : <%= session.getAttribute("userId") %> 
 	Products: <br> <%= request.getAttribute("products") %> --%>
	
		<table border=1>
		<tr>			
			<th>ProductName</th> 
			<th>Brand</th> 
			<th>Description</th> 
			<th>Price</th>
			<th>Quantity</th> 			
			</th> </th>
		</tr>
		<% List<Product> products=(List<Product>)request.getAttribute("products");
			for(Product tempProduct:products){
			%>
		<tr>			
			<td><%=tempProduct.getProductName() %> <br> </td> 
			<td> <%=tempProduct.getBrand() %> <br> </td> 
			<td> <%=tempProduct.getProductDesc() %> <br></td> 
			<td> <%=tempProduct.getPrice() %> <br></td>
			<td> <%=tempProduct.getQuantity() %> <br></td> 			
			<td> 
				<form action="./ProcessProductOrder" method="post">
					 <input type="hidden" name="productId" value=<%= tempProduct.getId() %>>
					 <input type="hidden" name="customerId" value=<%= session.getAttribute("userId") %>>  
					 <input type="submit" value="Order" > 
				 </form> <br>
			</td>
			<%} %>
		</tr>
		</table>
	</form>
	
<p style="color: red;">${requestScope.msg}</p>		
</body>
</html>