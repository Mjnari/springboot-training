<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Vendor</title>
</head>
<body>
	<form action="saveVen" method="post">
		<pre>
Id: <input type="text" name="id" value="${vendor.id}" readonly>
Code: <input type="text" name="code" value="${vendor.code}">
Name: <input type="text" name="name" value="${vendor.name}">
Type: <select name="type">
<option value="regular" ${vendor.type=='REGULAR'?'checked':''}>Regular</option>
<option value="contract" ${vendor.type=='CONTRACT'?'checked':''}>Contract</option>
</select>
Email: <input type="email" name="email" value="${vendor.email}">
Phone: <input type="text" name="phone" value="${vendor.phone}">
Address <input type="text" name="address" value="${vendor.address}">
<input type="submit" value="save">
</pre>
</form>
</body>
</html>