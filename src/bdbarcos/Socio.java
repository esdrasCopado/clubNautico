/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdbarcos;

/**
 *
 * @author copad
 */
public class Socio {
    
    private String nombre;
    private String telefono;
    private String direccion;
    public Socio(){
    
    }
    public Socio(String nom,String tel,String dir){
        nom=nombre;
        tel=telefono;
        dir=direccion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
