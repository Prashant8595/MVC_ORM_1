<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>hi this is my view</h1>
   <% 
     String name= (String)request.getAttribute("name");
     Integer id =   (Integer) request.getAttribute("id");
     String email= (String)request.getAttribute("email");
     ArrayList<String>l= (ArrayList)request.getAttribute("fri");
   %>
   
   <h1>my name is <%=name %></h1>
   <p> my email is <%=email %></p>
   <h2>my id is <%=id %></h2>
   <h2>
     <%
       for(String s : l){
    	  
     %>
     <h1><%=s %></h1>
     <%
       }
     %>
     
   </h2>
</body>
</html>