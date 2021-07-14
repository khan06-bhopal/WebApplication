
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class RetriveImage {
    public static void main(String[] args) {
        
        
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event_Managment" , "khan" , "Bhopal@06");
          String select = "select * from images where id=12";
            PreparedStatement ps = con.prepareStatement(select);
           ResultSet rs =  ps.executeQuery();
           if(rs.next()){
               System.out.println(""+rs.getString(2));
               System.out.println(""+rs.getString(3));
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
