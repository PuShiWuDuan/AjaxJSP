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
   <title>用户注册</title>
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link href="css/zhuce.css" type="text/css" rel="stylesheet"/>
    <script type="text/javascript">
      function check(){
	
		//先得到用户名 
		var username=document.getElementById("username").value;
		//验证
		if(username==""||username.length<4||username.length>6){
			document.getElementById("error1").style.display="inline";
			return false;
		}
		
		//先得到两次密码
		var passwd1=document.getElementById("passwd").value;
		var passwd2=document.getElementById("passwd2").value;
		
		if(passwd1==""||passwd2==""){
			//$("error2").style.dispaly="inline";
			document.getElementById("error2").innerText="密码不能为空";
			return false;
		}
		if(passwd1.length<3||passwd2.lenght<3){
			//$("error2").style.dispaly="inline";
			document.getElementById("error2").innerText="长度不能小于3";
			return false;
		}
		if(passwd1!=passwd2){
			document.getElementById("error2").innerText="密码不相同";
			return false;
		}
		/*if(passwd1!=passwd2||passwd1.length<3||passwd2.length<3){
			$("error2").style.display="inline";
			return false;
		}*/
		}
</script>
  </head>
   <body>
    <div id="main" class="bgcolor">
     <h1>用户注册</h1>
     <form  action="servlet/AddUserServlet" method="post">
     <table  border="0">
     <tr>
	  <td class="style1"><input class="style1" type="text" id="username" name="username" />
	  </td>
	  <td>
	  <span style="display: none;color: red;font-size: 17px" id="error1">用户名必须在4-6位间</span>
	  </td>
	 </tr>
     <tr>
	  <td><input class="style1" type="password" name="passwd" id="passwd" />
	  </td>
	 </tr>
     <tr>
	  <td><input  class="style1" type="password" name="passwd2" id="passwd2" />
	  </td>
	  <td>
	  <span style="display: inline;color: red;" id="error2"></span>
	  </td>
	 </tr>
     <tr>
	  <td><input class="style2" type="submit" onclick="return check();" value="注册用户">
	  </td><td>
	  <input class="style3" type="reset" value="重新填写"/>
	  </td>
	 </tr>
    </table>
    </form>
    </div>
  </body>
</html>