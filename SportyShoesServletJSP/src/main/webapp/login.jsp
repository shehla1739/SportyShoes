<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Sporty Shoes</h1> <br>
	<hr>
	<hr>
	
	<form action="./login" method="post">
	<table>
	<tr><td>	Username	: 	</td><td><input type="text" name="username"><br> </td>
	<tr><td>	Password	:	</td><td><input type="text" name="password"><br> </td>
	<tr><td colspan=2 align="center">	<input type="submit" value="Submit"><br> <br> <br>
	</table>
	</form>
	<br>
	New User,<a href="register.jsp"> <b>Register </b></a>
	<p style="color: red;">${requestScope.msg}</p>
	<br> 
	<b> <a href="index.jsp"> Back to Home Page </a></b>
</body>
</html>