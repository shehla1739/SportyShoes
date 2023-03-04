<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new product</title>
</head>
<body>
<form action="./addProduct" method="post">
<tabel> <tr> <td> </td> <td> </td> </tr>
	<tr> <td>productName: </td> <td><input type="text" name="productName"> <br></td> </tr>	
	<tr> <td>Brand: </td> <td><input type="text" name="brand"> <br></td> </tr>
	<tr> <td>Product Description: </td> <td><input type="text" name="productDesc"> <br></td> </tr>
	<tr> <td>Quantity in Stock: </td> <td><input type="text" name="quantityInStock"> <br></td> </tr>
	<tr> <td>Price: </td> <td><input type="text" name="price"> <br></td> </tr>
	<tr> <td>Category Id: </td> <td><input type="text" name="categoryId"> <br></td> </tr>
	<tr> <td colspan=2><input type="submit" value="Add Product"></td> </tr>
</form>

</body>
</html>