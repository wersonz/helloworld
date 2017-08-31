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
<br><br>
<c:if test="${!empty message}">
<h3>${message}</h3>   
</c:if>
<form action="${pageContext.request.contextPath }/manageradmin.action" method="post" >
用户名:
<input type="text" name="adminname" />
<br />
密码:
<input type="password" name="password" />
<input type="submit" value="登录">
</form>
</body>
</html>