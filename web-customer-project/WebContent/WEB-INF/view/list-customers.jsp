<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>

<head>


<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />


</head>
<body>

<div id="container">  

<div id="content">

<input type ="button" value="AddCustomer"
   onclick="window.location.href='showFormForAdd'; return false;"
   class ="add-button"/> 



<!--  add a search box -->
            <form:form action="search" method="GET">
                Search customer: <input type="text" name="theSearchName" />
                
                <input type="submit" value="Search" class="add-button" />
            </form:form>


<table>
<tr>
<th>firstName</th>
<th>lastName</th>
<th>Email</th>

<th>Action</th>


</tr>
 <c:forEach var="temp" items="${customers}">
 
 <c:url var="updateLink" value="/customer/showFormUpdate">
 
 <c:param name="customerId" value="${temp.id }"></c:param>
 
 </c:url>
 
 <c:url var="deleteLink" value="/customer/deleteCustomer">
 
 <c:param name="customerId" value="${temp.id }"></c:param>
 
 </c:url>
 
 
  <tr>
  <td>  ${temp.firstName}  </td>
   <td>  ${temp.lastName}  </td>
   <td>  ${temp.email}  </td>
    <td> <a href="${updateLink}"> Update</a>  </td>
        <td> <a href="${deleteLink}"
         onclick="if (!(confirm('are u sure'))) return false"> Delete</a>  </td>
    
   
   
  </tr>
 
 </c:forEach>

</table>
 </div>

 </div>
</body>















</html>