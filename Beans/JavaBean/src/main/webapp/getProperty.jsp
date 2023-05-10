<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>get Property</title>
</head>
<body>
<jsp:useBean id="user" class="com.bean.practise.User" scope="session"></jsp:useBean>
FirstName: <jsp:getProperty property="firstName" name="user"/>
LastName: <jsp:getProperty property="lastName" name="user"/>
</body>
</html>