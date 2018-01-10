<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="cn.edu.*"%>
<%@	taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>企业登录首页</title>
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
<body>
	<!-- Left column -->
	<div class="templatemo-flex-row">
		<div class="templatemo-sidebar">
			<header class="templatemo-site-header">
				<br>
				<div class="square"></div>
				<h1 align="center">firm</h1>
			</header>
			<div class="profile-photo-container">
				<img src="/graduateJob/images/company-logo.png" alt="Profile Photo"
					class="img-responsive">
				<div class="profile-photo-overlay"></div>
			</div>
			<br>
			<nav class="templatemo-left-nav">
				<ul>
					<li><a target="Conframe"
						href="<%=request.getContextPath()%>/page/compFindJobList?compUsername=<s:property value='tbCompany.compUsername'/>"><i
							class="fa fa-cog fa-fw"></i>管理职位信息</a></li>
					<li><a target="Conframe"
						href="<%=request.getContextPath()%>/page/compCheckStudentList?compUserName=<s:property value='tbCompany.compUsername'/>"><i
							class="fa fa-book fa-fw"></i>查看应聘信息</a></li>
					<li><a target="Conframe"
						href="<%=request.getContextPath()%>/page/companyPreviewInfoAction?compUsername=<s:property value='tbCompany.compUsername'/>"><i
							class="fa fa-pencil fa-fw"></i>完善企业信息</a></li>
					<li><a
						href="<%=request.getContextPath()%>/page/compLogoutAction"><i
							class="fa fa-eject fa-fw"></i>退出登录</a></li>
				</ul>
			</nav>
		</div>
		<!-- Main content -->
		<div class="templatemo-content col-1 light-gray-bg">
			<div class="templatemo-top-nav-container">
				<div class="row">
					<nav class="templatemo-top-nav col-lg-12 col-md-12">
						<p>
							<!-- <s:property value="tbStudent.stuName" /> -->
							Welcome to graduate employment management system !
						</p>
					</nav>
				</div>
			</div>
			<div class="templatemo-content-container">
				<!-- Second row ends -->
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