<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
    <%@ page isELIgnored="false" %>
    <%@ page import="com.mytest.ssm.po.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
 a{color:#666;text-decoration:none;}
		a:hover{font-size:14px;text-decoration:none;color:#ff0000}
 body{color:#666;font:14px/180% Arial, Helvetica, sans-serif, "新宋体";}
.header0{
          width:102%;
		  height:35px;
		  line-height:35px;
		  background:#f0f0f0;
		  margin:-10px}
  .hea_a{width:150px;
         height:35px;
		 float:left;
		 margin-left:30px;
  }
   .hea_b{width:250px;
         height:35px;
		 float:left;
		 margin-left:30px;
  }
  .topbaritem{
  width:110px;
  height:35px;
  float:right;
  }
 
#foot{
	float: left;
	margin: 20px 0 0 -1%;
	height: 160px;
	width: 102%;
	background-color: rgb(233,233,233);
	//line-height: 160px;
}
#fimg{
	float: left;
	margin: 30px 0 0 5%;
	height: 100px;
	width: 30%;
}
#fitem{
	float: left;
	margin: 30px 0 0 22%;
	width: 50%;
	height: 100px;
	font-size: 12px;
	line-height: 100px;
	word-wrap: break-word;
	word-break: break-all;
	color: rgba(0,0,0,0.4);
	text-align: center;
}
</style>
</head>
<body>
<%
   User user = (User)session.getAttribute("User");
   String username;
   if(user==null){
	   username=null;
   }
   else{
	   username=user.getUsername();}
   pageContext.setAttribute("username", username);
  
%>
<div class="header0">
    <c:if test="${username!=null }">
	<div class="hea_a"><font size="" color="#ff0000">欢迎来到TestOnline!</font></div>
    <div class="hea_a">&nbsp;&nbsp;&nbsp;欢迎你！${username}</div>
	<div class="topbaritem"></div>
	<div class="topbaritem"><a href="${pageContext.request.contextPath }/upuserrank.action">升级为白金会员</a></div>
	<div class="topbaritem"><a href="${pageContext.request.contextPath }/lookrecords.action">答题记录</a></div>
	<div class="topbaritem"><a href="/TestOnline/index.jsp">首页</a></div>
    </c:if>
    <c:if test="${username==null }">
    <div class="hea_a"><font size="" color="#ff0000">欢迎来到TestOnline!</font></div>
    <div class="hea_b">你当前为游客状态！&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/golog.action">登陆</a>&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/goregister.action">免费注册</a></div>
    </c:if>
</div>
</body>
</html>