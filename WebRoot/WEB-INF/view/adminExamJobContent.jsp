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

<title>公司信息</title>

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
	height: 20%;
	width: 80%; /*  必须设置一个宽度， margin: 0 auto才能使之居于父组件中央*/
	margin: 0px auto; /*  通过设置外边距（margin）中的左右外边距属性为auto使之居于父组件（body）中间*/
}

table tr {
	height: 20px;
	width: 100%;
}
</style>
</head>

<body align="center" bgcolor="#efefef" class="b">
	<table width="640" cellspacing="0" border="1" align="center" border="1"
		bordercolor="#99CCFF" bgcolor="#FFFFEE" class="a">

		<tr>
			<td width="200px">招聘标题</td>
			<td><s:property value="tbJob.jobTitle" /></td>
		</tr>
		<tr>
			<td>招聘内容</td>
			<td>${ tbJob.jobCon}</td>
		</tr>
		<tr>
			<td>发布时间</td>
			<td class="a3"><s:date name="tbJob.jobDate" format="yyyy-MM-dd " />
			</td>
		</tr>
	</table>
</body>
</html>
