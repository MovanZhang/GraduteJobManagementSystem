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
<html>
<head>
<base href="<%=basePath%>">
<title>我的简历：</title>
<style type="text/css">
.a {
	text-align: center;
	letter-spacing: 10px;
}

.b {
	padding: 40px;
}

table {
	height: 80%;
	width: 80%; /*  必须设置一个宽度， margin: 0 auto才能使之居于父组件中央*/
	margin: 0px auto; /*  通过设置外边距（margin）中的左右外边距属性为auto使之居于父组件（body）中间*/
}

table tr {
	height: 40px;
	width: 100%;
}
</style>
</head>

<body align="center" bgcolor="#efefef" class="b">

	<h3>
		<font color="green" size="6px">我的简历:</font>
	</h3>
	<s:form action="/page/studentUpdateResumeAction" method="post">
		<table width="400" cellspacing="0" border="1" bordercolor="#99CCFF"
			bgcolor="#FFFFEE" class="a">

			<s:textfield name="tbStudent.stuId" label="学号" readOnly="true" />
			<s:textfield name="tbStudent.stuName" label="姓名" />
			<s:radio list="{'男', '女'}" name="tbStudent.stuSex" label="性别" />
			<s:select
				list="{'汉族', '回族','蒙古族','回族','藏族','维吾尔族','苗族','彝族','其他少数民族'}"
				name="tbStudent.stuNation" label="民族">
			</s:select>
			<!-- <s:textfield name="tbStudent.stuNation" label="民族" /> -->
			<s:select list="{'团员','预备党员','党员','群众'}"
				name="tbStudent.stuPolitical" label="政治面貌"></s:select>
			<!--  <s:textfield name="tbStudent.stuPolitical" label="政治面貌" />-->
			<s:textfield name="tbStudent.stuIdNum" label="身份证号" />
			<s:select
				list="{'信息工程学院','机械与电子工程学院','食品科学学院','水利与建筑工程学院','农学院','林学院','动物医学院','动物科技学院','葡萄酒学院','外语系','生命科学学院'}"
				name="tbStudent.stuGraUniversity" label="所在学院"></s:select>
			<!-- <s:textfield name="tbStudent.stuGraUniversity" label="所在学院" /> -->
			<s:textfield name="tbStudent.stuMajor" label="主修专业" size="50" />
			<s:select list="{'本科','硕士','博士'}" name="tbStudent.stuEducation"
				label="学历层次"></s:select>
			<!-- <s:textfield name="tbStudent.stuEducation" label="学历层次" /> -->
			<s:textfield name="tbStudent.stuAdmissionTime" label="入学时间" />
			<s:textfield name="tbStudent.stuGraduateTime" label="毕业时间" />
			<s:textfield name="tbStudent.stuEmail" label="电子邮件" />
			<s:textfield name="tbStudent.stuTelephone" label="联系方式" />
			<s:textarea name="tbStudent.stuAddress" label="通讯地址" />
			<s:textarea name="tbStudent.stuEduBac" label="教育背景" />
			<s:textarea name="tbStudent.stuLanAbi" label="语言能力" />
			<s:textarea name="tbStudent.stuExp" label="实习经历" />
			<s:textarea name="tbStudent.stuProExp" label="项目经验" />
			<s:textarea name="tbStudent.stuRewPun" label="在校期间奖惩情况" />
			<s:textarea name="tbStudent.stuCadres" label="担任学生干部情况" />
			<s:textarea name="tbStudent.stuSelEev" label="自我评价" />
			<s:textarea name="tbStudent.stuSpe" label="特长爱好" />
			<s:submit value="提交" align="center" />
			<s:reset value="重置" align="center" />
		</table>
	</s:form>
</body>
</html>
