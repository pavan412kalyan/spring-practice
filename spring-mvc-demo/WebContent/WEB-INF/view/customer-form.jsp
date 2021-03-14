<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>

<title>
Customer Registartion
</title>

<style type="text/css">
.error{color:red}
</style>


</head>
<body>
<form:form action="processForm" modelAttribute="customer">


First Name : <form:input path="firstName" />

<br><br>

last name * :<form:input path="lastName" />
<form:errors path="lastName" cssClass="error" />

<br>

<br><br>

Enter Pass:<form:input path="freePass"/>
<form:errors path="freePass" cssClass="error" />
<br><br>

Enter postalCode:<form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error" />

<br><br>
Enter courseCode:<form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error" />

<input type="submit" value="Submit">

</form:form>




</body>





</html>