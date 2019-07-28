<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/app.css">

<title>Customer Registration Form</title>
</head>
<body>
	<p>
		Fill out the form. <i>Asterisk (*) means required.</i>
	</p>

	<br>

	<form:form action="processForm" modelAttribute="customer" method="post">
		<label for="firstName">First name:</label>
		<form:input path="firstName" />

		<br>
		<br>

		<label for="lastName">Last name (*):</label>
		<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />

		<br>
		<br>

		<label for="freePasses">Free passes (*):</label>
		<form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />

		<br>
		<br>

		<label for="postalCode">Postal code:</label>
		<form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />

		<br>
		<br>

		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>