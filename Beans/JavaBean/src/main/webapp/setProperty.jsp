<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>set Property</title>
</head>
<body>
<jsp:useBean id="User" class="com.bean.practise.User" scope="session"></jsp:useBean>
<jsp:setProperty property="firstName" name="User" value="Mukesh"/>
<jsp:setProperty property="lastName" name="" value="Ambani"/>
</body>
</html>