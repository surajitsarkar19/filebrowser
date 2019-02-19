<%@ include file="./taglib.jsp"%>

<spring:url value="/" var="urlHome" />
<spring:url value="/users/add" var="urlAddUser" />

<nav class="navbar navbar-inverse ">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="${urlHome}">Spring MVC Form</a>
		</div>
		<div id="navbar">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="${urlAddUser}">Add User</a></li>
			</ul>
		</div>
	</div>
</nav>

<link rel="stylesheet" href="<c:url value="/webjars/bootstrap/4.1.3/css/bootstrap.min.css"/>">
<script type="text/javascript" src="<c:url value="/webjars/jquery/3.3.1/jquery.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/webjars/bootstrap/4.1.3/js/bootstrap.min.js"/>"></script>