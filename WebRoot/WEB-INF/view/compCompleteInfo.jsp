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

<title>企业完善信息</title>

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
	letter-spacing: 5px;
	font-size: 20;
}
.b{
padding:40px;
}
table {
	height: 10%;
	width: 91%; /*  必须设置一个宽度， margin: 0 auto才能使之居于父组件中央*/
	margin: 0px auto; /*  通过设置外边距（margin）中的左右外边距属性为auto使之居于父组件（body）中间*/
}

table tr {
	height: 10px;
	width: 100%;
}


</style>
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
</head>

<body class="b">
	<h3>
		<font color="green" size="6px">完善公司信息</font>
	</h3>
	<s:form action="/page/companyPompleteInfo" theme="simple" method="post">
		
					<!-- <s:textfield cssStyle="height:10px"	name="tbCompany.compUsername" readOnly="true" label="用户名"/>-->
					
				
		<table cellspacing="0" width="845" border="1" bordercolor="#99CCFF" bgcolor="#FFFFEE"
			class="a">	
			<tr>
				<td width="400">用户名:</td>
				<td ><s:textfield name="tbCompany.compUsername" readOnly="true" label="用户名" cssStyle="border:0;width:845"/></td>
			</tr>		
			<tr>
				<td >单位名称:</td>
				<td><s:textfield name="tbCompany.compName" label="单位名称" cssStyle="border:0;width:845"/></td>
			</tr>
			<tr>
				<td>单位性质:</td>
				<td><s:textfield name="tbCompany.compProperty" label="单位性质" cssStyle="border:0;width:845"/>
				</td>
			</tr>
			<tr>
				<td>所属行业:</td>
				<td><s:textfield name="tbCompany.compIndustry" label="所属行业" cssStyle="border:0;width:845"/>
				</td>
			</tr>
			<tr>
				<td>单位规模:</td>
				<td><s:textfield name="tbCompany.compSize" label="单位规模" cssStyle="border:0;width:845"/></td>
			</tr>
			<tr>
				<td >单位所在地:</td>
				<td ><s:textfield name="tbCompany.compAddress" label="单位所在地" cssStyle="border:0;width:845"/>
				</td>
			</tr>
			<tr>
				<td >联系人:</td>
				<td><s:textfield name="tbCompany.compConPer" label="联系人" cssStyle="border:0;width:845"/></td>
			</tr>
			<tr>
				<td >电子邮箱:</td>
				<td><s:textfield name="tbCompany.compEmail" label="电子邮箱" cssStyle="border:0;width:845"/></td>
			</tr>
			<tr>
				<td>联系电话:</td>
				<td><s:textfield name="tbCompany.compTel" label="联系电话" cssStyle="border:0;width:845"/></td>
			</tr>
			<tr>
				<td >邮政编码:</td>
				<td><s:textfield name="tbCompany.compZipCode" label="邮政编码" cssStyle="border:0;width:845"/>
				</td>
			</tr>
			<tr>
				<td >单位简介:</td>
				<td align="center" ><s:textarea name="tbCompany.compIntro" label="单位简介"
						class="ckeditor" /></td>
			</tr>
			<tr>
				
				<td colspan="2"><s:submit value="提交" align="center" /> <s:reset value="重置"
						align="center" /></td>
			</tr>
		</table>
	</s:form>
	<script type="text/javascript">
		CKEDITOR.replace('tbCompany.compIntro');
	</script>
</body>
</html>
