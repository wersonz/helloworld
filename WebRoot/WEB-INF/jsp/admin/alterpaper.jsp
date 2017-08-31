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
<jsp:include page="admin_issuer.jsp"></jsp:include> 
<c:if test="${!empty message}">
<h3>${message}</h3>   
</c:if>
<form action="${pageContext.request.contextPath }/subAlterPaper.action" method="post">
<input type="hidden" name="paperID" value=${testPaper.paperID } />
<table width="700" border="0" align="left" cellpadding="0" cellspacing="2">
<tr><td height="25">试卷名：</td><td><input name="papername" value="${testPaper.papername}" type="text" size="40" /></td></tr>
<tr>
<td width="180" height="25">选择分类：</td>
<td><select name="classname">
<option value="1" selected>1</option>
<option value="2" selected>2</option>
<option value="3" selected>3</option>
<option value="4" selected>4</option></select>
</td>
</tr>
<tr><td height="25">试题数目：</td>
<td><input name="testsnum" value="${testPaper.testsnum}" type="text" size="15" /></td></tr>

<tr><td height="25">总分：</td>
<td><input name="totalscore" value="${testPaper.totalscore}" type="text" size="15" /></td></tr>

<tr><td >分析A：</td>
<td><textarea name="analyzeA"  cols="50" rows="5">${testPaper.analyzeA}</textarea></td></tr>
<tr><td >分析B：</td>
<td><textarea name="analyzeB"  cols="50" rows="5">${testPaper.analyzeB}</textarea></td></tr>
<tr><td >分析C：</td>
<td><textarea name="analyzeC"  cols="50" rows="5">${testPaper.analyzeC}</textarea></td></tr>

</table>
<input type="submit" value="提交" />
</form>
</body>
</html>