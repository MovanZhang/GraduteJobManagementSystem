<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="cn.edu.*"%>
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
<title>毕业生填写就业信息</title>
<style type="text/css">
.a {
	text-align: center;
	letter-spacing: 10px;
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
		<font color="green" size="6px">就业信息：</font>
	</h3>

	<s:form action="/page/stuWriteJobInfo" method="post">
		<table width="640" cellspacing="0" border="1" align="center"
			border="1" bordercolor="#99CCFF" bgcolor="#FFFFEE" " class="a">
			<s:textfield name="tbStudent.stuName" label="姓名" readOnly="true" />
			<s:textfield name="tbStudent.stuId" label="学号" readOnly="true" />
			<s:textfield name="tbStudent.stuJob" label="就业职位" />
			<s:textfield name="tbStudent.stuComp" label="就业公司名称" />
			<s:submit value="提交" align="center" />
		</table>
	</s:form>

</body>
</html>
