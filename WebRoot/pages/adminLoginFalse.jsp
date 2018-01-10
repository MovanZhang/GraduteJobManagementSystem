<%@ page language="java" pageEncoding="UTF-8"%>
<%@	taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>管理员登录界面</title>
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/style.css" rel="stylesheet">
<script type="text/javascript">
	function reloadcode(obj, base) {
		var rand = new Date().getTime(); //这里用当前时间作为参数加到url中，是为了使URL发生变化，这样验证码才会动态加载，
		//只是一个干扰作用，无确实意义，但却又非常巧妙，呵呵
		obj.src = base + "randomCode.action?abc=" + rand; //其实服务器端是没有abc的字段的。
	}
</script>
</head>
<body>
	<div class="container">
		<!--登录表单-->
	
		<div class="loginPage">
			<div class="row">
				<div class="col-sm-12">
					<div class="signin">
						<form class="form-signin" role="form"
							action="<%=request.getContextPath()%>/page/adminLogin.action"
							method="post">
							<input type="text" name="admin.adminId" class="form-control"
								placeholder="用户名" required autofocus /> <input type="password"
								name="admin.adminPwd" class="form-control" placeholder="密码"
								required /> <input type="text" name="chknumber" id="chknumber"
								maxlength="4" class="form-control" placeholder="验证码">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<img title="看不清楚请点击这里" width="100" height="35"
								src="<%=basePath%>randomCode.action" id="safecode"
								onclick="reloadcode(this,'<%=basePath%>')" align="middle" /> <br>
							<br>
							<p align="center">
			            <font color="red" size="4">用户名、密码或验证码错误</font>
		               </p>
							<button class="btn btn-lg btn-success btn-block" type="submit">登录</button>
						</form>
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
<html>