<%-- 
    Document   : who
    Created on : Feb 22, 2016, 7:19:46 PM
    Author     : NICE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        //ut.println(request.getParameter("name1"));
        Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raxitshah","root","");
    Statement st=con.createStatement();
        
        
    
        String name=request.getParameter("name");
        String pass=request.getParameter("pass");
        RequestDispatcher rd;
        
        ResultSet rs=st.executeQuery("select count(*) from login where name like '"+name+"' and pass like '"+pass+"'");
        rs.next();
        int ans=rs.getInt(1);
        
        if(ans==1){
            //out.println("Hello");
                    session.setAttribute("live", 1);
                    session.setAttribute("name",name);
        rd=request.getRequestDispatcher("index.jsp");
        }
        else {
        rd=request.getRequestDispatcher("404.html");
        }
        rd.forward(request, response);
        %>
    </body>
</html>
