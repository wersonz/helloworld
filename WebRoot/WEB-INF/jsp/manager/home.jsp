<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
a:hover{font-size:14px;text-decoration:none;color:#ff0000}
.header{
         width:1200px;
         height:120px; margin:auto;}
.logo{margin-top:30px;
margin-left:20px;
float:left;}
.page{
          width:100%;
          margin:auto;
		  height:400px;
		  background:#f8f8f8;
		  padding-left:50px;}
.sidebar{  margin-top:50px;
          float:left;
		  width:150px;
		  height:300px;}
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
.sidebar li li a:hover{font-size:14px;text-decoration:none;color:#ff0000
                       }
.sidebar li h4{
				color:#ff9900;
				}
.content{
           float:left;
		   width:800px;
		   padding-left:100px;
		   position:relative;
		   color:#666;font:12px/180% Arial, Helvetica, sans-serif, "新宋体";
		   }
.pl{
    width:300px;
	height:100px;
     margin-left:300px;
	 margin-top:100px;}
</style>
</head>
<body>
欢迎！
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
	   <div class="content">
           </div>
       </div>
	</div>
</body>
</html>