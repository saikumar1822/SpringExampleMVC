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

${key}

 <table border="1" style="border-collapse: collapse">

 <tr>
 <th>user_product_id</th>
<th>productid</th>
  <th>product name</th>

  <th>size</th>

  <th>price</th>

  <th>description</th>

  <th>Delete</th>
 </tr>



 <c:forEach var="products" items="${products}">

  <tr>
  <td><c:out value="${products.userproductid}"></c:out></td>
<td><c:out value="${products.productid}"></c:out></td>
  <td><c:out value="${products.productname}"></c:out></td>

  <td><c:out value="${products.size}"></c:out></td>

  <td><c:out value="${products.price}"></c:out></td>

  <td><c:out value="${products.description}"></c:out></td>

  <td><a href="deleteuserproduct?userproductid=${products.userproductid}&userid=${products.userid}">Delete</a></td>

  </tr>

 </c:forEach>



 </table>

</body>

</html>