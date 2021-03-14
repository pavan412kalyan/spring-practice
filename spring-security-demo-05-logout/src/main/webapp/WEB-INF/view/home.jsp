<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<html>

<head>
<title>HOME</title>

</head>
<body>

<h1>WELCOME</h1>

qweqw

<form:form action="${pageContext.request.contextPath}/logout" method="POST">
<input type="submit" value="Logout">

</form:form>
</body>




</html>