<%-- 
    Document   : ImageRetrieve
    Created on : Jul 11, 2021, 11:37:53 PM
    Author     : This-pc
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        
           try {
             Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event_Managment" , "khan" , "Bhopal@06");
          String select = "select * from images where id=17";
            PreparedStatement ps = con.prepareStatement(select);
           ResultSet rs =  ps.executeQuery();
           while(rs.next()){
              out.println(""+rs.getString(2));
            String filename = rs.getString(3);
           
           
        %>
        <h1>Hello World!</h1>
        <img src="images/<%= rs.getString(3)%>">
        <% }
           }catch (Exception e) {
            e.printStackTrace();
        }%>
    </body>
</html>
