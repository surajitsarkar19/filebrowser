<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/views/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 5 MVC - HelloWorld Index Page</title>
</head>
<body>

	<%@ include file="/WEB-INF/views/header.jsp" %>
 
	<center>
		<h2>Hello World</h2>
		<h3>
			<a href="hello?name=Eric">Click Here</a>
		</h3>
		<h3>
			<a href="file">Open File Browser</a>
		</h3>
	</center>
	
	<jsp:include page="/WEB-INF/views/footer.jsp" />
	
</body>
</html>