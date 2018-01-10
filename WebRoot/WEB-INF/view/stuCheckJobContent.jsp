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

<title>学生查看具体招聘信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
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

	<h3>
		<font color="green" size="6px">招聘信息:</font>
	</h3>
	<table width="640" cellspacing="0" border="1" align="center" border="1"
		bordercolor="#99CCFF" bgcolor="#FFFFEE" class="a">



		<tr>
			<td width="200">招聘标题</td>
			<td><s:property value="tbJob.jobTitle" /></td>
		</tr>
		<tr>
			<td>发布时间</td>
			<td><s:date name="tbJob.jobDate" format="yyyy-MM-dd " /></td>
		</tr>
		<tr>
			<td>具体内容</td>

			<td>${ tbJob.jobCon}</td>
		</tr>
		<tr>
			<td></td>
			<td><a
				href="<%=request.getContextPath()%>/page/studentSendResumeAction?jobId=<s:property value='jobId'/>&stuId=<s:property value='tbStudent.stuId'/>">
					<!-- <input type="button" value="投递简历"> -->投递简历</a></td>
		</tr>
	</table>
</body>
</html>
