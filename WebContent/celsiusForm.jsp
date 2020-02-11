<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Celsius Form</title>
</head>
<body>
<h1>Celsius Form</h1>
<form action ="celsiusServlet" method = "post">
Enter degrees celsius you wish to convert to Fahrenheit: 
<input type="text" name="degreesCelsius" size = "10">
<input type ="submit" value="Calculate Fahrenheit"/>
</form>
</body>
</html>