<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../../head.jsp"></jsp:include> 
<c:if test="${!empty message}">
<h3>${message}</h3>   
</c:if>
<c:if test="${!empty message1}">
<h3>${message1}</h3>   
</c:if>
<br>
<br>
<br>
<br>
<a href="${pageContext.request.contextPath }/gopaperlist.action">在线测试</a>
</body>
</html>