/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdbarcos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author copad
 */
public class Conexion {
    
    private Connection con;
    
    
    
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clubnautico","root","");
            
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
    
}
