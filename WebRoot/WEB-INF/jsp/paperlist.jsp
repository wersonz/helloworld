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
<br><br><br><br>
<c:if test="${!empty message}">
<h3>${message}</h3>   
</c:if>
<c:if test="${!empty message1}">
<h3>${message1}</h3>   
</c:if>
<form action="${pageContext.request.contextPath }/gopaperlist.action" name="" method="post">
<table width="80%" border="0" align="center"  cellpadding="0" cellspacing="1" bordercolor="#C0C0C0" style="border-collapse: collapse">
<c:forEach items ="${paperList}" var="paper">
 <tr>
      <td width="600" bgcolor="#EFEFEF" height="20">&nbsp;&nbsp;<font size="2"><b>
      <a href="${pageContext.request.contextPath }/gotest.action?paperID=${paper.paperID}">${paper.papername}
      </a></b></font><br><br><br>
    </tr>
</c:forEach>
</table>
</form>
</body>
</html>