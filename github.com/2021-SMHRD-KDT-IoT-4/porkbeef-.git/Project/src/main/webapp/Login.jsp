<%@page import="com.Model.MembersDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<title>����Ʈ ���� ����</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
		
		
        
  
	</head>
	
	
	<body class="is-preload">
		<div id="page-wrapper">
		
		

			<!-- Header -->
				<div id="header">

					<!-- Logo -->
						<h1><a href="index.jsp" id="logo">����Ʈ ���� ����</a></h1>
					<!-- Nav -->
							<nav id="nav">
								<ul>
									<li><a href="index.jsp"></a></li>
									
								</ul>
							</nav>	

					
				</div>

			<!-- Main -->
				<section class="wrapper style1" style="height: 435px">
					<div class="container">
							
						<form action="login.do" method="post">
							<table style="margin-left: 0px; width: 256px; height: 192px; margin-right: 0px;">
								<tr>
									<td><input type="text" name="id" placeholder="ID�� �Է��ϼ���"><br></td>
								</tr>
								<tr>
									<td><input type="password" name="pw" placeholder="PW�� �Է��ϼ���"><br></td>
								</tr>
								<tr>
									<td id="button"><input type="submit" value="�α���" class="button fit" style="margin-bottom: 10px;"></td>
								</tr>
								<tr>
									<td id="button"><input type="button" value="ȸ������" onClick="location.href='Join.jsp'" class="button fit" style="margin-bottom: 10px;"></td>
								</tr>
							</table>
						</form>
					</div>
						
				</section>

		</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.dropotron.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>