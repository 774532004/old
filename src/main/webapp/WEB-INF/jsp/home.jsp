<%@ page pageEncoding="utf-8" 
contentType="text/html; charset=utf-8" %>
<html>
	<head>
		<title>SSH</title>
	</head>
	<body>
		<%@include file="header.jsp" %>
	
		<div id="content_wrapper">
			<div id="content">
				<h3>Hello, Struts!</h3>
				<h3>Welcome, ${session.username }!</h3>
				<ul>
					<li><a href="${pageContext.request.contextPath }/main/validateImage.action">下载随机验证码图片</a>
					<li><a href="${pageContext.request.contextPath }/main/downLoadExcel.action">下载Excel文档</a>
					<li><a href="${pageContext.request.contextPath }/main/simpleJson.action">显示一段json</a></li>
					<li><a href="${pageContext.request.contextPath }/main/simpleJson.action">显示完整json</a></li>
					<li><a href="${pageContext.request.contextPath }/main/simpleJson.action">显示一段json</a></li>
				</ul>
			</div>
		</div>
	</body>
</html>