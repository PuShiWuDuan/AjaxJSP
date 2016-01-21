<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  <meta charset="UTF-8">
  <title>~~~测试时刻~~~</title>
  <link href="css/index.css" type="text/css" rel="stylesheet"/>
  <script type="text/javascript">
      function check(){
		var username=document.getElementById("username").value;
		if(username==""){
			alert("要输入用户名的哟~~~如果没有账号，就赶紧来注册一个吧~~~");
			return false;
		}
        var passwd=document.getElementById("passwd").value;
		if(passwd==""){
			alert("亲爱的，你没有输入密码哦~~~");
			return false;
		}
      }
  </script> 
 </head>
 <body>
  <div class="main">
   <div class="top-img"><img class="img1" src="yaoyongde.jpg"/>
   </div>
   <div id="container">
    <div class="left">
	 <form  action="servlet/JudgeLoginServlet" method="post" >
     <table  border="0">
	 <tr>
	  <td>
	  <input type="text" id="username" name="username" placeholder="用户名"/>
	  </td>
	  </tr>
	  <tr>
	  <td>
      <input type="password" name="password" id="password" placeholder="密码"/>
	 </td>
	 </tr>
	 </table>
    </div>
    <div class="right">
     <input type="submit" onMouseOut="this.style.color=blue"  onMouseOver="this.style.color=green" 
        value="登陆"/>
     </form>
	  <form action="yonghuzhuce.jsp" type="post">
     <input type="submit" onMouseOut="this.style.color=blue" onMouseOver="this.style.color=red" value="注册"/>
	  </form>
     </div>
   </div>
  </div>
 </body>
</html>
