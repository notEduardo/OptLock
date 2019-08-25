<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Thread Maker</title>
	<jsp:include page="/WEB-INF/jsp/cssfiles.jsp"></jsp:include>
</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
	  	<h1 class="text-center navbar-brand">Optimistic Lock</h1>
	</nav>
	
	<form method="post" action="/thread" target="_blank" style="margin-top: 10%;">
		<div class="text-center">
	      <input class="btn btn-outline-success" type="submit" name="btn_submit" id="btn_submit" value="Create Thread">
	   </div>
	</form>
</body>
</html>