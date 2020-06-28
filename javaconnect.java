


import java.sql.*;
import javax.swing.JOptionPane;


public class javaconnect {

    static Connection ConnecrDb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        Connection conn;
        
        public static Connection CooecrDb(){
            
            try{
                Class.forName(" Org.sqlite.JDBC ");
                Connection conn=DriverManager.getConnection("jdbc:sqlite:C:C:\\Users\\ifran\\Documents\\NetBeansProjects\\LibraryManagementSystem\\LibraryNew");
                return conn;
            }
            
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                return null;
            }
        
        
        }  
}

