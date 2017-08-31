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
<p align="center"><b><font face="宋体" size="5" color="#FF0000">${TestPaper.papername}</font></b></p>
<c:if test="${!empty message}">
<h3>${message}</h3>   
</c:if>
<c:if test="${!empty message0}">
<h3>${message0}</h3>   
</c:if>
<c:if test="${!empty message1}">
<h3>${message1}</h3>   
</c:if>
<c:if test="${!empty message2}">
<h3>${message2}</h3>   
</c:if>
<table width="80%" border="1" align="center"  cellpadding="5" cellspacing="1" bordercolor="#C0C0C0"  style="border-collapse: collapse">
 <form action="${pageContext.request.contextPath }/addtests.action" method="post">
 <input type="hidden" name="papername" value="${TestPaper.papername}" />
 <input type="hidden" name="paperID" value="${TestPaper.paperID}" />
 <tr>
      <td width="600" height="20">&nbsp&nbsp
                       题目：<textarea name="title"  cols="100" rows="3">${test.title}</textarea>
      <br></td>
    </tr>
    <tr>
      <td width="80%">&nbsp;&nbsp;&nbsp;&nbsp;A选项：<input type="text" name="optionA" value="" size="70" />&nbsp;&nbsp;&nbsp;&nbsp;
                      A选项 分值：<input type="text" name="scoreA" value="" />
      </td>
    </tr>
    <tr>
      <td width="80%">&nbsp;&nbsp;&nbsp;&nbsp;B选项：<input type="text" name="optionB" value="" size="70" />&nbsp;&nbsp;&nbsp;&nbsp;
                      B选项 分值：<input type="text" name="scoreB" value="" />
      </td>
    </tr>
    <tr>
      <td width="80%">&nbsp;&nbsp;&nbsp;&nbsp;C选项：<input type="text" name="optionC" value="" size="70" />&nbsp;&nbsp;&nbsp;&nbsp;
                      C选项 分值：<input type="text" name="scoreC" value="" />
      </td>
    </tr>
     <tr>
      <td width="80%">&nbsp;&nbsp;&nbsp;&nbsp;D选项：<input type="text" name="optionD" value="" size="70" />&nbsp;&nbsp;&nbsp;&nbsp;
                      D选项 分值：<input type="text" name="scoreD" value="" />
      </td>
    </tr>
      <tr>
      <td width="80%">&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="submit" value="添加试题">
      </td>
    </tr>
 </form>
  </table>
  <br>
  <br>
  <table width="80%" border="1" align="center"  cellpadding="5" cellspacing="1" bordercolor="#C0C0C0"  style="border-collapse: collapse">
  <c:forEach items ="${testsList}" var="tests" varStatus="vast">  
   <form action="${pageContext.request.contextPath }/altertests.action" method="post">
  <input type="hidden" name="papername" value="${TestPaper.papername}">
  <input type="hidden" name="testsID" value="${tests.testsID }" />
 <tr>
      <td width="600" bgcolor="#EFEFEF" height="20">&nbsp&nbsp
      ${vast.count}.<textarea name="title"  cols="100" rows="3">${tests.title}</textarea>
      <br></td>
    </tr>

    <tr>
      <td width="80%">&nbsp;&nbsp;&nbsp;&nbsp;A、<input type="text" name="optionA" value="${tests.optionA}" size="70" />&nbsp;&nbsp;&nbsp;&nbsp;
                       分值：<input type="text" name="scoreA" value="${tests.scoreA}" />
      </td>
    </tr>
    <tr>
      <td width="80%">&nbsp;&nbsp;&nbsp;&nbsp;B、<input type="text" name="optionB" value="${tests.optionB}" size="70" />&nbsp;&nbsp;&nbsp;&nbsp;
                       分值：<input type="text" name="scoreB" value="${tests.scoreB}" />
      </td>
    </tr>
    <tr>
      <td width="80%">&nbsp;&nbsp;&nbsp;&nbsp;C、<input type="text" name="optionC" value="${tests.optionC}" size="70" />&nbsp;&nbsp;&nbsp;&nbsp;
                       分值：<input type="text" name="scoreC" value="${tests.scoreC}" />
      </td>
    </tr>
    <tr>
      <td width="80%">&nbsp;&nbsp;&nbsp;&nbsp;D、<input type="text" name="optionD" value="${tests.optionD}" size="70" />&nbsp;&nbsp;&nbsp;&nbsp;
                       分值：<input type="text" name="scoreD" value="${tests.scoreD}" />
      </td>
    </tr>
      <tr>
      <td width="80%">&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="submit" value="提交修改">
      &nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/deletetests.action?testsID=${tests.testsID}">删除试题</a>
      </td>
    </tr>
    </form>
</c:forEach>

  </table>

</body>
</html>