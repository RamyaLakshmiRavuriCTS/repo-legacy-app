<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<form action="RegistrationServlet" method="post">
		First Name:<input type="text" name="firstname" /><br>
		<br> Last Name:<input type="text" name="lastname" /><br>
		<br> Contact Us:<input type="text" name="contactUs" /><br>
		<br> Address:<input type="text" name="address" /><br>
		<br> <input type="submit" value="Register" />
	</form>
</body>
</html>