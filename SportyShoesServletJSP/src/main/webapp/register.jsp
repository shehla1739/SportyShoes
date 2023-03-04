<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<h1>Sporty Shoes</h1> <br>
	<hr>
	<hr>
	<form action="./register" method="post">
		<table>
		<tr><td> Username : </td><td><input type="text" name="username"><br> </td> </tr>
		<tr><td> Password : </td><td><input type="text" name="password"><br> </td> </tr>
		<tr><td> UserType : </td><td><select name="usertype">
								<option value="admin">Admin</option>
								<option value="user">User</option>
							</select> <br> </td> </tr>
			
		<tr><td colspan=2 align="center">	<input type="submit" value="Register"></td> </tr>
		</table>
	</form>
	<br>
	<p> <a href="index.jsp">Back to Home Page </a>
</body>
</html>