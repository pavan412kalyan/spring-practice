
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  
       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>


<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />		  
		  
</head>

<body>

<div id="container">

<form:form   action="saveCustomer" modelAttribute="customer" method="POST">

<!-- associate data with cus ID -->
<form:hidden path="id"/>

First Name : <form:input path="firstName"/>
<br>
Last Name : <form:input path="lastName"/>
<br>

email <form:input path="email"/>
<br>

<input type="submit" value="save">


</form:form>

<a href="${pageContext.request.contextPath}/customer/list"> go back </a>

</div>











</body>
</html>