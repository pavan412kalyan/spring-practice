<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>

<title>STUDENT REGIS FORM</title>
<body>
<form:form   action="processForm" modelAttribute="student">

First Name : <form:input path="firstName"/>
<br>
Last Name : <form:input path="lastName"/>
<br>
Country:

<form:select path="country" >
<form:options items="${countryOptions}"/>

</form:select>

JAVA<form:radiobutton path="code" value="JAC+VA"/><br>
C_<form:radiobutton path="code" value="C_"/><br>
C*<form:radiobutton path="code" value="C*"/>

<br>

WIN<form:checkbox path="systems" value="WIND"/>
MAC<form:checkbox path="systems" value="MAC"/>
LIN<form:checkbox path="systems" value="LIN"/>




<input type="submit" value="submit">


</form:form>


</head>




</body>




</html>



