<%-- 
    Document   : logout
    Created on : Jun 12, 2017, 1:22:54 AM
    Author     : NICE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<%
session.invalidate();
RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
rd.forward(request, response);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
