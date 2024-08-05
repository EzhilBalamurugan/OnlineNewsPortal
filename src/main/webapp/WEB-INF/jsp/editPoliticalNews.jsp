<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"> 
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<style>
body, html {
  height: 100%;
  font-family: Arial, Helvetica, sans-serif;
}
* {
  box-sizing: border-box;
  margin:0;
  padding:0;
}

.bg-img {
  /* The image used */
  background-image: url("https://static2.bigstockphoto.com/0/3/2/large2/230829451.jpg");
  min-height: 380px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
  height:100vh;
  widht:200px;
}
.topnav {
  overflow: hidden;
  background-color: black;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #04AA6D;
  color: white;
}
.topnav-right {
  float: right;
}
.topnav-centered  {
    position: relative;
    top: 0;
    left: 0;
    transform: none;
  }
  .card{
height:300px;
width:600px;
margin: 0 auto; 
float: none; 
margin-bottom: 10px;
margin-top:150px;
background-color:white;
color:black; 
}
</style>
</head>
<body>
   <div class="bg-img">
<div class="topnav">
  <a class="active" href="">Home</a>
  <a href="">News</a>
  <a href=""></a>
  <a href="#about">About</a>
  
  <div class="topnav-centered">
    <a href="center" class="active">THE DAILY HUNT</a>
  </div>
 </div>
 <div class="card">
   <div class="card-body">
  
    <h5 class="card-title" style="font-size:40px">Edit Political News</h5>
  <fm:form action="../editsavePoliticalNews" method="POST" modelAttribute="t">
   <fm:hidden path="id"/>
    <label>Enter Political News </label>
    <fm:input path="politicalNews" placeholder="Enter news" required="required"/>
    <input type="submit" value="Add News"/>
  </fm:form>
  
  </div>
  </div>
  </div>
</body>
</html>