/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Anthonny
 */
public class ArchivoBuscarPelicula {
     
    public boolean buscarPelicula(String nombrePelicula, String autor, String precio ) {
        boolean bandera = false;
        try {

            FileReader r = new FileReader("catalogoPeliculas.txt");// se utiliza para poder leer archivos de texto
            BufferedReader buffer = new BufferedReader(r);//se utiliza para guardar todas las lineas que se obtienen del archivo

            String linea = "";
            /**
             * Ciclo que sirve para leer todo el archivo de manera eficiente la
             * variable temporal temp que almacena el metodo de leer linea sea
             * vacia o nula que para y imprima todas lineas en las que existia
             * algun contenido
             */

            while (linea != null) {

                linea = buffer.readLine();

                if (linea == null) {
                    break;
                }

                String datos[] = linea.split(";");
                
                if (( datos[0].equals(nombrePelicula)) && ( datos[1].equals(autor) && (datos[4].equals(precio) ))) {

                    System.out.println("¡Pelicula encontrada " + ". !");

                    bandera = true;
                }

            }
        } catch (IOException e)// Se nececita del try y el catch para evitar un error 
        // en cuanto a archivos se trata, por ejemplo que el archivo no exista.
        {

            System.out.println(e.getMessage());
        };

        return bandera;

    }

    
    /**
     * Metodo que muestra las Peliculas por categoria
     * @param categoriaPelicula la categoria de las peliculas a buscar
     * @return la informacion basica de la pelicula encontrada
     */
     public String verCategoriaPelicula(String categoriaPelicula ) {
        
         String datosCategoria="";
        
         try {

            FileReader r = new FileReader("catalogoPeliculas.txt");// se utiliza para poder leer archivos de texto
            BufferedReader buffer = new BufferedReader(r);//se utiliza para guardar todas las lineas que se obtienen del archivo

            String linea = "";
           
            while (linea != null) {

                linea = buffer.readLine();

                if (linea==null) 
                    break;
                
               
                if (linea.contains(categoriaPelicula)) {

                    String datos[] = linea.split(";");
                    
                   System.out.println("¡Categoria existente.!");

                    datosCategoria = datos[0] +" / "+datos[1] +" / "+ datos[3];
                }

            }
        } catch (IOException e)// Se nececita del try y el catch para evitar un error 
        // en cuanto a archivos se trata, por ejemplo que el archivo no exista.
        {

            System.out.println(e.getMessage());
        }

        return datosCategoria;

    }
     
     /**
     * Metodo que muestra las Peliculas por categoria
     * @param nombrePelicula la categoria de las peliculas a buscar
     * @return la informacion basica de la pelicula encontrada
     */
     public String verInformacionPelicula(String nombrePelicula ) {
        
         String datosCategoria="";
        
         try {

            FileReader r = new FileReader("catalogoPeliculas.txt");// se utiliza para poder leer archivos de texto
            BufferedReader buffer = new BufferedReader(r);//se utiliza para guardar todas las lineas que se obtienen del archivo

            String linea = "";
           
            while (linea != null) {

                linea = buffer.readLine();

                if (linea==null) 
                    break;
                
               
                if (linea.contains(nombrePelicula)) {

                    String datos[] = linea.split(";");
                    
                   System.out.println("¡Pelicula existente.!");

                    datosCategoria = datos[0] +" / "+datos[1] +" / "+ datos[3] + " / "+datos[4];
                }

            }
        } catch (IOException e)// Se nececita del try y el catch para evitar un error 
        // en cuanto a archivos se trata, por ejemplo que el archivo no exista.
        {

            System.out.println(e.getMessage());
        }

        return datosCategoria;

    }
     
     /**
      * Metodo que permite ver el detalle de las Peliculas
      * para pensar una posible adquisision de la misma
      * @param nombrePelicula el nombre de la pelicula se obtiene de la Interfaz
      * @param directorPelicula el nombre del director , se obtiene de la Interfaz
      * @return el detalle total de la pelicula , es un String
      */
      public String verDetalleInformacionPelicula(String nombrePelicula , String directorPelicula) {
        
         String datosPelicula="";
        
         try {

            FileReader r = new FileReader("catalogoPeliculas.txt");// se utiliza para poder leer archivos de texto
            BufferedReader buffer = new BufferedReader(r);//se utiliza para guardar todas las lineas que se obtienen del archivo

            String linea = "";
           
            while (linea != null) {

                linea = buffer.readLine();

                if (linea==null) 
                    break;
                
               
                if (linea.contains(nombrePelicula) && linea.contains(directorPelicula)) {

                    String datos[] = linea.split(";");
                    
                   System.out.println("Viendo Informacion De "+nombrePelicula);

                    datosPelicula = "Titulo : "+datos[0] +"\nDirector : "+datos[1]+"\nGenero : "+datos[3] +"\nPrecio : "+ datos[4] ;
                }

            }
        } catch (IOException e)// Se nececita del try y el catch para evitar un error 
        // en cuanto a archivos se trata, por ejemplo que el archivo no exista.
        {

            System.out.println(e.getMessage());
        }

        return datosPelicula;

    }
      
      /**
       * Metodo que verifica la cantidad Disponible de cada Pelicula 
       * em el momento que un usuario desee adquirir una copia de Pelicula
       * @param nombrePelicula en nombre de la Pelicula
       * @param directorPelicula el director de la Pelicula , se obtiene de la Interfaz
       * @return la cantidad de Copias de la Pelicula
       */
        public String verificarCantidadDisponiblePelicula(String nombrePelicula , String directorPelicula) {
        
         String cantidaDisponible="";
        
         try {

            FileReader r = new FileReader("catalogoPeliculas.txt");// se utiliza para poder leer archivos de texto
            BufferedReader buffer = new BufferedReader(r);//se utiliza para guardar todas las lineas que se obtienen del archivo

            String linea = "";
           
            while (linea != null) {

                linea = buffer.readLine();

                if (linea==null) 
                    break;
                
               
                if (linea.contains(nombrePelicula) && linea.contains(directorPelicula)) {

                    String datos[] = linea.split(";");
                    
                   System.out.println("Viendo Cantidad Disponible De "+nombrePelicula);

                    cantidaDisponible = datos[2];
                }

            }
        } catch (IOException e)// Se nececita del try y el catch para evitar un error 
        // en cuanto a archivos se trata, por ejemplo que el archivo no exista.
        {

            System.out.println(e.getMessage());
        }

        return cantidaDisponible;

    }
}
