<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>毕业生就业管理系统</title>
<link href="css/reset.css" rel="stylesheet" type="text/css" />
<link href="css/main.css" rel="stylesheet" type="text/css" />
<link href="css/sub.css" rel="stylesheet" type="text/css" />
<!--导航特效-->
<script type="text/javascript" src="js/jquery-1.js"></script>
<script type="text/javascript" src="js/smartmenu-min.js"></script>
<script type="text/javascript">
	jQuery(window).ready(function() {
		jQuery("#navigation").Smartmenu({
			animationDuration : 350
		});
	});
	//SyntaxHighlighter.all();
</script>
<!--导航特效end-->

<script language="javascript">
	var Obj = ''
	document.onmouseup = MUp
	document.onmousemove = MMove

	function MDown(Object) {
		Obj = Object.id
		document.all(Obj).setCapture()
		pX = event.x - document.all(Obj).style.pixelLeft;
		pY = event.y - document.all(Obj).style.pixelTop;
	}

	function MMove() {
		if (Obj != '') {
			document.all(Obj).style.left = event.x - pX;
			document.all(Obj).style.top = event.y - pY;
		}
	}

	function MUp() {
		if (Obj != '') {
			document.all(Obj).releaseCapture();
			Obj = '';
		}
	}
	</script>
<style type="text/css">
#massage_box {
	position: absolute;
	background: #fff url("images/headerbg.jpg") repeat-x;
	left: 300px;
	top: 49px;
	width: 775px;
	height: 486px;
	filter: dropshadow(color =   #666666, offx =   3, offy =     3, positive =     2
		);
	z-index: 2;
	visibility: hidden;
	/* border-top:3px #ea820e solid;*/
	padding-top: 3px;
}

#mask {
	position: absolute;
	top: 0;
	left: 0;
	width: expression(body.scrollWidth);
	height: expression(body.scrollHeight);
	filter: ALPHA(opacity =         60);
	z-index: 1;
	visibility: hidden
}

.massage { /*border:#036 solid; border-width:1 1 3 1;*/
	width: 100%;
	height: 100%;
	color: #036;
	font-size: 12px;
	line-height: 150%
}

.header {
	color: #fff
}

#massage_box ul {
	margin-right: 25;
	float: left;
	display: block;
}

#massage_box ul li {
	padding-left: 70px;
	font: 12px/24px Candara;
	color: #093079;
}

#massage_box ul li strong {
	height: 47px;
	font: bold 14px/47px Candara;
	color: #093079
}

#massage_box ul li a {
	color: #093079;
	font: 12px/24px Candara;
	text-decoration: none;
	padding-left: 9px;
}

#massage_box ul li a:hover {
	color: #e37006;
	font: 12px/24px Candara;
	text-decoration: none;
	background: url("images/submenulihover.png"/) left center no-repeat;
	padding-left: 9px;
}
a:link {
	color: #000000;
	text-decoration: none;
}

a:visited {
	color: #000000;
	text-decoration: none;
}

a:hover {
	color: #3399FF;
	text-decoration: none;
}

a:active {
	color: #000000;
	text-decoration: none;
}
</style>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>
<body>
	<div id="head">
		<div class="headcontent">
			<div id="sbmlogo"></div>
			<div>
				<p>毕业生就业管理系统</p>
			</div>
			<div class="topright">
				<div class="clear"></div>
				<div id="navigation" class="smartmenu">
					<ul>
						<li><a href="pages/index.html" class="current">首页</a>
						</li>
						<li id=""><a href="pages/zhongxingaikuang.html">中心概况</a>
							<ul>
								<li><a href="pages/xianrenlingdao.html">现任领导</a>
								</li>
								<li><a href="pages/jigoushezhi.html">机构设置</a>
								<li><a href="pages/gongzuozhize.html">工作职责</a>
								</li>
							</ul></li>
						<li id=""><a href="government">政策信息</a></li>
						<li id=""><a href="list">招聘信息</a></li>
						<li id=""><a href="list">用户登录</a>
							<ul>
								<li><a href="pages/adminLogin.jsp">管理员登录</a>
								</li>
								<li><a href="pages/compLogin.jsp">企业登录</a>
								</li>
								<li><a href="pages/stuLogin.jsp">学生登录</a>
								</li>
							</ul></li>
					</ul>
				</div>

			</div>
			<div class="clear"></div>
		</div>
	</div>
	<div id="body" style="background:none">
		<div class="subbanner"
			style="background:url(images/aboutbgbg.jpg) top center repeat-x">
			<div class="subbannercontent"
				style=" width:100%; background:url(images/biye.png) top center no-repeat">
				<div class="subbody" style="padding-top:31px;">
					<div class="subbodyleft">
						<ul>
							<li class="firstli">招聘信息</li>
						</ul>
						<div class="follows"></div>
					</div>
					<div class="subbodyright">
						<div class="location" style="line-height:30px;">
							<a href="pages/index.html">首页</a> - <a href="list">招聘信息</a>
						</div>
						<h2>招聘信息</h2>
						<s:iterator value="list" status="st">
							<div class="newslist bigclass">
								<div id="post-249"
									class="post-249 post type-post status-publish format-standard hentry category-sbm-news">
									<h3>
										<span style="float:left;font-family:微软雅黑;font-size:15px"><a
											href="showjob1?id=<s:property value='jobId'/>"><s:property
													value="jobTitle" /> </a> </span>. <span style="float:right"><s:date
												name="jobDate" format="yyyy-MM-dd " />&nbsp; &nbsp;<a
											href="showjob1?id=<s:property value='jobId'/>" class="more">查看详细</a>
										</span>
									</h3>

								</div>
								<div class="clear"></div>
							</div>
						</s:iterator>
						<div class="page">
							<a href="list?currentPage=1">首页</a> <a
								href="list?currentPage=<s:property value='currentPage-1'/>">[上一页]</a>
							<a href="list?currentPage=<s:property value='currentPage'/>"><s:property
									value="currentPage" /> </a>
							<s:if test="currentPage <=total-1">
								<a href="list?currentPage=<s:property value='currentPage+1'/>"><s:property
										value="currentPage+1" /> </a>
							</s:if>
							<s:if test="currentPage <=total-2">
								<a href="list?currentPage=<s:property value='currentPage+2'/>"><s:property
										value="currentPage+2" /> </a>
							</s:if>
							<a href="list?currentPage=<s:property value='currentPage+1'/>">[下一页]</a>
							<a href="list?currentPage=<s:property value='total'/>">[尾页]</a>

						</div>
					</div>

					<br />


					<div class="clear"></div>
				</div>
			</div>
		</div>
		<div class="clear"></div>
	</div>
	<div id="footer" class="subfooter"
		style="top:150px; background:url(images/subfooterbg.png) bottom center repeat-x;">
		<div class="footercontent">
			<div class="share">
				<span class="follow"><a href="" class="sharetwitter"></a> <a
					href="" class="sharefacebook"></a> </span> <a href="#" class="top"></a>
			</div>
			<div class="links">
				<center>Copyright © 2016校企实训J2EE-21小组. All rights reserved</center>
			</div>
			<div class="clear"></div>
		</div>
	</div>
</body>
</html>
