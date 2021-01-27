
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring3Example</title>
<script src="C:\Users\Mahesh\Downloads\SpringExampleMVC\src\main\webapp\javascript\validateformreg.js">

</script> 
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
 
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.submit {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style> 
</head>
<body>

<FONT color="red">
${loginFailed}

</FONT>
 
<form:form name="myform" action="edituserdetails"  modelAttribute="user" onsubmit="return validateform()">
<h1>update user</h1>
    <div class="container">
	<table align="center">
	
	<tr>
			<td>User id:<FONT color="red"><form:errors
				path="userid" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="userid" /></td>
		</tr>
	
		<tr>
			<td>User Name:<FONT color="red"><form:errors
				path="username" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="username" /></td>
		</tr>
		<tr>
			<td>Password:<FONT color="red"><form:errors
				path="password" /></FONT></td>
		</tr>
		<tr>
			<td><form:password path="password" /></td>
		</tr>
		<tr>
			<td>First name:<FONT color="red"><form:errors
				path="firstname" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="firstname" /></td>
		</tr>
		
		
		<tr>
			<td>Last name:<FONT color="red"><form:errors
				path="lastname" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="lastname" /></td>
		</tr>
		
		
		<tr>
			<td>Email:<FONT color="red"><form:errors
				path="email" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="email" /></td>
		</tr>
		
		<tr>
			<td>address:<FONT color="red"><form:errors
				path="address" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="address" /></td>
		</tr>
		
		
		<tr>
			<td>Phone:<FONT color="red"><form:errors
				path="phone" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="phone" /></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>
	 </div>
	 
</form:form>
</body>
</html>


</body>
</html>