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
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
</head>
<body>
<jsp:include page="../../head.jsp"></jsp:include> 
<br>
     <p align="center"><b><font face="宋体" size="5" color="#FF0000">${TestPaper.papername}</font></b></p>
<form action="${pageContext.request.contextPath }/testresult.action" onsubmit="submit()" method="post">
<input type="hidden" name="papername" value="${TestPaper.papername}">
<input type="hidden" id="subScore" name="subScore" type="number" step="0.01"/>
  <table width="80%" border="0" align="center"  cellpadding="0" cellspacing="1" bordercolor="#C0C0C0" style="border-collapse: collapse">
  <c:forEach items ="${testsList}" var="tests" varStatus="vast">  

 <tr>
      <td width="80%" bgcolor="#EFEFEF" height="20">&nbsp;&nbsp;<p style="font-size=2">${vast.count}、${tests.title}</p><br><br><br>
    </tr>

    <tr>
      <td width="80%">&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" onclick="return choose()" name="${tests.testsID}" value=${tests.scoreA}/>A、${tests.optionA}</td>
    </tr>

    <tr>
      <td width="80%">&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" onclick="return choose()" name="${tests.testsID}" value=${tests.scoreB}/>B、${tests.optionB}</td>
    </tr>

    <tr>
      <td width="80%">&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio"  onclick="return choose()" name="${tests.testsID}" value=${tests.scoreC}/>C、${tests.optionC}</td>
    </tr>
    <c:if test="${!empty tests.optionD}">
    <tr>
      <td width="100%">&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio"  onclick="return choose()" id="optionD" name="${tests.testsID}" value=${tests.scoreD} />D、${tests.optionD}</td>
    </tr>
    </c:if>
    
</c:forEach>
  </table>
  
  <p align=center><input type="submit" id="sub" value="交卷"></p>
</form>
<script type="text/javascript">

	 function choose(){
		 var allInput = $("input")
			var subScore = 0;
			for(var i = 0; i < allInput.length; i++){
				if(allInput[i].checked){
			 		subScore += parseFloat(allInput[i].value)
				}
			}
			$("#subScore").val(subScore);
	 }
</script>
</body>
</html>