import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;    

public class SendMailSSL{   
 public static void main(String[] args) {    
     //from,password,to,subject,message  
     Mailer.send("gardenbook549@gmail.com","Khanma@21","zafar14121995@gmail.com","hello javatpoint","How r u?");  
     //change from, password and to  
 }    
}    