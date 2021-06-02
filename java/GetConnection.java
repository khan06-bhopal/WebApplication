
import java.sql.Connection;
import java.sql.DriverManager;


public class GetConnection {
 public static Connection getconnection(){
 Connection con = null;
 try{
    Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java1" , "khan" , "Bhopal@06");
     
 }
 catch(Exception e){
 }
 return con;
 }    
}
