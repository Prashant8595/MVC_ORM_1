<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>hello</title>
</head>
<body>
  <%
   String name= (String)request.getAttribute("name");
   Integer id= (Integer)request.getAttribute("id");
  %>
  
  <h1><%=name %></h1>
  <h2><%=id %></h2>
</body>
</html>