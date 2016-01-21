<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="servlet.GetRunTestSevelet" %>
<%
	String username = session.getAttribute("username").toString();
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
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>运行日志</title>
	<script src="js/add.js" type="text/javascript"></script>
    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery.js" type="text/javascript"></script>

    <script src="js/app-ajax.js" type="text/javascript"></script>
     <script src="js/Dir.js" type="text/javascript"></script>
    <!-- Custom CSS -->
    <link href="css/simple-sidebar.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
				  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				  </button>
				  <a class="navbar-brand" href="#">一致性测试网关</a>
				</div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">文件 <span class="sr-only">(current)</span></a></li>
        <li><a href="#">测试</a></li>
		<li><a href="#">编辑</a></li>
		<li><a href="#">过滤</a></li>
		<li><a href="#">报告</a></li>
		<li><a href="#">工具</a></li>
		
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">帮助 <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu" aria-labelledby="tutorial">
            <li role="presentation"><a href="#">内容一</a></li>
            <li role="presentation"><a href="#">内容二n</a></li>
            <li role="presentation"><a href="#">内容三</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
	  
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
    <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#">Start Bootstrap</a>
                </li>
                <li>
                    <a href="#">6LoWPAN</a>
                </li>
                <%
                	if(username.contains("admin"))
                	 {
 	               // final  ArrayList<ViewJSP.ReadDirs.Node> Dir= RunTestSevelet.res;
 	                    int flag = 0;
 	                 	for(int i=0;i<GetRunTestSevelet.res.size();i++)
 		                 {
              	   		   	 if(!GetRunTestSevelet.res.get(i).Dir.contains("."))
                 		   	 {
                 		    		if(GetRunTestSevelet.res.get(i).rank==0)
                 		    		{
                 		    		    if(flag==1)
                 		    		    {
              			         %>
              			        		</div>
              			   		<%
              			   				}
              			   				else
              			   				{
              			   				    flag=1;
              			   				} 
              			   		%>
              			    <div class="TestExzample"  value="<%=GetRunTestSevelet.res.get(i).rank %>"><%=GetRunTestSevelet.res.get(i).value%>	</div>
							<div class="checkbox"  >
					     <%
									}
									else
									{
						  %>
							<div class="child"><input name="Fruit"  type="checkbox" value="<%=GetRunTestSevelet.res.get(i).Dir%>"><%=GetRunTestSevelet.res.get(i).value%></div>	
							<%
									}
								}
							}
						%>
						</div>
						<%
					}
				 %>
				<input id="btnShow" type="button" value="加载"/>
						
				</ul>		
				</div>
                <li>
                    <a href="#">Fragmentation</a>
                </li>
                <li>
                    <a href="#">Performance Test</a>
                </li>
                <li>
                    <a href="#">Contact</a>
                </li>
            </ul>
			
        </div>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper"  >
            <div class="container-fluid" style="overflow:scroll; height:580px">
                        <p>&nasp </p>
						<div class="list-group">							
							<a href="##" class="list-group-item">
								<div class="row" id="row">

								</div>
							</a>
                    </div>		 
        </div>	
			
				<nav class="navbar navbar-default navbar-collapse-1 navbar-inverse">	
						<div class="container">
							<div class="navbar-collapse">
							  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							  </button>
						  
							  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
								<ul class="nav navbar-nav">
									<li class="active"><a href="#">文件 <span class="sr-only">(current)</span></a></li>
									<li><a href="#">用例描述</a></li>
									<li><a href="#">过程图示</a></li>
									<li><a href="#">PDU序列</a></li>
									<li><a href="#">运行日志</a></li>
									<li><a href="#">Muti PDU Sequence</a></li>
								</ul>
							  </div>
							</div>
						</div>
					</nav>	
          
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>

</body>

</html>