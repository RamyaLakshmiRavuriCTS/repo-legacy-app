<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Welcome Page</title>
	</head>
	<body>
		<% String userName = request.getParameter("userName"); %>
		<a>Welcome page: Hello <% out.println(userName); %>!!</a><br>
		<a href="Login.jsp"><b>Log out</b></a>
	</body>
</html>