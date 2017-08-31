<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TestOnline</title>
<style type="text/css">
      a{color:#666;text-decoration:none;}
      a:hover{font-size:14px;text-decoration:none;color:#ff0000}
    .top{
         width:1200px;
         height:120px; margin:auto;}
.logo{margin-top:30px;
margin-left:20px;
float:left;}
     .login{width:400px;height:280px;border:1px solid #e8e8e8;border-radius:3px;background:#ffffff;margin:60px auto;position:relative;font-size:12px;color:#999999;}
     .login_right{width:400px;height:280px;float:right;}
     .login_c{width:320px;height:280px;position:absolute;top:40px;right:20px;}
     .user{width:320px;height:64px;}
     .user_text{width:320px}
     .user_in{width:282px;height:30px;line-height:30px;font-size:14px;border:1px solid #cccccc;}
     .btn{width:320px;height:52px;}
     .user_login{width:282px;height:40px;background:#ff0033;cursor:pointer;}
     .manager{width:320px;}
	 .but1{width:100px;margin-left:210px;}
</style>
</head>
<body>
     <div class="top">
	 <div class="logo">
     </div>
     </div>
     <div class="login">
        <div class="login_right">
        <form action="${pageContext.request.contextPath }/login.action" method="post" >
              <div class="login_c">
                  <div class="user">
                      <div class="user_text">
                          <input type="text" name="username" class="user_in"tabindex="1" autocomplete="off" placeholder="用户名"/>
			
                      </div>
                  </div>
                  <div class="user">
                      <div class="user_text">
                          <input type="password" name="password" class="user_in" tabindex="2" autocomplete="off" placeholder="密码"/>
                      </div>
                  </div>
                  <div class="manager">    
                  <div class="btn">
                     <input type="submit" value="登录" class="user_login"/>
                  </div>
                  <a href="/TestOnline/index.jsp">首页</a>
                 
              </div>
               
        </div>
        </form>
      </div>
     </div>
</body>
</html>


