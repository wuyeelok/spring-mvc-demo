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

<title>Hello World - Input Form</title>
</head>
<body>

	<form action="processFormVersionThree" method="POST">
		<input type="text" name="studentName" placeholder="What's your name?"
			required /> <input type="submit" value="Submit Query" />
	</form>

</body>
</html>