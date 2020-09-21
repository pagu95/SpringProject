<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select Employer</title>
</head>
<body>
<form:form  action="/ergasia/log/home"  method="POST">
<select>
	<option name="null" value="null"></option>
	<option name="one" value="one">1</option>
	<option name="two" value="two">2</option>
	<option name="three" value="three">3</option>
	<option name="four" value="four">4</option>
</select>

<input type="submit" value="check">
</form:form>
</body>
</html>