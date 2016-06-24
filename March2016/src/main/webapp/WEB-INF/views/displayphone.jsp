<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align=center>Display Phone Details </h1>
<hr/>
<table border=2 width=250 align = center>
<tr><td>Model</td><td>${iphone.modeli}</td></tr>
<tr><td>Os</td><td>${iphone.os}</td></tr>
<tr><td>Memory</td><td>${iphone.memory}</td></tr>
<tr><td>Ordered Date</td><td>${iphone.orderedDate}</td></tr>
<tr><td>Features</td><td>${iphone.features}</td></tr>
<tr><td>Color</td><td>${iphone.radio}</td></tr>
</table>
</body>
</html>