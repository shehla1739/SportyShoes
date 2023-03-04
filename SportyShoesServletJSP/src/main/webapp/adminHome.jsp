<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
<body>
	<h1>Sporty Shoes</h1> <br>
	<hr>
	<hr>
	<h3> Admin Page </h3> <br>
		User Id : <%=session.getAttribute("userId") %>
	<br> <br>
	<table>
		<tr> <td>  
			<form action="changePassword.jsp" method="post"> 
						
				<input type="submit" value ="Change Password">			
		  	</form><br>
			 </td> 
		</tr>
		<tr> <td>  
			<form action="./adminManageProducts" method="post"> 
				<input type="submit" value ="Manage Products">
		  </form><br>
			 </td> 
		</tr>
		<tr> <td> 
			<form action="./adminManageUsers" method="post"> 
				<input type="submit" value ="Manage Users">
			</form><br>
			 </td> 
		</tr>
		<tr> <td> 
			<form action="./adminPurchaseReport" method="post"> 
				<input type="submit" value ="Purchase Report">
			 </form><br>
			 </td> 
		</tr>
	</table>
		
		
		
	
</body>
</html>