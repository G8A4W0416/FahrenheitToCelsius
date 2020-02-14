<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Celsius to Fahrenheit Confirmation</title>
</head>
<body>
<p>${showFahrenheit.getCelsius()} &deg;C is converted to ${showFahrenheit.getFahrenheit()} &deg;F</p>
<a href="CelsiusToFahrenheitConverter.jsp">Go back to convert Celsius to Fahrenheit</a><br />
<a href="FahrenheitToCelsiusConverter.jsp">Convert Fahrenheit to Celsius</a>
</body>
</html>