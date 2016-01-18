<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jQuery, Ajax and Servlet/JSP integration example</title>

<script src="http://code.jquery.com/jquery-1.10.2.js"
	type="text/javascript"></script>
<script src="js/app-ajax.js" type="text/javascript"></script>
</head>
<body>

	<form>
		Enter Your Name: <input type="text" id="userName" />
	</form>
	<br>
	<br>

	<strong>Ajax Response</strong>:
	<div id="ajaxGetUserServletResponse"></div>
    <form action="" >  您喜欢的水果？<br /><br /> 
    <label><input name="Fruit" type="checkbox" value="1" />苹果 </label> 
    <label><input name="Fruit" type="checkbox" value="2" />桃子 </label> 
    <label><input name="Fruit" type="checkbox" value="3" />香蕉 </label> 
    <label><input name="Fruit" type="checkbox" value="4" />梨 </label> 
    </form> 
    <button id="submit">submit</button>
</body>
</html>