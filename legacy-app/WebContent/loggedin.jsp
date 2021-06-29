<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logged In</title>
</head>
<body>
	<table style="width: 50%">
	<tr><td>
	<% String username = request.getParameter("username"); %>
<h2>Welcome to the page.</h2><br><h3> Hello <% out.println(username); %>.</h3><br><a>You have logged in.</a></td></tr>
<tr></tr><tr><td></td><td></td><td><a href="login.jsp"><b>Logout</b></a></td></tr>
</table>
</body>
</html>