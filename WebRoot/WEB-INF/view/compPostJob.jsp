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
    
    <title>My JSP 'compPostJob.jsp' starting page</title>
    
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
	font-size:20;
}

table {
	height: 20%;
	width: 80%; /*  必须设置一个宽度， margin: 0 auto才能使之居于父组件中央*/
	margin: 0px auto; /*  通过设置外边距（margin）中的左右外边距属性为auto使之居于父组件（body）中间*/
}

table tr {
	height: 10px;
	width: 100%;
}
</style>

<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
  </head>
  
  <body>
   <div align="center">
   
	<h3>
				<font color="green" size="6px">添加招聘信息</font>
			</h3>
		
		
			<s:form action="/page/compTobInsert" method="post">
        	<table width="900" border="1" align="center"  border="1" bordercolor="#99CCFF"
					bgcolor="#FFFFEE"  " class="a">
					<s:hidden name="compUsername" label="公司登录名"></s:hidden>
			 
			  <s:textfield name="tbJob.jobTitle" label="标题" />			  		 		  
			  <s:textarea name="tbJob.jobCon" label="内容" class="ckeditor"/>
			  <s:submit value="添加" align="center" />    		  
            </table>                
		</s:form>
		<script type="text/javascript">
    CKEDITOR.replace('tbJob.jobCon');
    </script>
    </div>
  </body>
</html>
