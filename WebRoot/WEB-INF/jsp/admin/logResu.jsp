<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>用户名密码错误，请重新登陆</p>
<form action="${pageContext.request.contextPath }/admin_login.action" method="post" >
用户名:
<input type="text" name="issuername" />
<br />
密码:
<input type="password" name="password" />
<input type="submit" value="登录">
</form><br><br>
</body>
</html>