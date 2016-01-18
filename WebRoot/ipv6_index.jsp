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
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>运行日志</title>
	<script src="js/add.js" type="text/javascript"></script>
    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-1.10.2.js"
	type="text/javascript"></script>
    <script src="js/app-ajax.js" type="text/javascript"></script>
    <!-- Custom CSS -->
    <link href="css/simple-sidebar.css" rel="stylesheet">

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
                <div class="checkbox">
							<label>
							 <!-- <input name="Fruit"  type="checkbox" value="0">  -->
							  分片测试
							</label>
						
					<ul>
				
						<div class="checkbox">
							<label>
							  <input name="Fruit"  type="checkbox" value="1">
							  处理tag不同
							</label>
						</div>
						<div class="checkbox">	
							<label>
							  <input name="Fruit"  type="checkbox" value="2">
							  处理乱序分片
							</label>
						</div>
						<div class="checkbox">	
							<label>
							  <input name="Fruit"  type="checkbox" value="3">
							  处理分片丢失
							</label>
						</div>
						<div class="checkbox">	
							<label>
							  <input name="Fruit"  type="checkbox" value="4">
							  处理分片重叠
							</label>
						</div>
						<div class="checkbox">	
							<label>
							  <input name="Fruit"  type="checkbox" value="5">
							  处理报头压缩
							</label>
						</div>
						<div class="checkbox">	
							<label>
							  <input name="Fruit"  type="checkbox" value="6">
							  重组分片
							</label>
						</div>
						<div class="checkbox">
							<label>
							  <input name="Fruit"  type="checkbox" value="7">
							  重组超时
							</label>
						</div>
						<div class="checkbox">	
							<label>
							  <input name="Fruit"  type="checkbox" value="8">
							  处理分片重叠
							</label>
						</div>
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