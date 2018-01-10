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

<title>修改公告信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<script type="text/javascript" src="../ckeditor/ckeditor.js"></script>
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
	<h3>
		<font color="green" size="6px">修改公告信息:</font>
	</h3>

	<div align="center">
		<form action="<%=request.getContextPath()%>/page/noticeUpdate"
			method="post">
			<input type="hidden" size="30" name="searchid"
				value='${policy.policyId}'><br>
			<br> 标题：<input type="text" size="60" name="title"
				value='${policy.policyTitle}'><br />
			<br /> 内容：
			<s:textarea name="content" class="ckeditor"
				value="%{policy.policyCon}"></s:textarea>
			<br>
			<br>
			<s:submit value="修改" align="center" />
		</form>
		<script type="text/javascript">
			CKEDITOR.replace('content');
		</script>
	</div>
</body>
</html>
