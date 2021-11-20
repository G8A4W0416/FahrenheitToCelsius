<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Convert Fahrenheit to Celsius</title>
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
	<h1>Fahrenheit to Celsius Converter - Merging Rebase One Commit</h1>
	<form action="getCelsiusServlet" method="post">
		<fieldset>
			<label for="degreesF">&deg;F:</label> <input id="degreesF" type="number" name="degreesF" />
			<input type="submit" value="Convert to &deg;C" />
		</fieldset>
	</form>
</body>
</html>