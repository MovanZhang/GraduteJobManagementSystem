<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

<title>管理员管理就业信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
.b {
	padding: 40px;
}
</style>

</head>

<body align="center" bgcolor="#efefef" class="b">



	<center>
		<img src="chart1" />
	</center>
	<br>
	<br>
	<br>
	<center>
		<form action="show">
			<select name="search">
				<option value="信息工程学院">信息工程学院</option>
				<option value="机械与电子工程学院">机械与电子工程学院</option>
				<option value="食品科学学院">食品科学学院</option>
				<option value="水利与建筑工程学院">水利与建筑工程学院</option>
				<option value="农学院">农学院</option>
				<option value="林学院">林学院</option>
				<option value="动物医学院">动物医学院</option>
				<option value="动物科技学院">动物科技学院</option>
				<option value="葡萄酒学院">葡萄酒学院</option>
				<option value="外语系">外语系</option>
				<option value="生命科学学院">生命科学学院</option>
			</select> <input type="submit" value="浏览" />
		</form>
	</center>
</body>
</html>
