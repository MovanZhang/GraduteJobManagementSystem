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

<title>职位信息列表</title>

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

	<table width="640" cellspacing="0" border="1" align="center" border="1"
		bordercolor="#99CCFF" bgcolor="#FFFFEE" " class="a">
		<tr>
			<td>招聘信息</td>
			<td>操作</td>
		</tr>
		<s:iterator value="list" status="st">
			<tr>

				<td><a href="showJob?id=<s:property value='jobId'/>"><s:property
							value="jobTitle" /> </a></td>
				<td><a href="toJobDelect?id=<s:property value='jobId'/>"
					onclick="confirmDel('确定要删除吗')">删除</a></td>
			</tr>
		</s:iterator>
		<tr align="center">
			<td colspan="3"><a href="jobList?currentPage=1">首页</a> <a
				href="jobList?currentPage=<s:property value='currentPage-1'/>">[上一页]</a>
				<a href="jobList?currentPage=<s:property value='currentPage'/>"><s:property
						value="currentPage" />
			</a> <s:if test="currentPage <=total-1">
					<a href="jobList?currentPage=<s:property value='currentPage+1'/>"><s:property
							value="currentPage+1" />
					</a>
				</s:if> <s:if test="currentPage <=total-2">
					<a href="jobList?currentPage=<s:property value='currentPage+2'/>"><s:property
							value="currentPage+2" />
					</a>
				</s:if> <a href="jobList?currentPage=<s:property value='currentPage+1'/>">[下一页]</a>
				<a href="jobList?currentPage=<s:property value='total'/>">[尾页]</a>
			</td>
		</tr>
	</table>
</body>
</html>
