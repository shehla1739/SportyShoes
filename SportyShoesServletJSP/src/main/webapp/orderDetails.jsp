<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, com.sportyshoes.entities.Product" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Orders You have placed</title>
</head>
<body>

	<h1>Sporty Shoes</h1> <br>
	<hr>
	<hr>
	<h3>  </h3>
	User Id : <%= session.getAttribute("userId") %>
	Products: <br>

		<form action="./PlaceBuyOrder" method="post">
		<table border=1>
		<% 
			Product tempProduct=(Product)request.getAttribute("product");
			%>
					
		<tr>	<td><%=tempProduct.getProductName() %> </td> </tr>
		<tr>	<td> <%=tempProduct.getBrand() %> </td>  </tr>
		<tr>	<td> <%=tempProduct.getProductDesc() %></td> </tr> 
		<tr>	<td> <input type="text" name="orderQuantity" value="1"> </td>	 </tr>				
		<tr>	<td> 
				
					<input type="hidden" name="productId" value=<%= tempProduct.getId() %>>					 
					 <input type="hidden" name="customerId" value=<%= session.getAttribute("userId") %>>  
					 <input type="submit" value="Place Order" >
			
			</td>
		</tr>
		</table>
		</form>
	</form>
	
<p style="color: red;">${requestScope.msg}</p>		
</body>
</html>