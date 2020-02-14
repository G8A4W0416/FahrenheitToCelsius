<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fahrenheit to Celsius Confirmation</title>
</head>
<body>
<p>${showCelsius.getFahrenheit()} &deg;F is converted to ${showCelsius.getCelsius()} &deg;C</p>
<a href="FahrenheitToCelsiusConverter.jsp">Go back to convert Fahrenheit to Celsius</a><br />
<a href="CelsiusToFahrenheitConverter.jsp">Convert Celsius to Fahrenheit</a>
</body>
</html>