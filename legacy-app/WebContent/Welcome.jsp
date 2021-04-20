<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<% String userName = request.getParameter("userName"); %>
<a>Welcome page: display Hello <%out.println(userName); %>!!</a><br><br><br>
<a href="Login.jsp"><b>LogOut</b></a>

</body>
</html>