<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">여기가 진정한 사나이들의 모임. 대 해적 시대</h1>
	<br>
	
	<h2>1. HttpServletRequest 파라미터 전달</h2>
	<button onclick="location.href='${pageContext.servletContext.contextPath}/jihunh/first'">파라미터 전달</button>
	<hr>
	
	<h2>2. @RequestParam 파라미터 전달</h2>
	<button onclick="location.href='${pageContext.servletContext.contextPath}/jihunh/second'">@RequestParam 이용</button>
	<hr>
	
	<h2>3. @ModelAttribute 파라미터 전달</h2>
	<button onclick="location.href='${pageContext.servletContext.contextPath}/jihunh/third'">@ModelAttribute 이용</button>
	<hr>
	
	<h2>4. @RequestBody 파라미터 전달</h2>
	<button onclick="location.href='${pageContext.servletContext.contextPath}/jihunh/fourth'">@RequestBody 이용</button>
	<hr>
	
</body>
</html>