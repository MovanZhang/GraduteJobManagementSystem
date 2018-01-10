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

<title>学生信息</title>

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
	height: 40%;
	width: 70%; /*  必须设置一个宽度， margin: 0 auto才能使之居于父组件中央*/
	margin: 0px auto; /*  通过设置外边距（margin）中的左右外边距属性为auto使之居于父组件（body）中间*/
}

table tr {
	height: 20px;
	width: 90%;
}
</style>
</head>
<script type="text/javascript">
	function confirmDel(str) {
		confirm(str);
	}
</script>
<body align="center" bgcolor="#efefef" class="b">

	<div align="center">
		<table width="640" border="1" cellspacing="0" align="center"
			border="1" bordercolor="#99CCFF" bgcolor="#FFFFEE" " class="a">
			<thead>
				<h3>

					<font color="green" size="6px">学生详细信息</font>
				</h3>
			</thead>

			<tbody>
				<tr>
					<td width="200px" height="30px">姓&nbsp;&nbsp;名</td>
					<td>${student.stuName}</td>
				</tr>
				<tr>
					<td>性&nbsp;&nbsp;别</td>
					<td>${student.stuSex}</td>
				</tr>
				<tr>
					<td>学&nbsp;&nbsp;号</td>
					<td>${student.stuId}</td>
				</tr>
				<tr>
					<td>专业班级</td>
					<td>${student.stuMajor}</td>
				</tr>
				<tr>
					<td>公司职位</td>
					<td>${student.stuJob}</td>
				</tr>
				<tr>
					<td>联系电话</td>
					<td>${student.stuTelephone}</td>

				</tr>
				<tr>
					<td>通讯地址</td>
					<td>${student.stuAddress}</td>
				</tr>
				<tr>

					<td colspan="2" align="center"><a
						href="page/studentDelete?deleteId=${student.stuNum}"
						onclick="confirmDel('确定要删除吗')">删除</a>
					</td>
			</tbody>
		</table>
	</div>
</body>
</html>
