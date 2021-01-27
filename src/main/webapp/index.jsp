<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>welcome to hcl</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}
header  {
  background-image: url("C:\Users\Mahesh\Desktop\hcl.png");

}
body {
  margin: 0;
}

/* Style the header */
.header {
  background-color: #f1f1f1;
  padding: 20px;
  text-align: center;
}

/* Style the top navigation bar */
.topnav {
  overflow: hidden;
  background-color: #333;
}

/* Style the topnav links */
.topnav a {
  float: right;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* Create three unequal columns that floats next to each other */
.column {
  float: left;
  padding: 10px;
}

/* Left and right column */
.column.side {
  width: 25%;
}

/* Middle column */
.column.middle {
  width: 50%;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .column.side, .column.middle {
    width: 100%;
  }
}
</style>
</head>
<body>

<div class="header">
<h1> <i>WELLCOME</i></h1>
</div>

<div class="topnav">
  <a href="hello">Admin login</a>
   <a href="userloginform">User Login</a>
  <a href="register">click here for user registeration</a>  
</div>


  
  
  <p><b>HCL Technologies Limited is an Indian multinational information technology (IT) services and consulting company headquartered in Noida, Uttar Pradesh, India. It is a subsidiary of HCL Enterprise. Originally a research and development division of HCL, it emerged as an independent company in 1991 when HCL entered into the software services business.[8] The company has offices in 44 countries including United Kingdom, United States, France, and Germany with a worldwide network of R&D, "innovation labs" and "delivery centers", and 147,123 employees and its customers include 250 of the Fortune 500 and 650 of the Global 2,000 companies.
 </b> </p>
 
</body>
</html>
