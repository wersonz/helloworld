<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.content{
           float:left;
		   width:800px;
		   
		   margin-left:300px;
		   position:relative;
		   color:#666;font:12px/180% Arial, Helvetica, sans-serif, "新宋体";
		   }
</style>
</head>
<body>
<jsp:include page="../../head.jsp"></jsp:include> 
<br><br><br><br>
<div class="content">
<p>你的得分：${record.grade}</p>
<p>分析：${record.analyze}</p><br>
<a href="${pageContext.request.contextPath }/gopaperlist.action">继续答题</a>
<a href="${pageContext.request.contextPath }/lookrecords.action">查看答题记录</a>
</div>
</body>
</html>