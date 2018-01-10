<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查看应聘信息</title>
    
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
	letter-spacing: 5px;
	font-size:20;
}
.b{
padding:40px;
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
  
  <body class="b">
    <table width="400" cellspacing="0"border="1" bordercolor="#99CCFF" bgcolor="#FFFAFA"
		class="a">
		<tr>
			<td>招聘标题</td>
			<td>姓名</td>
			<td>性别</td>
			<td>专业</td>
			<td>操作</td>
		</tr>
		<s:iterator value="comJobStuList" status="comJobStu">
			<tr>
			    <td><s:property value="jobTitle" />
				</td>
				<td><s:property value="stuName" />
				</td>
				<td><s:property value="stuSex" />
				</td>
				<td><s:property value="stuMajor" />
				</td>
				 <td><a href="page/compCheckStuResume?stuId=<s:property value='stuId'/>">详情</a>
			    </td>	
			</tr>
		</s:iterator>
	</table>
  </body>
</html>
