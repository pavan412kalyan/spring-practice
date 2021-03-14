<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>

<html>

<head>

<title>STUDENT DISPLAY FORM</title>


</head>

<body>

The student form details is ${student.firstName} ${student.lastName}
 <br>
 ${student.country}
 <br>
 ${student.code}
 
  <br>
 
 OS:
  <br>
 
 <ul>
 <c:forEach var="temp" items="${student.systems}">
 
  <li> ${temp}</li>
 
 </c:forEach>
 
 
 
 </ul>


</body>


</html>



