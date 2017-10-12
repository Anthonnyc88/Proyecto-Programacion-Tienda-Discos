/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Anthonny
 */
public class Musica extends Catalogo {

    public String[] canciones;

    public Musica() {
    }

    public Musica(String[] canciones) {
        this.canciones = canciones;
    }

    public Musica(String[] canciones, String nombre, String autor, String categoria, int precio, int cantidadDisponible) {
        super(nombre, autor, categoria, precio, cantidadDisponible);
        this.canciones = canciones;
    }

    
    public String[] getCanciones() {
        return canciones;
    }

    public void setCanciones(String[] canciones) {
        this.canciones = canciones;
    }
    
    
    

}
