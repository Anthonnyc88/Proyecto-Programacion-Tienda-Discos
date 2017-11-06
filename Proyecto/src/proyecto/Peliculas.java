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
public class Peliculas extends Catalogo{

    public Peliculas() {
    }

    public Peliculas(String nombre, String autor, String categoria, int precio, int cantidadDisponible) {
        super(nombre, autor, categoria, precio, cantidadDisponible);
    }
   
}
