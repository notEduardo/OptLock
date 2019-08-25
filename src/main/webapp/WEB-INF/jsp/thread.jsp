<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Thread</title>
	<jsp:include page="/WEB-INF/jsp/cssfiles.jsp"></jsp:include>
</head>
<body>
	<form:form method="POST" action="/threadcheck" modelAttribute="data">
		<form:select class="form-control" path="id" size="10" style="overflow-y: auto;">
		   <c:forEach items="${cust}" var="c">
		        <br>
		        <option class="mdata border rounded-lg border-sucess" style="cursor: pointer;" value="${c.id}">
		           Name: ${c.name} --- Salary: ${c.salary} 
		        </option>
	       </c:forEach>
	   </form:select>
	   <br>
	   <br>
       <h4>Change Salary</h4>
       <h5 id="empName"></h5>
       <h4>Current Salary</h4>
       <h5 id="empSal"></h5>
       <h4>New Salary</h4>
       <form:input class="form-control" path="salary" placehoder="New Salary"/>
	   <div class="text-center">
	      <input class="btn btn-outline-success" type="submit" value="Save"/>
	   </div>
	</form:form>
	
	<h2 class="text-center text-danger">${message}</h2>
	
	<jsp:include page="/WEB-INF/jsp/jsfiles.jsp"></jsp:include>
</body>
</html>