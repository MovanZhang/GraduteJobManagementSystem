<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="cn.edu.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Visual Admin Dashboard - Manage Users</title>
<meta name="description" content="">
<meta name="author" content="templatemo">


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
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

	<!-- Main content -->
	<table width="400" border="1" cellspacing="0" bordercolor="#99CCFF"
		bgcolor="#FFFAFA" class="a">
		<s:textfield name="tbStudent.stuName" label="姓名" readOnly="true" />
		<s:textfield name="tbStudent.stuSex" label="性别" readOnly="true" />
		<s:textfield name="tbStudent.stuNation" label="民族" readOnly="true" />
		<s:textfield name="tbStudent.stuPolitical" label="政治面貌"
			readOnly="true" />
		<s:textfield name="tbStudent.stuIdNum" label="身份证号" readOnly="true" />
		<s:textfield name="tbStudent.stuGraUniversity" label="毕业院校"
			readOnly="true" />
		<s:textfield name="tbStudent.stuMajor" label="院系专业" readOnly="true"
			size="50" />
		<s:textfield name="tbStudent.stuEducation" label="学历层次"
			readOnly="true" />

		<s:textfield name="tbStudent.stuAdmissionTime" label="入学时间"
			readOnly="true" />
		<s:textfield name="tbStudent.stuGraduateTime" label="毕业时间"
			readOnly="true" />
		<s:textfield name="tbStudent.stuEmail" label="电子邮件" readOnly="true" />
		<s:textfield name="tbStudent.stuTelephone" label="联系方式"
			readOnly="true" />
		<s:textarea name="tbStudent.stuAddress" label="通讯地址" readOnly="true" />

		<s:textarea name="tbStudent.stuEduBac" label="教育背景" readOnly="true" />
		<s:textarea name="tbStudent.stuLanAbi" label="语言能力" readOnly="true" />
		<s:textarea name="tbStudent.stuExp" label="实习经历" readOnly="true" />
		<s:textarea name="tbStudent.stuProExp" label="项目经验" readOnly="true" />
		<s:textarea name="tbStudent.stuRewPun" label="在校期间奖惩情况"
			readOnly="true" />
		<s:textarea name="tbStudent.stuCadres" label="担任学生干部情况"
			readOnly="true" />
		<s:textarea name="tbStudent.stuSelEev" label="自我评价" readOnly="true" />
		<s:textarea name="tbStudent.stuSpe" label="特长爱好" readOnly="true" />
	</table>
</body>
</html>
