<%@page import="com.Model.Detail_Info_DTO"%>
<%@page import="com.Model.MembersDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	    MembersDTO user = (MembersDTO)session.getAttribute("info");	
		if(user == null){
			response.sendRedirect("Login.jsp");
		}
			Detail_Info_DTO dto = (Detail_Info_DTO)session.getAttribute("di_DTO");
		
%>
<!DOCTYPE html>
<html>
	<head>
		<title>����Ʈ ��������</title>
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
								<li><a href="index.jsp">Home</a></li>
								<li><a href="no-sidebar.html">CCTV</a></li>
								<li><a href="no-sidebar.html">��������</a></li>
								<li><a href="no-sidebar.html">��������</a></li>
								<li><a href="no-sidebar.html">��������͸�</a></li>
							</ul>
						</nav>
				</div>

			<!-- Highlights -->
				<section class="wrapper style13">
					<div class="container" >
							<table style="color:white;  margin-left: 50px; margin-bottom: 0px; padding-left: 0px; margin-right: 50px; margin-top: 60px;">
								<tr>
									<td>
										<section style="height: 100px; width: 220px;">
											<a href="#"> 
												<img src="images/pic01.jpg" class="img">
											</a>
											<div style="margin-left: 15px; margin-top: 0px; padding-bottom: 10px; padding-top: 10px; padding-left: 0px; padding-right: 0px; margin-right: 15px;">
													���� : <%=dto.getSalinity() %> %
											</div>
										</section>
									</td>									
									<td>
										<section style="height: 100px; width: 220px;">
											<a href="#"> 
												<img src="images/pic01.jpg" class="img">
											</a>
											<div style="margin-left: 15px; margin-top: 0px; padding-bottom: 10px; padding-top: 10px; padding-left: 0px; padding-right: 0px; margin-right: 15px;">
													�ǳ� �½��� : <%=dto.getIndoor_temp() %>
											</div>
										</section>
									</td>
									<td>
										<section style="height: 100px; width: 220px;">
											<a href="#"> 
												<img src="images/pic01.jpg" class="img">
											</a>
											<div style="margin-left: 15px; margin-top: 0px; padding-bottom: 10px; padding-top: 10px; padding-left: 0px; padding-right: 0px; margin-right: 15px;">
												���� �µ� : <%=dto.getWater_temp()%>
											</div>
										</section>
									</td>
									<td>
										<section style="height: 100px; width: 220px;">
											<a href="#"> 
												<img src="images/pic01.jpg" class="img">
											</a>
											<div style="margin-left: 15px; margin-top: 0px; padding-bottom: 10px; padding-top: 10px; padding-left: 0px; padding-right: 0px; margin-right: 15px;">
												���� �µ� : <%=dto.getWire_temp() %>
											</div>
										</section>
									</td>
									
								</tr>
								<tr>
									<td style="padding-top: 130px;">
										<section style="height: 100px; width: 220px;">
											<a href="#"> 
												<img src="images/pic01.jpg" class="img">
											</a>
											<div style="margin-left: 15px; margin-top: 0px; padding-bottom: 10px; padding-top: 10px; padding-left: 0px; padding-right: 0px; margin-right: 15px;">
												���� ���� : <%=dto.getWater_high() %>
											</div>
										</section>
									</td>									
									<td style="padding-top: 130px;">
										<section style="height: 100px; width: 220px;">
											<a href="#"> 
												<img src="images/pic01.jpg" class="img">
											</a>
											<div style="margin-left: 15px; margin-top: 0px; padding-bottom: 10px; padding-top: 10px; padding-left: 0px; padding-right: 0px; margin-right: 15px;">
												���� ���귮 : <%=dto.getDaily_prod() %>
											</div>
										</section>
									</td>
									<td style="padding-top: 130px;">
										<section style="height: 100px; width: 220px;">
											<a href="#"> 
												<img src="images/pic01.jpg" class="img">
											</a>
											<div style="margin-left: 15px; margin-top: 0px; padding-bottom: 10px; padding-top: 10px; padding-left: 0px; padding-right: 0px; margin-right: 15px;">
												��Ȯ���� �ñ� : <%=dto.getHarvest() %>
											</div>
										</section>
									</td>
									<td style="padding-top: 130px;">
										<section style="height: 100px; width: 220px;">
											<a href="#"> 
												<img src="images/pic01.jpg" class="img">
											</a>
											<div style="margin-left: 15px; margin-top: 0px; padding-bottom: 10px; padding-top: 10px; padding-left: 0px; padding-right: 0px; margin-right: 15px;">
												���� ũ�� : <%=dto.getPlace_size() %>
											</div>
										</section>
									</td>
									
								</tr>
							</table>
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