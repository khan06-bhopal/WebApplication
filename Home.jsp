<%-- 
    Document   : Home
    Created on : May 28, 2021, 3:58:55 AM
    Author     : This-pc
--%>

<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!--css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            contaner {
  width: 100%;
  height: 100vh;
  /* background-color: red; */
background-image: url("images/slide_01.jpg");
  background-repeat: no-repeat;
  background-size: cover;
}
nav {
    width: 100%;
    height: 25vh;
    background-color: rgba(0, 0, 0, 0.411);
    color: white;

    display: flex;
    justify-content: space-between;
    align-items: center;
    text-transform: uppercase;

}

nav .logo {
    width: 20%;
    text-align: center;
    /* background-color: violet; */
}
nav .menu{
      margin-right: 8%;
    width:40%;
    /* background-color: yellow; */
    display: flex; justify-content: space-around;
}
        </style>
    </head>
    
    <body>
        <div class="contaner">
    
    <header> 
      
        <nav>
            
            <div class="logo">
                <h1>welcome</h1>
                 <% 
                     response.setHeader("Cache-Control", "No-Cache , No-Store ");%>
                       
                <h2>    <%ResultSet rs = (ResultSet) session.getAttribute("rs"); 
                        
                      ResultSetMetaData rsmd = rs.getMetaData(); 
                    out.println(rs.getString(4));
                        
                        %></h2>
                  
               
           
            </div>
         <div class="menu">
            
            <a data-toggle="modal" data-target="#profilemodal" href="#">profile</a>
            <a  data-toggle="modal" data-target="#passwordModal" href="#">Delete Account</a>
             <a   href="TestLogout.jsp">Logout</a>
             
         </div> 
      
    </nav>
                
    </header>
 
  

<!--modal-1-->
                    
                 <div class="modal fade" id="profilemodal" >
                  <div class="modal-dialog modal-dialog-centered modal-lg">
                     <div class="modal-content">
                     <div class="modal-header modal-title">
                       
                     </div>
                        <div class="modal-body" >
                            <div id="profile-detail">
                                <table class="table table-dark">
  
                        <tbody>
                          <tr>
      
                              <td><%out.print(rsmd.getColumnName(1));%></td>
                              <td><% out.print(rs.getString(1));%>
      
                        </tr>
                        <tr>
      
                              <td><%out.print(rsmd.getColumnName(2));%></td>
                              <td><% out.print(rs.getString(2));%></td>
      
                        </tr>
                   <tr>
      
                              <td><%out.print(rsmd.getColumnName(3));%></td>
                              <td><% out.print(rs.getString(3));%></td>
      
                        </tr>
                              <tr>
      
                              <td><%out.print(rsmd.getColumnName(4));%></td>
                              <td><% out.print(rs.getString(4));%></td>
      
                        </tr>
                              <tr>
      
                              <td><%out.print(rsmd.getColumnName(5));%></td>
                              <td><% out.print(rs.getString(5));%></td>
      
                        </tr>
                              <tr>
      
                              <td><%out.print(rsmd.getColumnName(6));%></td>
                              <td><% out.print(rs.getString(6));%></td>
      
                        </tr>
                                </tbody>
                                   </table>
                              </div>
                              <!--profilEdi-->
                              
                              <div id="profle-Edit" style="display: none">
                                  
                                 
                                  <h3 class="mt-2">Edit Profile</h3>
                                    <form action="TestEdit">
                                      <table class="table table-dark">
 
  <tbody>
    
      <tr>
      
     <td>ID</td>
      <td><input type="text"  name="id" value = "<% out.println(rs.getInt(1));%>" ></td>
     
    </tr>
      <tr>
      
     <td>Name</td>
      <td><input type="text" class="form-control" name="name" value="<% out.println(rs.getString(2));%>" ></td>
     
    </tr>
    <tr>
      
      <td>Father Name</td>
      <td><input type="text" name="fathername"  value="<% out.println(rs.getString(3));%>"></td>
     
    </tr
    <tr>
      
      <td>Email</td>
      <td><input type="email" name="Emailid"  value="<% out.println(rs.getString(4));%>"></td>
     
    </tr>
   <tr>
      
      <td>Phone</td>
      <td><input type="text" name="phonenumber" value="<% out.println(rs.getString(5));%>"</td>
     
    </tr>
    <tr>
      
      <td>Password</td>
      <td><input type="password" name="password" value="<% out.println(rs.getString(6));%>"></td>
     
    </tr>
    <tr>
      
      <td>Confirm Password</td>
      <td><input type="password"  value="<% out.println(rs.getString(6));%>"></td>
     
    </tr>
    <tr>
      
      
      
     
    </tr>
  </tbody>
</table>
      <div class="container">
          <button type="submit" class="btn btn-primary">Submit</button>
      </div>
                                  </form>
                              </div>
                        </div>
                    
                    <div class="modal-footer">
                        <button class="btn btn-danger" data-dismiss="modal">Cancel</button>
                        <button class="btn btn-primary" id="edit">Edit</button>
                    </div>
                </div>
            </div>
         </div>
<!--/modal-1-->
















<!-- Modal-2-->
<div class="modal fade" id="passwordModal">
            <div class="modal-dialog modal-dialog-centered modal-sm">
                <div class="modal-content">
                    <div class="modal-header modal-title">
                        
                    </div>
                    <div class="modal-body">
                        <form action="TestDelete">
                            
                                
                          
                          <div class="form-group">
                              <label>Enter Email</label>
                              <input type="text" name ="EmailId" class="form-control"/>
                          </div>   
                            <div class="form-group">
                            <label> Password</label>
                            <input type="password" name ="password" class="form-control"/>
                          </div> 
                             <div class="container">
          <button type="submit" class="btn btn-primary">Delete</button>
      </div>
               
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button class="btn btn-danger" data-dismiss="modal">Cancel</button>
                       
                    </div>
                </div>
            </div>
         </div>
            
<!--/modal-2-->






<script
  src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="JS/myjs.js" type="text/javascript"></script>

<script>
    $(document).ready(function(){
        let editstatus = false;
        $('#edit').click(function (){
            if(editstatus == false){
                $("#profile-detail").hide();
                $("#profle-Edit").show();
                  editstatus = true;    
                  $(this).text("Back");
            }
            else{
                $("#profile-detail").show();
                $("#profle-Edit").hide();
                editstatus = false;
                  $(this).text("Edit");
        }
            
        })
    });
</script>
    </body>
</html>
