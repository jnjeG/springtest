<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%
	String context = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
<c:out value="${liming}"></c:out>
<h2>不知道去哪吃饭好？没关系,天帮你!</h2>
<form action="<%=context%>/randomRes.do" method="post">
	<ul>
		<li><input name="name" type="text" value="华辉" /></li>
		<li><input name="name" type="text" value="麦当劳" /></li>
		<li><input name="name" type="text" value="真功夫" /></li>
		<li><input name="name" type="text" value="多营" /></li>
		<li><input name="name" type="text" value="麦田鸡" /></li>
		<li><input name="name" type="text" value="789" /></li>
		<li><input name="name" type="text" value="烧鹅仔" /></li>
		<li><input name="name" type="text" value="老刘家" /></li>
	</ul>
	<input type="submit" value="让天决定">
</form>
<h1>
去...<c:out value="${result}"/>
</h1>
</body>
</html>