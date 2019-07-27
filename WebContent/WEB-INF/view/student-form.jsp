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

<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">

		<label for="firstName">First name:</label>
		<form:input path="firstName" required="required" />

		<br>
		<br>

		<label for="lastName">Last name:</label>
		<form:input path="lastName" required="required" />

		<br>
		<br>

		<label for="country">Country:</label>
		<form:select path="country" required="required">
			<form:option value="" label="--- Select ---" />
			<form:options items="${countryOptions}" />
		</form:select>

		<br>
		<br>

		<p>Favorite Language:</p>
		<label>Java <form:radiobutton path="favouriteLanguage"
				value="Java" required="required" /></label>

		<label>C# <form:radiobutton path="favouriteLanguage"
				value="C#" required="required" /></label>

		<label>PHP <form:radiobutton path="favouriteLanguage"
				value="PHP" required="required" /></label>

		<label>Ruby <form:radiobutton path="favouriteLanguage"
				value="Ruby" required="required" /></label>

		<br>
		<br>

		<input type="submit" value="Submit" />

	</form:form>

</body>
</html>