<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Vendor</title>
</head>
<body>
	<form action="saveVen" method="post">
		<pre>
Id: <input type="text" name="id">
Code: <input type="text" name="code">
Name: <input type="text" name="name">
Type: <select name="type">
<option value="regular">Regular</option>
<option value="contract">Contract</option>
</select>
Email: <input type="email" name="email">
Phone: <input type="text" name="phone">
Address <input type="text" name="address">
<input type="submit" value="save">
</pre>
	</form>
	${msg}
	<br>
	<a href="displayVendors">Display Vendors</a>
</body>
</html>