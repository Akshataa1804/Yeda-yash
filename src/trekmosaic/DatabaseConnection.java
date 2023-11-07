
package trekmosaic;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection {
    private static Connection con;
    public static Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trekmosaicdb", "root" , "Akshu@1804");
            return con; 
            
        } catch(Exception e){
            System.out.print("Database connection failed");
            return null;
        } 
    }
    
    public static void disconnect(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
