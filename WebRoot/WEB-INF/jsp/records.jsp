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
<form action="" method="post">
<table width="100%" border=1>
<tr>
<td><input type="submit" value="查询"/></td>
</tr>
</table>
<table width="100%" border=1>

        <tr>
            <th>考试记录编号</th>
            <th>试卷</th>
			<th>分数</th>
            <th>分析</th>
            <th>考试时间</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${recordsList}" var="record">
<tr>
	<td>${record.recordsID }</td>
	<td>${record.papername }</td>
	<td>${record.grade }</td>
	<td>${record.analyze }</td>
	<td>${record.testtime}</td>
	<td><a href="">删除</a></td>

</tr>
</c:forEach>
</table>
</form>
</body>
</html>