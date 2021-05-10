<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Registration details</title>
</head>
<body>
	<h2>Details Table</h2>
	<hr>
	<br />
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Contact Us</th>
			<th>Address</th>
		</tr>
		<c:forEach var="tempDetails" items="${details_list}">
			<tr>
				<td>${tempDetails.firstname}</td>
				<td>${tempDetails.lastname}</td>
				<td>${tempDetails.contactUs}</td>
				<td>${tempDetails.address}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>