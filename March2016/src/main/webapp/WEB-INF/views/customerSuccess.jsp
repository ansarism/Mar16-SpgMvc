<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align = center>Customer Details have been submitted successfully</h1>
<hr/>
<table  align = center border = 2 width = 250>
<tr><td>Name</td><td>${customer.name}</td></tr>
<tr><td>Age></td><td>${customer.age}</td></tr>
<tr><td>SSN</td><td>${customer.ssn}</td></tr>
<tr><td>State</td><td>${customer.state}</td></tr>
<tr><td>Zip</td><td>${customer.zip}</td></tr>
<tr><td>Country</td><td>${customer.country}</td></tr>
</table>
</body>
</html>