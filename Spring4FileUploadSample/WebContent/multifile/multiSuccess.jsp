<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File Upload Success</title>
	<link href="<c:url value='/sheet/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/sheet/app.css' />" rel="stylesheet"></link>
</head>
<body>
<div class="success">
			<c:forEach var="fileName" items="${fileNames}">
				 <strong>${fileName}</strong> file upload success!.<br/>
			</c:forEach>
			<br/>
		<a href="<c:url value='/welcome'/>">Homepage</a>
	</div>
</body>
</html>