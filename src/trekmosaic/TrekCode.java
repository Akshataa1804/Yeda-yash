/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trekmosaic;

/**
 *
 * @author ADMIN
 */
public class TrekCode {
    public static int x_label = 0;
    public static int y_label = 250;
    public static int width_label = 270;
    public static int height_label = 240;
    
    public int X_Cordinates(int x){
        if(x < 810){
            return x + 270;
        }
        else
        {
            x = 0;
            return x;
        }
    }
    
    public int Y_Cordinates(int x, int y){
        if(x == 810){
            return y + 240;
        }
        else
            return y;
    }
}
