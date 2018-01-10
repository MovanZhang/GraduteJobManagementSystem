<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>添加文件域多文件上传</title>
<script type="text/javascript">
	function addFileComponent() {
		var uploadHTML = document
				.createElement("<input type='file' name='multiFile'/>");
		document.getElementById("files").appendChild(uploadHTML);
		uploadHTML = document.createElement("<br>");
		document.getElementById("files").appendChild(uploadHTML);
	}
</script>


<style type="text/css">
.a {
	letter-spacing: 0px;
	padding: 40px;
}
</style>
</head>
<body align="center" bgcolor="#efefef" class="a">

	<!--  <s:fielderror></s:fielderror>-->
	<form action="multiFile.action" method="post"
		enctype="multipart/form-data">
		任意多文件上传:<br> <input type="button" value="增加文件"
			onclick="addFileComponent()"><br>
		<br> <input type="file" name="multiFile" size='50'><br>
		<!--第一个文件域-->
		<br>
		<br> <input type="submit" value="上传"> <input type="reset">
	</form>
</body>
</html>