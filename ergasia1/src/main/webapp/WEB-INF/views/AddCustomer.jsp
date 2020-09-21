<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
    <style>
.error {
    color: #ff0000;
    font-style: italic;
    font-weight: bold;
}
</style>
</head>
<body>
<h2>Employee Information</h2>
<form:form method="POST"  modelAttribute="newCusto" action="/AddCustomer">
   <table>   
      <c:if test="${newCustomer.id != 0}" >
   <tr>
        <td><form:label path="ID">ID</form:label></td>
        <td><form:input path="ID" readonly="true"/>
        </td>
    </tr>
    </c:if>
     <tr>
        <td><form:label path="AFM">AFM</form:label></td>
        <td><form:input path="AFM" /></td>
        <td><form:errors path="AFM" cssClass="error" /></td>
    </tr>
    <tr>
        <td><form:label path="ADT">ADT</form:label></td>
        <td><form:input path="ADT" /></td>
        <td><form:errors path="ADT" cssClass="error" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table> 
</form:form>
</body>
</html>