<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>My JSP 'compUpdateJob.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
</head>

<body>
	<div align="center">
		<form
			action="<%=request.getContextPath()%>/page/compUpdatsJob?compUsername=<s:property value='compUsername'/>"
			method="post">
			<s:property value="compUsername" />
			<input type="text" size="30" name="jobId" value='${tbJob.jobId}'><br>
			<br> 标题：<input type="text" size="60" name="jobTitle"
				value='${tbJob.jobTitle}'><br />
			<br /> 内容：
			<s:textarea name="jobCon" class="ckeditor" value="%{tbJob.jobCon}"></s:textarea>
			<br>
			<br> <input type="submit" value="修改">
		</form>
		<script type="text/javascript">
    CKEDITOR.replace('jobCon');
    </script>
	</div>
</body>
</html>
