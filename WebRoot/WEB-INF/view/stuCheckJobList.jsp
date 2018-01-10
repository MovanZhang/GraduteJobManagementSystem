<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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

<title>学生查看招聘信息列表</title>
<style type="text/css">
.a {
	text-align: center;
	letter-spacing: 0px;
}

.b {
	padding: 40px;
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
		bordercolor="#99CCFF" bgcolor="#FFFFEE" " class="a">
		<tr>
			<th>招聘信息</th>
			<th>发布时间</th>
			<th>查看详情</th>

		</tr>
		<s:iterator value="tbJobs" status="tbJob">
			<tr>
				<td><s:property value="jobTitle" /></td>
				<td><s:date name="jobDate" format="yyyy-MM-dd " /></td>
				<td><a
					href="<%=request.getContextPath()%>/page/studentJobContent?jobId=<s:property value='jobId'/>&stuId=<s:property value='tbStudent.stuId'/>">详情</a>
				</td>
			</tr>
		</s:iterator>

		<tr align="center">
			<td colspan="3"><a
				href="<%=request.getContextPath()%>/page/studentJobList?stuId=<s:property value='tbStudent.stuId'/>&currentPage=1">首页</a>
				<a
				href="<%=request.getContextPath()%>/page/studentJobList?stuId=<s:property value='tbStudent.stuId'/>&currentPage=<s:property value='currentPage-1'/>">[上一页]</a>
				<a
				href="<%=request.getContextPath()%>/page/studentJobList?stuId=<s:property value='tbStudent.stuId'/>&currentPage=<s:property value='currentPage'/>"><s:property
						value="currentPage" /> </a> <s:if test="currentPage <=total-1">
					<a
						href="<%=request.getContextPath()%>/page/studentJobList?stuId=<s:property value='tbStudent.stuId'/>&currentPag=<s:property value='currentPage+1'/>"><s:property
							value="currentPage+1" /> </a>
				</s:if> <s:if test="currentPage <=total-2">
					<a
						href="<%=request.getContextPath()%>/page/studentJobList?stuId=<s:property value='tbStudent.stuId'/>&currentPage=<s:property value='currentPage+2'/>"><s:property
							value="currentPage+2" /> </a>
				</s:if> <a
				href="<%=request.getContextPath()%>/page/studentJobList?stuId=<s:property value='tbStudent.stuId'/>&currentPage=<s:property value='currentPage+1'/>">[下一页]</a>
				<a
				href="<%=request.getContextPath()%>/page/studentJobList?stuId=<s:property value='tbStudent.stuId'/>&currentPage=<s:property value='total'/>">[尾页]</a>
			</td>
		</tr>
	</table>
</body>
</html>
