<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/normalize.css">

<title>Customer Confirmation</title>
</head>
<body>

	<p>The customer has confirmed, first name: ${customer.firstName},
		last name: ${customer.lastName}</p>

	<br>

	<p>Free passes: ${customer.freePasses}</p>

	<br>

	<p>Postal code: ${customer.postalCode}</p>

</body>
</html>