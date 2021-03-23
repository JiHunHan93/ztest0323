<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>세번째 장소</h1>
	<form action="third" method="post"><br>
		군 별 : <input type="text" name="military"><br>
		보 직 : <input type="text" name="dept"><br>
		위 치 : <input type="text" name="add"><br>
		기 간 : <input type="text" name="longtime">
		<br>
		<input type="submit" value="조회하기03">
	</form>
	<button onclick="location.href='${pageContext.servletContext.contextPath}/jihunh/login'">재입대1</button>
</body>
</html>