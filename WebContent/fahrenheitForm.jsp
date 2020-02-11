<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fahrenheit Form</title>
</head>
<body>
<h1>Fahrenheit Form</h1>
<form action ="fahrenheitServlet" method = "post">
Enter degrees Fahrenheit you wish to convert to Celsius: 
<input type="text" name="degreesFahrenheit" size = "10">
<input type ="submit" value="Calculate Celsius"/>
</form>
</body>
</html>