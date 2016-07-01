<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align = center>Customer Registration</h1>
<hr/>
<form method = post action = "/jdbcexample/customerRegistration">
<table align = center>
<tr><td>Name</td><td><input type = text name = name></td></tr>
<tr><td>Age</td><td><input type = text name = age></td></tr>
<tr><td>SSN</td><td><input type = text name = ssn></td></tr>
<tr><td>State</td><td><input type = text name = state></td></tr>
<tr><td>Zip</td><td><input type = text name = zip></td></tr>
<tr><td>Country</td><td><input type = text name = country></td></tr>
<tr><td colspan = 2 align = center><input type = submit value = Register></td></tr>
</table>
</form>
</body>
</html>