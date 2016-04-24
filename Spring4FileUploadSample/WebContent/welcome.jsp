<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
	<link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
<body>
<div class="form-container">
		<h1>Welcome File Upload</h1>
		
		Please select the following<br/><br/>
		
		<a href="<c:url value='/singleUpload' />">Single file upload</a>  or  <a href="<c:url value='multiUpload' />">Multi file upload</a>
	</div> 
</body>
</html>