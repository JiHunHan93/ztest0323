<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>입대 HttpSession</h1>
	<form action="third1" method="post"><br>
		이 름 : <input type="text" name="soldier"><br>
		사 단 : <input type="password" name="division"><br>
		<br>
		<input type="submit" value="재입대">
	</form>

	<h1>입대 @SessionAttributes</h1>
	<form action="third2" method="post"><br>
		이 름 : <input type="text" name="soldier"><br>
		사 단 : <input type="password" name="division"><br>
		<br>
		<input type="submit" value="재입대">
	</form>
</body>
</html>