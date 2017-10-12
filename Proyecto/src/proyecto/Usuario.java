/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Admie21
 */
public class Usuario {
    
    private String nombre;
    private int cedula;
    private String contraseña;
    private String correoElectronico;

    public Usuario(String nombre, int cedula, String contraseña, String correoElectronico) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.correoElectronico = correoElectronico;
    }
    
    public Usuario(){
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", cedula=" + cedula + ", contrase\u00f1a=" + contraseña + ", correoElectronico=" + correoElectronico + '}';
    }
    
    
}
