<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">${ military.military }</h1>
	<h1 align="center">${ military.dept }</h1>
	<h1 align="center">${ military.add }</h1>
	<h1 align="center">${ military.longtime }</h1>
	<hr>
	<h1 align="center">${ sessionScope.soldier }</h1>
	<h1 align="center">${ sessionScope.division }</h1>
	<hr>
	<button onclick="location.href='logout1'">탈영1</button>
	<button onclick="location.href='logout2'">탈영2</button>
</body>
</html>