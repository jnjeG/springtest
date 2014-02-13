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
<link href="<%=context %>/pages/ui/flatui2-1-3/bootstrap/css/bootstrap.css" rel="stylesheet"/>
  <!-- Loading Flat UI -->
<link href="<%=context %>/pages/ui/flatui2-1-3/css/flat-ui.css" rel="stylesheet">
<link href="<%=context %>/pages/ui/flatui2-1-3/css/demo.css" rel="stylesheet">

<script type="text/javascript" src="<%=context%>/pages/js/jquery/jquery-1.8.2.min.js"></script>

<style> 
 body{ text-align:center} 
 .div{ margin:0 auto; width:400px; height:100px; border:1px solid #F00} 
</style> 

<title>首页</title>
</head>

<body bgcolor="#bac1c8">
<div class="container">
<c:out value="${liming}"></c:out>
<h2>不知道去哪吃饭好？没关系,天帮你!</h2>
<%-- <form action="<%=context%>/randomRes.do" method="post"> --%>
<form id="nameform">
	<div><input name="name" type="text" value="华辉"/></div>
	<div><input name="name" type="text" value="麦当劳" /></div>
	<div><input name="name" type="text" value="真功夫" /></div>
	<div><input name="name" type="text" value="多营" /></div>
	<div><input name="name" type="text" value="麦田鸡" /></div>
	<div><input name="name" type="text" value="789" /></div>
	<div><input name="name" type="text" value="烧鹅仔" /></div>
	<div><input name="name" type="text" value="老刘家" /></div>
	<div><input name="name" type="text" value="麦当劳" /></div>
	<div id="addButt"><input name="name" type="button" value="+" onclick="addRes()"/></div>
	<br/>
</form>
<input type="button" value="让天决定" onclick="postReq()">
<h1>
去...<label id="result"></label>
</h1>
</div>
</body>
</html>
<script type="text/javascript">
function addRes(){
	$("#addButt").before("<div><input name='name' type='text'/></div>");
}


function postReq(){
	var obj = $("#nameform").serialize();
	$.post("<%=context%>/randomRes.do",obj,function(data){
		$("#result").html(data);
	});
}

</script>