<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>按条件查询学生信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="/graduateJob/css/search.css" type=text/css rel=stylesheet>
<style type="text/css">
.a {
	text-align: center;
	letter-spacing: 0px;
	padding: 40px;
}
</style>
</head>

<body align="center" bgcolor="#efefef" class="a">

	<form role="form" action="<%=request.getContextPath()%>/page/SearchStu"
		method="post">
		<select name="type">
			<option value="专业">专业</option>
			<option value="学号">学号</option>
			<option value="姓名">姓名</option>
		</select> <input type="text" name="value"> <br>
		<br> <input type="submit" name="submit" value="提交">
	</form>
</body>
</html>
