<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Trip Details</h2>

<form:form action="/addTrip" method="post">
<form:input path="tripId"/>
<form:select path="source" items="${location}">

</form:select>
<form:input path="destination"/>
<form:input path="amount"/>

<input type="submit" value="Add">
</form:form>
</body>
</html>