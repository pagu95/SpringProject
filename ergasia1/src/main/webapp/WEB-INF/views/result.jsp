
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
.keli {
   width:250px;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer apply</title>
</head>


<body>
<section>
<form:form  action="/ergasia/result/add"  method="POST">
		APPLY_ID:<br>
		<input type="text" var="APPLY_ID"  name="applyid" class="keli" /><br>
		CUSTOMER_ID:<br>
		<input type="text"  var="C_ID"  name="cid" class="keli"/><br>
		LOAN_AMOUNT:<br>
		<input type="text" var="LOAN_AMOUNT"  name="loanam" class="keli"/><br>
		LOAN_TYPE:<br>
		<select var="LOAN_TYPE"  name="loantype" class="keli">
	<option name="cosnuming" value="cosnuming">consumption</option>
	<option name="Construction" value="Construction">Construction</option>
	</select>
	<br>
		YEARS:<br>
		<input type="text"  var="YEARS"  name="year" class="keli"/><br>
		EMPLOYER:<br>
		<input type="text"  var="EMPLOYER"  name="emp" class="keli"/><br>
		EMPLOYER_ADDRESS:<br>
		<input type="text"  var="EMPLOYER_ADDRESS"  name="empad" class="keli"/><br>
		WAGE:<br>
		<input type="text"  var="WAGE"  name="wag" class="keli"/><br>
		SALARY:<br>
		<input type="text"  var="SALARY"  name="sal" class="keli"/><br>
		<br><br>
        <input type="submit" value="check">
</form:form>
<section>
</body>
</html>