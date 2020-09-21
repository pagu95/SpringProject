
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>stats</title>
</head>

<body>

<form:form  action="/ergasia/result/add/amount"  method="POST">
<input type="text" var="custowag"  name="custowag" value="${cw }" hidden readonly/>
 <p  var="custowag" name="custowag" value="${cw }"> ${cw} </p>
 <input type="submit" value="calculate loan amount entitled">
 </form:form>
      
</body>

</html>