/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trekmosaic;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ADMIN
 */
public class UserData {
    
    public static int check = 0;
    public static int verify = 0;
    public static int cost = 0;
    public static String CheckSignIn;
    public static int upload = 0;
    public static String filename;
    static String v;
    static int checkverify(String name){
        try {
            Connection con = DatabaseConnection.connect();
            
            String query = "SELECT verification_status FROM user_data WHERE name = ?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, name);
            ResultSet result = stm.executeQuery();
            if(result.next()){
             v = result.getString("verification_status");
            }
            System.out.println("v");
            if("Approved".equals(v)){
                verify = 1;
            } else {
                verify = 0;
            }
          
        } catch (SQLException ex) {
           
        }
        return verify;
    }
    
    public static void setFilename(String txt){
        filename = txt;
    }
    
    public static String getFilename(){
        return filename;
    }
    
    public static void setChecksignIn(String name){
        CheckSignIn = name;
    }
    
    public static String getCheckSignIn(){
        if(check == 1)
            return CheckSignIn;
        else 
            return null; 
    }

}
  