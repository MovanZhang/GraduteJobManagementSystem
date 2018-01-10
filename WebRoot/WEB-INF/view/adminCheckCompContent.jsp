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
		bordercolor="#99CCFF" bgcolor="#FFFFEE" " class="a">
		<tr>
			<td width="200px" height="40px">单位编号：</td>
			<td><s:property value="tbCompany.compId" />
			</td>
		</tr>
		<tr>
			<td height="40px">单位账号：</td>
			<td><s:property value="tbCompany.compUsername" />
			</td>
		</tr>
		<tr>
			<td height="40px">账号密码：</td>
			<td><s:property value="tbCompany.compPwd" />
			</td>
		</tr>
		<tr>
			<td height="40px">单位名称：</td>
			<td><s:property value="tbCompany.compName" />
			</td>
		</tr>
		<tr>
			<td height="40px">单位性质：</td>
			<td><s:property value="tbCompany.compProperty" />
			</td>
		</tr>
		<tr>
			<td height="40px">所属行业：</td>
			<td><s:property value="tbCompany.compIndustry" />
			</td>
		</tr>
		<tr>
			<td height="40px">单位规模：</td>
			<td><s:property value="tbCompany.compSize" />
			</td>
		</tr>
		<tr>
			<td height="40px">单位所在地：</td>
			<td><s:property value="tbCompany.compAddress" />
			</td>
		</tr>
		<tr>
			<td height="40px">联系人：</td>
			<td><s:property value="tbCompany.compConPer" />
			</td>
		</tr>
		<tr>
			<td height="40px">电子邮箱：</td>
			<td><s:property value="tbCompany.compEmail" />
			</td>
		</tr>
		<tr>
			<td height="40px">联系电话：</td>
			<td><s:property value="tbCompany.compTel" />
			</td>
		</tr>
		<tr>
			<td height="40px">邮政编码：</td>
			<td><s:property value="tbCompany.compZipCode" />
			</td>
		</tr>
		<tr>
			<td height="40px">单位简介：</td>
			<td>${tbCompany.compIntro }</td>
		</tr>
	</table>
</body>
</html>
