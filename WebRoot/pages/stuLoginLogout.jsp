<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getRequestURI();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<base href="<%=basePath%>">
<title>学生登录页面</title>

<!-- Bootstrap -->
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/style.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<style type="text/css">
a:link {
	color: red;
	text-decoration: none;
}

a:visited {
	color: red;
	text-decoration: none;
}

a:hover {
	color: red;
	text-decoration: none;
}

a:active {
	color: red;
	text-decoration: none;
}
</style>
</head>
<body>
	<div class="container">
		<!--登录表单-->
		<div class="logoutPage">
			<div class="row">
				<div class="col-sm-12">
					<div class="signin">

						<br /> <br /> <br /> <br /> <br /> <br />

						<h4 align="center">
							<strong><a href="../pages/stuLogin.jsp">重新登录</a> </strong>&nbsp;&nbsp;
							<strong><a href="../pages/index.html">回到首页</a> </strong>
						</h4>

					</div>
				</div>
			</div>

		</div>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="../js/jquery-2.1.4.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="../js/bootstrap.min.js"></script>
</body>
</html>
