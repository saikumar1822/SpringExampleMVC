  <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

 pageEncoding="ISO-8859-1"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>

</head>

<body>



 <table border="1" style="border-collapse: collapse">

 <tr>
<th>user id</th>
  <th>User name</th>

  <th>Password</th>

  <th>first name</th>

  <th>last name</th>

  <th>email</th>

  <th>address</th>
  <th>phone</th>

  <th>Edit</th>

  <th>Delete</th>

 </tr>



 <c:forEach var="userList" items="${userList}">

  <tr>
<td><c:out value="${userList.userid}"></c:out></td>
  <td><c:out value="${userList.username}"></c:out></td>

  <td><c:out value="${userList.password}"></c:out></td>

  <td><c:out value="${userList.firstname}"></c:out></td>

  <td><c:out value="${userList.lastname}"></c:out></td>

  <td><c:out value="${userList.email}"></c:out></td>

  <td><c:out value="${userList.address}"></c:out></td>
  
<td><c:out value="${userList.phone}"></c:out></td>

  
  <td><a href="edituser?userid=${userList.userid}">Edit</a></td>

  <td><a href="deleteuser?userid=${userList.userid}">Delete</a></td>

  </tr>

 </c:forEach>



 </table>

</body>

</html>