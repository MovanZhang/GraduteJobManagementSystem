<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<title>管理员主页</title>
<meta name="description" content="">
<meta name="author" content="templatemo">

<link
	href='http://fonts.useso.com/css?family=Open+Sans:400,300,400italic,700'
	rel='stylesheet' type='text/css'>
<link href="/graduateJob/css/font-awesome.min.css" rel="stylesheet">
<link href="/graduateJob/css/bootstrap.min.css" rel="stylesheet">
<link href="/graduateJob/css/templatemo-style.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body align="center" bgcolor="#efefef">

	<!-- Left column -->
	<div class="templatemo-flex-row">
		<div class="templatemo-sidebar">
			<header class="templatemo-site-header"> <br>
			<div class="square"></div>
			<h1 align="center">ADMIN</h1>
			</header>
			<div class="profile-photo-container">
				<img src="/graduateJob/images/admin-logo.png" alt="Profile Photo"
					class="img-responsive">
			</div>
			<!-- 左导航条-->
			<br>
			<nav class="templatemo-left-nav">
			<ul>
				<li><a target="Conframe"
					href="<%=request.getContextPath()%>/page/adminSearchStu"><i
						class="fa fa-book fa-fw"></i>管理学生信息</a></li>
				<li><a target="Conframe" href="../compList?currentPage=1"><i
						class="fa fa-users fa-fw"></i>管理企业信息</a></li>
				<li><a target="Conframe" href="../jobList?currentPage=1"><i
						class="fa fa-database fa-fw"></i>管理职位信息</a></li>
				<li><a target="Conframe"
					href="<%=request.getContextPath()%>/page/AdminManNoteList?currentPage=1"><i
						class="fa fa-pencil fa-fw"></i>管理公告信息</a></li>
				<li><a target="Conframe" href="../tocount"><i
						class="fa fa-bar-chart fa-fw"></i>统计就业信息</a></li>
				<li><a
					href="<%=request.getContextPath()%>/page/adminLogoutAction"><i
						class="fa fa-eject fa-fw"></i>退出登录</a></li>
			</ul>
			</nav>
		</div>
		<!-- Main content -->
		<div class="templatemo-content col-1 light-gray-bg">
			<div class="templatemo-top-nav-container">
				<div class="row">
					<nav class="templatemo-top-nav col-lg-12 col-md-12">
					<p>Welcome to graduate employment management system!</p>
					</nav>
				</div>
			</div>
			<div class="templatemo-content-container">
				<iframe name="Conframe" id="Conframe" src="../pages/stumain-t.jsp"></iframe>
			</div>
		</div>
	</div>
	<div class="foot">
		<p align="center">Copyright &copy; 2016 JavaEE21实习小组</p>
	</div>

	<!-- JS -->
	<script type="text/javascript"
		src="/graduateJob/js/jquery-1.11.2.min.js"></script>
	<!-- jQuery -->
	<script type="text/javascript"
		src="/graduateJob/js/templatemo-script.js"></script>
	<!-- Templatemo Script -->
	<script>
		$(document).ready(
				function() {
					// Content widget with background image
					var imageUrl = $('img.content-bg-img').attr('src');
					$('.templatemo-content-img-bg').css('background-image',
							'url(' + imageUrl + ')');
					$('img.content-bg-img').hide();
				});
	</script>
</body>
</html>