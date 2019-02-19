<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="initial-scale=1, maximum-scale=1">
		<link rel='stylesheet' href='webjars/bootstrap/4.1.3/css/bootstrap.min.css'>
		<script type="text/javascript" src="webjars/jquery/3.3.1/jquery.min.js"></script>
		<script type="text/javascript" src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
		<title>Employee List</title>
		
		<script type="text/javascript">
			$(function(){
				$("#btn-add-employee").click(function(){
					<c:url var="addEmp" value="/employee/add"/>
					window.location.assign("${addEmp}")
				})
			});
		</script>
	</head>
	<body>
	
		<div class="container">
			
			<div class="d-flex">
				<h2 class="flex-grow-1 bd-highlight">Employee Listt</h2>
				<button id="btn-add-employee" class="btn btn-primary">Add Eployee</button>
			</div>
			
			<table class="table">
				<thead>
					<tr>
						<th>Emoployee ID</hr>
						<th>First Name</th>
						<th>Last Name</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="emp" items="${employeeList}">
						<tr>
							<td>${emp.id}</td>
							<td>${emp.firstName}</td>
							<td>${emp.lastName}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	
	</body>
</html>