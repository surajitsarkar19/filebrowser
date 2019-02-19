<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/views/taglib.jsp"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<meta name="viewport" content="initial-scale=1, maximum-scale=1">
		<link rel='stylesheet' href="<c:url value="/webjars/bootstrap/4.1.3/css/bootstrap.min.css"/>">
		<link rel='stylesheet' href="<c:url value="/resources/css/app.css"/>">
		<script type="text/javascript" src="<c:url value="/webjars/jquery/3.3.1/jquery.min.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/webjars/bootstrap/4.1.3/js/bootstrap.min.js"/>"></script>
		<script type='text/javascript' src="<c:url value="/resources/js/commons.js"/>"></script>
		<script type='text/javascript' src="<c:url value="/resources/js/fileList.js"/>"></script>
		
		<link rel="stylesheet" href="<c:url value="/webjars/jQuery-contextMenu/2.1.1/dist/jquery.contextMenu.min.css"/>">
		<script src="<c:url value="/webjars/jQuery-contextMenu/2.1.1/dist/jquery.contextMenu.min.js"/>"></script>
		<script src="<c:url value="/webjars/jQuery-contextMenu/2.1.1/dist/jquery.ui.position.js"/>"></script>
		
	</head>
	<body>
		<div class="container">
		
			<div class="row">
				<div class="col-md">
					hjdsjkdsjk
					dfgdfgfdg
					fdgdf
					gdfgfd
					gdfg
				</div>
				<div class="col-md-10">
					<nav class="navbar navbar-expand-lg navbar-light bg-light">
			
						<div class="row">
							<div class="col">
								Hello sdss bghtyuuuu
							</div>
							
							<div class="col">
								Hello hi
							</div>
						</div>
			
					</nav>
					 
					<div class="grid-container">
						<c:url var="driveImg" value="/resources/img/disk.png"/>
						<c:url var="folderImg" value="/resources/img/folder.png"/>
						<c:url var="fileImg" value="/resources/img/file.png"/>
						<c:forEach var="file" items="${fileList}">
							<div class="grid-item">
								<c:choose>
									<c:when test="${file.root}">
										<img alt="" src="${driveImg}"/>
									</c:when>
									<c:when test="${file.directory}">
										<img alt="" src="${folderImg}"/>
									</c:when>
									<c:otherwise>
										<img alt="" src="${fileImg}"/>
									</c:otherwise>
								</c:choose>
								<span class="noselect">${file.name}</span>
								<c:url var="redirectedUrl" value="/file/folder">
									<c:param name = "path" value = "${file.path}"/>
								</c:url>
								<input type="hidden" id="filePath" value="${redirectedUrl}"/>
							</div>
							<%-- <li>${file.path} && ${file.directory} && ${file.name} && ${file.root}  </li> --%>
						</c:forEach>
					</div>
		
					
				</div>
			</div>
			
			
			<%-- <jsp:include page="fileItem.jsp" flush="true">
			    <jsp:param name="file" value="${fileList[0]}"/>
			</jsp:include> --%>
		
		</div>
	</body>
</html>