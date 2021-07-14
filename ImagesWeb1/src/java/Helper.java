
import java.io.FileOutputStream;
import java.io.InputStream;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author This-pc
 */
public class Helper {
    public  static boolean savefile(InputStream is , String path){
     boolean b = false;
     
        try {
            byte b1[] = new byte[is.available()];
            
            is.read(b1);
            
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(b1);
            fos.flush();
            fos.close();
            b = true;
        } catch (Exception e) {
         e.printStackTrace();
        }
     
     
     return b;
    }
    
}
