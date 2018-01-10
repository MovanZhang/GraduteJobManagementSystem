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

<title>管理职位信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	function confirmDel(str) {
		confirm(str);
	}
</script>
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
	letter-spacing: 5px;
	font-size: 20;
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

	<table width="400" cellspacing="0" border="1" bordercolor="#99CCFF"
		bgcolor="#FFFAFA" class="a">
		<tr>
			<td height="40px">招聘信息</td>
			<td colspan="2">操作</td>
		</tr>
		<s:iterator value="tbJobs" status="tbJob">
			<tr>
				<td height="40px"><a
					href="page/compJobContent?jobId=<s:property value='jobId'/>&compUsername=<s:property value='compUsername'/>"><s:property
							value="jobTitle" /> </a>
				</td>
				<td height="40px"><a
					href="page/compJobDelete?jobId=<s:property value='jobId'/>&compUsername=<s:property value='compUsername'/>"
					onclick="confirmDel('确定要删除吗')">删除</a>
				</td>
				<td><a
					href="page/toUpdateJob?jobId=<s:property value='jobId'/>&compUsername=<s:property value='compUsername'/>">更新</a>
				</td>
			</tr>
		</s:iterator>
	</table>
	<h3 align="center">
		<a
			href="page/compTobToInsert?compUsername=<s:property value='compUsername'/>">添加招聘信息</a>

	</h3>
</body>
</html>
