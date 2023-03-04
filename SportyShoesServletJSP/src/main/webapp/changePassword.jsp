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
	<form action="./adminChangePassword" method="post">
	<input type="hidden" name="userId" value=<%= session.getAttribute("userId")%>> <br>		
		Username : <input type="text" name="username"><br>
		Old Password : <input type="text" name="oldPassword"><br>
		New Password : <input type="text" name="newPassword"><br>	
		<br>
		<input type="submit" value="Change Password">
	</form>

</body>
</html>