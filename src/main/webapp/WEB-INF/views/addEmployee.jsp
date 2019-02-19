<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/views/taglib.jsp"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="initial-scale=1, maximum-scale=1">
		<link rel="stylesheet" href="<c:url value="/webjars/bootstrap/4.1.3/css/bootstrap.min.css"/>">
		<script type="text/javascript" src="<c:url value="/webjars/jquery/3.3.1/jquery.min.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/webjars/bootstrap/4.1.3/js/bootstrap.min.js"/>"></script>
		<title>Add Employee</title>
	</head>
	</head>
	<body>
	
		<div class="container">
			<h3>Welcome, Enter The Employee Details</h3>
			<c:url var="addUrl" value="/employee/add"/>
	        <form:form method="POST"
	          action="${addUrl}" modelAttribute="employee">
	             <table class="table">
		             <tbody>
		             	<tr>
		                    <td><form:label path="id">Ids</form:label></td>
		                    <td><form:input path="id"/></td>
		                </tr>
		                <tr>
		                    <td><form:label path="firstName">First Name</form:label></td>
		                    <td><form:input path="firstName"/></td>
		                </tr>
		                <tr>
		                    <td><form:label path="lastName">Last Name</form:label></td>
		                    <td><form:input path="lastName"/></td>
		                </tr>
		                <tr>
		                    <td><input type="submit" value="Submit" class="btn btn-primary"/></td>
		                </tr>
		             </tbody>
	            </table>
	            
	        </form:form>
		</div>
	
	</body>
</html>