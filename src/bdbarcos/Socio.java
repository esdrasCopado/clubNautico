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
    private int id;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String nombre;
    private String telefono;
    private String direccion;
    public Socio(){
    
    }
    public Socio(int id,String nom,String tel,String dir){
        this.nombre=nom;
        this.id=id;
        this.telefono=tel;
        this.direccion=dir;
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

    @Override
    public String toString() {
        return "Socio{" + "id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
    
}
