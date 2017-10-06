<%-- 
    Document   : remove
    Created on : Jun 12, 2017, 1:34:21 AM
    Author     : NICE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raxitshah","root","");
    Statement st=con.createStatement();
    String hhh=request.getParameter("name");
    //String name=request.getParameter("name");
   // out.println(name);
   st.executeUpdate("delete from wishlist where name like '"+hhh+"'");
   RequestDispatcher rd=request.getRequestDispatcher("wishlist.jsp");
   rd.forward(request, response);           %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
