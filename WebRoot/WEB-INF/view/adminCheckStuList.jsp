<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
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

<title>学生信息列表</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
.a {
	text-align: center;
	letter-spacing: 0px;
}

.b {
	padding: 40px;
}

table {
	height: 10%;
	width: 80%; /*  必须设置一个宽度， margin: 0 auto才能使之居于父组件中央*/
	margin: 0px auto; /*  通过设置外边距（margin）中的左右外边距属性为auto使之居于父组件（body）中间*/
}

table tr {
	height: 10px;
	width: 100%;
}
a:link {
	color: #000000;
	text-decoration: none;
}

a:visited {
	color: #000000;
	text-decoration: none;
}

a:hover {
	color: #3399FF;
	text-decoration: none;
}

a:active {
	color: #000000;
	text-decoration: none;
}
</style>
</head>

<body align="center" bgcolor="#efefef" class="b">

	<table width="640" border="1" cellspacing="0" align="center" border="1"
		bordercolor="#99CCFF" bgcolor="#FFFFEE" " class="a">
		<tr>
			<td>姓名</td>
			<td>学号</td>
			<td>性别</td>
			<td>专业</td>
			<td>操作</td>
		</tr>
		<s:iterator value="students" status="student">
			<tr>
				<td><s:property value="stuName" />
				</td>
				<td><s:property value="stuId" />
				</td>
				<td><s:property value="stuSex" />
				</td>
				<td><s:property value="stuMajor" />
				</td>
				<td><a
					href="page/searchStuDetail?searchstuid=<s:property value='stuNum'/>">详情</a>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>