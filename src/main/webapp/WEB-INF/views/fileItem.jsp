<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/views/taglib.jsp"%>
<div class="container">
	<div class="jumbotron">
	  <h1 class="display-4">${param["file"]}</h1>
	  <%=request.getParameter("file")%>
	  
	  <p class="lead">This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>
	  <hr class="my-4">
	  <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
	  <p class="lead">
	    <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
	  </p>
	</div>
</div>