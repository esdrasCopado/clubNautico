/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdbarcos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class Crud {
    
    
    public void cliente(Socio s) {
        Conexion con=new Conexion();
        Connection co=con.Conexion();
        ResultSet resultSet = null;
        Statement statement = null;

        try {
            
            System.out.println(s.getId()+" "+s.getNombre()+" "+s.getTelefono()+" "+s.getDireccion());
            PreparedStatement pps=co.prepareStatement("INSERT INTO socio(idCliente,nombre,telefono,direccion)VALUES(?,?,?,?);");
            pps.setInt(1, 0);
            pps.setString(2, s.getNombre());
            pps.setString(3, s.getTelefono());
            pps.setString(4, s.getDireccion());

            pps.executeUpdate();
            
            
            con.Conexion().close();
        } catch (SQLException e) {
            Logger.getLogger(FormularioCliente.class.getName()).log(Level.SEVERE, null, e);
        }
       
    }
    public void actualizar(Socio s){
        Conexion con=new Conexion();
        Connection co=con.Conexion();
        ResultSet resultSet = null;
        Statement statement = null;

        try {
            
            System.out.println(s.getId()+" "+s.getNombre()+" "+s.getTelefono()+" "+s.getDireccion());
            PreparedStatement pps=co.prepareStatement("UPDATE socio SET IdCliente=?,nombre=?,telefono=?,direccion=? WHERE idCliente=?");
            pps.setInt(1, s.getId());
            pps.setString(2, s.getNombre());
            pps.setString(3, s.getTelefono());
            pps.setString(4, s.getDireccion());
            pps.setInt(5, s.getId());

            pps.executeUpdate();
            
            
            con.Conexion().close();
        } catch (SQLException e) {
            Logger.getLogger(FormularioCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
