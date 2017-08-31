<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新用户注册</title>
<style type="text/css">
 .top{
         width:1200px;
         height:120px;margin:auto;border-bottom:2px solid #f3271d;}
.logo{margin-top:30px;
margin-left:20px;
float:left;}
.btn{width:320px;height:52px;margin:40px auto;}
.user_login{width:300px;height:45px;background:#3a8bda;cursor:pointer;}
.c{width:400px;height:50px;border: solid 1px #ddd;margin:auto;position: relative;z-index: 0;margin-top:40px;}
.c label {
    float: left;
    width: 90px;
    height: 52px;
    line-height: 52px;
    padding-left: 20px;
}
.c1{width:200px;height:25px;float:left;margin-top:13px;margin-left:35px;}
input{border:none}
.c2{}
</style>
</head>
<body>
<div class="top" >
	 <div class="logo">
     </div>
	 <br><br>
	 <font size="6px"color="#4c4c4c">&nbsp&nbsp&nbsp&nbsp欢迎注册</font>
     </div>
     <form action="${pageContext.request.contextPath }/register.action" method="post" >
      <div class="c" >
                    <label>用　户　名</label>
                    <input name="username" class="c1"   placeholder="你的账户名和登录名" type="text">
                    <i class="i-status"></i>
                </div>
                <div class="input-tip">
                    <span></span>
                </div>
				<div class="c" >
                    <label>设 置 密 码</label>
                    <input name="password" class="c1"   placeholder="请输入密码" type="password">
                    <i class="i-status"></i>
                </div>
                <div class="input-tip">
                    <span></span>
                </div>
                <div class="c" >
                    <label>手　机　号</label>
                    <input name="phone" class="c1"   placeholder="电话或手机号" type="text">
                    <i class="i-status"></i>
                </div>
				<div class="c" >
                <label>性     别</label>
                 <select name="sex" class="c1">
                   <option value="男">男</option>
                 <option value="女">女</option>
                  </select>
                  <i class="i-status"></i>
                </div>
                <div class="input-tip">
                    <span></span>
                </div>
				
                <div class="input-tip">
                    <span></span>
                </div>
<div class="btn">
                     <input type="submit" value="立即注册" class="user_login"/>
                  </div>
                  </form>
</body>
</html>

