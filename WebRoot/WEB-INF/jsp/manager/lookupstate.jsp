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
		.user{width:940px;margin-top:30px;margin-left:30px;}
        .user table{text-align:center;width:100%;}
        .user table th,.user table td{border:1px solid #CADEFF;}
        .user table th{background:#f3f3f3;border-top:3px solid #b9b9b9;height:30px;}
        .user table td{padding:10px;color:#444;}
        .user table tbody tr:hover{background:RGB(238,246,255);}
		.username{width:100px;}
        .address{width:60px;}
		.phone{width:140px;}
        .Email{width:200px;}
        .consume{width:90px;}
        .operation span:hover,a:hover{cursor:pointer;color:red;text-decoration:underline;}
		.ch {width:300px;height:50px;margin:30px auto;float:center;}
</style>
</head>
<body>
<div class="header">
	<div class="logo">
	</div>
	</div>
	<div class="page">
	   <div class="sidebar">
	       <ul>
             <li>
			<ul>
			   <li><a href="">管理中心<br></a></li>
			 </ul>
			 </li>	
		    <li>
			     <font size="3px" color="#ff9933">&nbsp;&nbsp;用户管理</font>
			<ul>
			   <li><a href="${pageContext.request.contextPath }/managepaperrank.action">升级为白金会员</a></li>			   
			   <li><a href="${pageContext.request.contextPath }/lookuser.action">用户查看</a></li>
			   <li><a href="admin_category.html">分类管理</a></li>
			 </ul>
			 <li>
			     <font size="3px" color="#ff9933">试卷管理</font>
			<ul>
			   <li><a href="${pageContext.request.contextPath }/managerpaper.action">查看试卷</a></li>
			   <li><a href="${pageContext.request.contextPath }/waitpaper.action">待审核试卷</a></li>
			   <li><a href="${pageContext.request.contextPath }/deletedpaper.action">已删除试卷</a></li>
			 </ul>
			 </li>
			  </li>
		    <li>
			     <font size="3px" color="#ff9933">发布人管理</font>
			<ul>
			   <li><a href="admin_user。html">查看发布人</a></li>
			   <li><a href="#">注销退出</a></li>
			 </ul>
			 </li>
	   </div>
	   <font size="3px" color="#ff9933">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<c:if test="${!empty message}">
<h3>${message}</h3>   
</c:if></font>
	    <div class="box">
        <input type="text" name="search" class="in" placeholder="请输入用户名">
        <input type="button" value="搜索用户" class="search">
    </div>
	   <div class="content">
	       <div class="user">
    <table id="usermanage">
        
        <tr>
            <th>用户名</th>
            <th>性别</th>
			<th>电话</th>
            <th>注册时间</th>
            <th>用户等级</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${userList}" var="user">
        <tr >
			<td class="username" >${user.username }</td>
			<td class="address" >${user.sex }</td>
            <td class="phone" >${user.phone }</td> 
            <td class="Email" >${user.regtime }</td>
            <td class="consume" >${user.userrank }</td>
             <td class="operation">
             <a href="${pageContext.request.contextPath}/uprank.action?userID=${user.userID}">升级为白金会员</a>
        </tr>
        </c:forEach>
        
    </table>
</div> 
 <div class="ch">
	   <div class="operation">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<span >第一页</span>&nbsp&nbsp<span>上一页</span>&nbsp&nbsp<span >下一页</span>&nbsp&nbsp<span >最后一页</span></div>
	   </div>
       </div>
	
</body>
</html>