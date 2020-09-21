<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>


<head>
	<title>Home</title>
</head>

<body>
<h1>
	NATIONAL BANK OF GREECE <br><br>
	VERIFY THAT YOU ARE A CUSTOMER
</h1>

<section class="loginform cf">
<form:form  action="/ergasia/result"  method="POST" >

		ID:<br>
		<input type="text" var="id"  name="theid" value="0"/><br>
		Taxpayer Identification Numbers:<br>
		<input type="text" var="AFM" name="theafm" /><br>
		National Identity Card:<br>
		<input type="text" var="ADT" name="theadt"/><br>
		<br><br>
        <input type="submit" value="check">

</form:form>
</section>
</body>

</html>
