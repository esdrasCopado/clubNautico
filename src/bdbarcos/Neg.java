/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdbarcos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author copad
 */
public class Neg {
    
    
    public void cliente() {
        Connection con;
        ResultSet resultSet = null;
        Statement statement = null;

        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/peliculas", "root", "");
            statement = con.createStatement();
            resultSet = statement.executeQuery("SELECT* FROM pelicula");
        } catch (SQLException e) {
            Logger.getLogger(FormularioCliente.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
