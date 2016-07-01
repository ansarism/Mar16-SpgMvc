
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:errors path= "cust.*"/>
<h1 align=center>Welcome to Paradise 5 Star</h1>
<form method=POST action="/mar16/paradise">
<table>
  <tr><td>Name:</td><td><input type = text name = name /></td></tr>
  <tr><td>Mobile :</td><td><input type = text name = mobile /></td></tr>
  <tr><td>E-mail : </td><td><input type = text name = email /></td></tr>
  <tr><td>CheckIn Date : </td><td><input type = text name = da /></td></tr>
<tr><td> Gender: <input type="radio" name="sex" value="Male" >MALE<input type= "radio" name="sex" value="Female">FEMALE
<input type="radio" name="sex" value="Other">OTHER </td></tr>

  <tr><td colspan = 2 align =center><input type = submit value = CheckIn /></td></tr>
</table>
</form>
</body>
</html>
