<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<base href="<%=basePath%>"> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TestOnline</title>


</head>
<body>
<jsp:include page="head.jsp"></jsp:include> 
<br><br><br><br>


<a href="${pageContext.request.contextPath }/gopaperlist.action">获取试卷列表</a><br><br>



</body>
</html>