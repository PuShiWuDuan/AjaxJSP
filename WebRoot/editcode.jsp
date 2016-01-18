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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 <title>runcode</title>

	<style type="text/css">
		
		.pre {
			height:600px;
			overflow: hidden; 
			z-index: 999;
		}
	
	</style>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
  </head> 
   
  <body> 
  <h1>测试案例代码</h1>
			<!--下面是代码任务部分-->
				<div class="scroll">
				
				
				
					<pre>
					
						proc createIPv6{packetName}{
						set type ""
						findProtocolType type $packetName;
						set names[split $type ","]
						foreach protocol $names{
							switch -exact --$protocol{
							"ICMPv6"{
								vip6 ICMP $packetName;
							 }
							 default{}
							}
						}
						
						}
						
					   
					</pre>
					
				</div>
 
 
 
 <script src="/js/extend.js" type="text/javascript"></script>
 </body> 
 </html>