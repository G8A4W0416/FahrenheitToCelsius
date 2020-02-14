<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Convert Celsius to Fahrenheit</title>
<style>
	fieldset {
		padding: 20px;
		width: 320px;
	}
	label {
		font-weight: 700;
	}
</style>
</head>
<body>
	<h1>Celsius to Fahrenheit Converter</h1>
	<form action="getFahrenheitServlet" method="post">
		<fieldset>
			<label for="degreesC">&deg;C:</label> <input id="degreesC" type="number" name="degreesC" />
			<input type="submit" value="Convert to &deg;F" />
		</fieldset>
	</form>
</body>
</html>