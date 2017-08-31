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
<style type="text/css">
 a{color:#666;text-decoration:none;}
		a:hover{font-size:14px;text-decoration:none;color:#ff0000}
table{border-collapse:collapse;border-spacing:0;border:0;}
.header{
         width:1200px;
         height:120px; margin:auto;}
.logo{margin-top:30px;
margin-left:20px;
float:left;}
.page{
          width:100%;
          margin:auto;
		  padding-left:50px;}
.sidebar{  margin-top:50px;
          float:left;
		  width:150px;}
.sidebar ul{
             margin:0;
			 padding:0;
			 liststyle:none;
			 line-height:normal;}
.sidebar li{  list-style:none;
              display:table;height:auto;margin:0 auto;   
             }
.sidebar li ul{
             }
.sidebar li li{
				padding:3px 0 4px 0;
				}
.sidebar li li a{
                  text-decoration:none;
				  color:#666;font:12px/180% Arial, Helvetica, sans-serif, "新宋体";
                 }
.sidebar li li a:hover{font-size:14px;text-decoration:none;color:#ff0000}
                       
.sidebar li h4{
				color:#ff9900;
				}
.content{
           float:left;
		   width:1000px;
		   padding-left:30px;
		   position:relative;
		   color:#666;font:12px/180% Arial, Helvetica, sans-serif, "新宋体";
		   }
		   .box{
        width: 380px;
        margin:auto;
        font-family: 'Microsoft YaHei';
        font-size: 14px;
    }
    .in{
        width: 260px;
        border: 1px solid #e2e2e2;
        height: 30px;
        float: left;
        background-size: 25px;
        background-position:5px center;
        padding:0 0 0 40px;
    }
    .search{
        width: 78px;
        height: 32px;
        float: right;
        background:#bebebe;
        text-align: center;
        border:none;
        cursor: pointer;
    }
		.book{width:940px;margin-top:30px;}
        .book table{text-align:center;width:100%;}
        .book table th,.book table td{border:1px solid #CADEFF;}
        .book table th{background:#f3f3f3;border-top:3px solid #b9b9b9;height:30px;}
        .book table td{padding:10px;color:#444;}
        .book table tbody tr:hover{background:RGB(238,246,255);}
		.ordernum{width:50px;}
        .username{width:150px;}
		.price{width:70px;}
        .expencestyle{width:90px;}
        .shipping{width:90px;}
        .ordertime{width:150px;}
		.ordercondition{width:100px;}
        .operation span:hover,a:hover{cursor:pointer;color:red;text-decoration:underline;}
		.ch {width:300px;height:50px;margin:30px auto;float:center;
</style>
</head>
<body>
<jsp:include page="admin_issuer.jsp"></jsp:include> 
<div class="header">
	</div>
	<div class="page">
	   <div class="sidebar">
	   </div>
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
<c:if test="${!empty message3}">
<h3>${message3}</h3>   
</c:if>
	   <font size="3px" color="#ff9933">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp试卷信息</font>
	   <form action="" method="post">
	    <div class="box">
        <input type="text" name="search" class="in" placeholder="请输入试卷名">
        <input type="button" class="search" value="搜索试卷">
    </div>
	   <div class="content">
	       
            <div class="book">
    <table id="">
        
        <tr>
            <th>试卷ID</th>
            <th>试卷名</th>
            <th>发布人ID</th>
            <th>所属类别</th>
            <th>试卷等级</th>
            <th>操作</th>
        </tr>
        
        <c:forEach items="${paperList}" var="paper">
        <tr >
			<td class="ordernum">${paper.paperID }</td>
			<td class="username">${paper.papername }</td>
			<td class="price">${paper.issuerID }</td>
			<td class="expencestyle">${paper.classname }</td>
			<td class="shipping">${paper.paperrank }</td>
             <td class="operation">
             <a href="${pageContext.request.contextPath }/alterpaper.action?paperID=${paper.paperID}">修改</a>&nbsp&nbsp&nbsp
             <a href="${pageContext.request.contextPath }/deletepaper.action?paperID=${paper.paperID}">删除</a>&nbsp&nbsp&nbsp
             <a href="${pageContext.request.contextPath }/looktests.action?paperID=${paper.paperID}">查看试题</a>&nbsp&nbsp&nbsp
             <a href="${pageContext.request.contextPath }/testsmanage.action?paperID=${paper.paperID}">试题管理</a></td>
        </tr>
        </c:forEach>
    </table>
</div> 
 <div class="ch">
	   <div class="operation">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<span >第一页</span>&nbsp&nbsp<span>上一页</span>&nbsp&nbsp<span >下一页</span>&nbsp&nbsp<span >最后一页</span></div>
	   </div>
       </div>
       </form>
	</div>
</body>
</html>