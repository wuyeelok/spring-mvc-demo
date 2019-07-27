<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/normalize.css">

<title>Student Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">

		<label for="firstName">First name:</label>
		<form:input path="firstName" />

		<br>
		<br>

		<label for="lastName">Last name:</label>
		<form:input path="lastName" />

		<br>
		<br>

		<input type="submit" value="Submit" />

	</form:form>

</body>
</html>