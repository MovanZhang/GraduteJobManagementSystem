<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@	taglib uri="/struts-tags" prefix="s"%>
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

<title>注册界面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
.a {
	text-align: center;
	letter-spacing: 10px;
}

table {
	height: 60%;
	width: 60%; /*  必须设置一个宽度， margin: 0 auto才能使之居于父组件中央*/
	margin: 0px auto; /*  通过设置外边距（margin）中的左右外边距属性为auto使之居于父组件（body）中间*/
}

table tr {
	height: 30px;
	width: 100%;
}
</style>
</head>

<body>
	<p align="center">
		<img src="images/registTop.jpg">
	</p>
	<form action="page/companyRegist" method="post">
		<font color="red" size="2"><s:fielderror /> </font> <font color="red"
			size="2">两次输入密码不一样</font>
		<table width="400" border="1" bordercolor="#99CCFF" bgcolor="#FFFFEE"
			class="a">
			<tr>
				<td colspan="2" align="centeer">企业注册</td>
			</tr>

			<tr>
				<td width="100">帐号</td>
				<td><input type="text" name="tbCompany.compUsername" /></td>
			</tr>

			<tr>
				<td>单位名称</td>
				<td><input type="text" name="tbCompany.compName" /></td>
			</tr>

			<tr>
				<td>所属行业</td>
				<td><select name="tbCompany.compProperty">
						<option value="IT">计算机</option>
						<option value="农业">农业</option>
						<option value="林业">林业</option>
						<option value="制造业">制造业</option>
						<option value="食品业">食品业</option>
						<option value="其他">其他</option>
				</select>
				</td>
				<!--  <input type="text" name="tbCompany.compProperty"  /></td> -->
			</tr>
			<tr>
				<td>单位规模</td>
				<td><select name="tbCompany.compSize">
						<option value="50人以下">50人以下</option>
						<option value="50-100人">50-100人</option>
						<option value="100人以上">100人以上</option>
				</select>
				</td>

				<!-- <td><input type="text" name="tbCompany.compSize"  /></td> -->
			</tr>
			<tr>
				<td>登录密码</td>
				<td><input type="password" name="tbCompany.compPwd" /></td>
			</tr>
			<tr>
				<td>确认密码</td>
				<td><input type="password" name="restuPwd" /></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="确定" />&nbsp;&nbsp;<input
					type="reset" value="重置" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
