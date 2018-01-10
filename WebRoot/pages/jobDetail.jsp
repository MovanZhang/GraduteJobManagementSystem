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
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

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
	filter: dropshadow(color =         #666666, offx =         3, offy =         3,
		positive =  
		      2);
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
</style>
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
			style="background:url(../images/aboutbgbg.jpg) top center repeat-x">
			<div class="subbannercontent"
				style=" width:100%; background:url(../images/biye.png) top center no-repeat">
				<div class="subbody" style="padding-top:31px;">
					<div class="subbodyleft">
						<ul>
							<li class="firstli">招聘信息</li>
							<li><a href="showjob1?id=<s:property value='tbJob.jobId'/>">详细信息</a>
							</li>
						</ul>
						<div class="follows"></div>
					</div>

					<div class="subbodyright">
						<div class="location" style="line-height:30px;">
							<a href="pages/index.html">首页</a> - <a href="list">招聘信息</a> -
							详细信息
						</div>
						<h2>详细信息</h2>
						<div class="post" id="post-262">
							<h3>
								<span style="font-family:微软雅黑;float:left"><s:property
										value="tbJob.jobTitle" /> </span>. <span
									style="font-family:微软雅黑;float:right"> <s:date
										name="tbJob.jobDate" format="yyyy-MM-dd " /> </span>
							</h3>
							<br />
							<div class="newscontent">
								<div class="entry">
									<table frame="void" align="center" border=0
										bordercolor="#99CCFF" cellspacing="0px" align="center">


										<tr>
											<td>${ tbJob.jobCon} <!--<s:generator val="tbJob.jobCon" separator="<p>">
													<s:iterator>
														<p>
															&nbsp;&nbsp;&nbsp;&nbsp;
															<s:property />
														</p>
													</s:iterator>
												</s:generator>
												-->
											</td>
										</tr>
									</table>
								</div>
							</div>
							<div class="navigation">
								<div class="alignleft"></div>
							</div>

						</div>
						<div class="bottomhelp"></div>
						<h3></h3>
						<div class="clear"></div>
					</div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<div class="clear"></div>

	<div id="footer" class="subfooter"
		style="top:150px; background:url(images/subfooterbg.png) bottom center repeat-x;">
		<div class="footercontent">
			<div class="share">
				<span class="follow"><a href="" class="sharetwitter"></a> <a
					href="" class="sharefacebook"></a> </span> <a href="#" class="top"></a>
			</div>
			<div class="links">Copyright © 2016校企实训J2EE-21小组. All rights
				reserved</div>
			<div class="clear"></div>
		</div>
	</div>
</body>
</html>
