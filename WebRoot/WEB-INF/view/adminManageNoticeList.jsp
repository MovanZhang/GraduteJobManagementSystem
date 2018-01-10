<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>政策公告信息列表</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


</head>
<style type="text/css">
.a {
	text-align: center;
	letter-spacing: 0px;
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
.a{
 text-align:center; 
 letter-spacing:0px;

}
.b{
padding:40px;
}
table {
            height: 20%;
            width: 80%;         /*  必须设置一个宽度， margin: 0 auto才能使之居于父组件中央*/
          margin: 0px auto;  /*  通过设置外边距（margin）中的左右外边距属性为auto使之居于父组件（body）中间*/
        }
            table tr{
                height:20px;
                width: 100%;
               
            }
  
</style>
  <script type="text/javascript">
		function confirmDel(str){ 
		 confirm(str); 
		} 
</script>
<body align="center" bgcolor="#efefef" class="b">

     <div align="center">
     <h3>
				<font color="green" size="6px">政策公告信息列表</font>
			</h3>
   	
    
     		<h3><a href="page/adminManNoteInsert">添加公告</a>
     		<a href="page/adminToUpMultiFileAction">添加照片</a></h3>
 		
	<table width="640"cellspacing="0" border="1" align="center"  border="1" bordercolor="#99CCFF"
					bgcolor="#FFFFEE"  " class="a">
		<tr>
			<td>公告信息</td>
			<td colspan="2">审核操作</td>
		</tr>
		<s:iterator value="policys" status="policy">
			<tr>
				<td><a href="page/AdminManNotecontext?policyId=<s:property value='policyId'/>"><s:property value="policyTitle" /></a>
				</td>
				 <td><a href="page/adminDelNotice?policyId=<s:property value='policyId'/>" onclick="confirmDel('确定要删除吗')">删除</a>
			    </td>	
			     <td><a href="page/adminUpdateNotice?Id=<s:property value='policyId'/>">更新</a>
			    </td>	
			</tr>
		</s:iterator>
		
		<tr align="center">
			<td colspan="3"><a
				href="<%=request.getContextPath()%>/page/AdminManNoteList?currentPage=1">首页</a>
				<a
				href="<%=request.getContextPath()%>/page/AdminManNoteList?currentPage=<s:property value='currentPage-1'/>">[上一页]</a>
				<a
				href="<%=request.getContextPath()%>/page/AdminManNoteList?currentPage=<s:property value='currentPage'/>"><s:property
						value="currentPage" />
			</a> <s:if test="currentPage <=total-1">
					<a
						href="<%=request.getContextPath()%>/page/AdminManNoteList?currentPage=<s:property value='currentPage+1'/>"><s:property
							value="currentPage+1" />
					</a>
				</s:if> <s:if test="currentPage <=total-2">
					<a
						href="<%=request.getContextPath()%>/page/AdminManNoteList?currentPage=<s:property value='currentPage+2'/>"><s:property
							value="currentPage+2" />
					</a>
				</s:if> <a
				href="<%=request.getContextPath()%>/page/AdminManNoteList?currentPage=<s:property value='currentPage+1'/>">[下一页]</a>
				<a
				href="<%=request.getContextPath()%>/page/AdminManNoteList?currentPage=<s:property value='total'/>">[尾页]</a>
			</td>
		</tr>
	</table>
	
</div>
</body>
<ml>