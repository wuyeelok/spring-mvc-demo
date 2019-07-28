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

<title>Student Confirmation</title>
</head>
<body>

	<p>The student is confirmed: ${student.firstName}
		${student.lastName}</p>

	<br>

	<p>Country: ${countryOptions[student.country]}</p>

	<br>

	<p>Favourite Language:
		${favourLangOptions[student.favouriteLanguage]}</p>

	<c:if test="${not empty student.operatingSystems}">
		<br>

		<p>Operation Systems:</p>
		<ul>
			<c:forEach var="os" items="${student.operatingSystems}">

				<li>${osOptions[os]}</li>

			</c:forEach>
		</ul>
	</c:if>
</body>
</html>