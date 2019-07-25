<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/normalize.css">

<title>Hello World of Spring!</title>
</head>
<body>

	<h1>Hello World of Spring!</h1>

	<p>Student name: ${param.studentName}</p>

	<br>
	<br>

	<p>The message: ${message}</p>

</body>
</html>