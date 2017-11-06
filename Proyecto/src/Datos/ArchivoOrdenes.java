/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admie21
 */
public class ArchivoOrdenes {
    
    
    /**
     * Metodo que registra las Ordenes ya realizadas
     * @param nombreArchivo el archivo de las Ordenes
     * @param detalleOrden el detalle de la Orden
     */
     public void registrarOrden(String nombreArchivo, String detalleOrden) {
        File f;
        /**
         * se crea un objeto de tipo archivo
         *
         * @param
         */
        f = new File(nombreArchivo);
        /**
         * se asigna el nombre al archivo como parametro obligatorio
         *
         * @param recibe como parametro el nombre archivo
         *
         */

        try {
            FileWriter fw = new FileWriter(f, true);//objeto que permite escribir en el archivo
            BufferedWriter bw = new BufferedWriter(fw);// espacio de memoria para el archivo
            PrintWriter pr = new PrintWriter(bw);//objeto que permite imprimir lo que hay en el archivo

            f = new File(nombreArchivo);
            if (f.exists()) {

                fw = new FileWriter(f, true);//objeto que permite escribir en el archivo
                bw = new BufferedWriter(fw);// espacio de memoria para el archivo

                bw.newLine();
                bw.write(detalleOrden);
            } else {

                fw = new FileWriter(f, true);//objeto que permite escribir en el archivo
                bw = new BufferedWriter(fw);// espacio de memoria para el archivo

                bw.write(detalleOrden);

            }

            bw.close();
            fw.close();

        } catch (IOException e) {
        }

    }
     
      /**
      * Metodo que retorna un arreglo String
      * del contenido en el archivo de PeliculasOrdenes
      * @return un arreglo de String sobre las Peliculas Ordenes
      */
     public String[] listaOrdenesPeliculas() {
 
        ArrayList<String> textoArchivo = new ArrayList<>();
 
        try {
            FileReader archivo = new FileReader("peliculasOrdenes.txt");
            BufferedReader lectorBuffer = new BufferedReader(archivo);
 
            String linea = lectorBuffer.readLine();
 
            while (linea != null) {
                
//                String datos[] =linea.split(";");
//                textoArchivo.add(datos[0]+" / "+datos[1]+" / "+datos[2]+"-");
                
                textoArchivo.add(linea);
                linea = lectorBuffer.readLine();
            }
 
            lectorBuffer.close();
        }
        catch (IOException e) {
        }
 
        String[] array = new String[textoArchivo.size()];
        array = textoArchivo.toArray(array);
 
       return array;
        
   //return "Si funciono Roger pero no quero mandar la lista";
    }
     
        
     /**
      * Metodo que retorna un arreglo String
      * del contenido en el archivo de Canciones  Ordenes
      * @return un arreglo de String sobre las Canciones Ordenes
      */
     public String[] listaOrdenesCanciones() {
 
        ArrayList<String> textoArchivo = new ArrayList<>();
 
        try {
            FileReader archivo = new FileReader("cancionesOrdenes.txt");
            BufferedReader lectorBuffer = new BufferedReader(archivo);
 
            String linea = lectorBuffer.readLine();
 
            while (linea != null) {
                
//                String datos[] =linea.split(";");
//                textoArchivo.add(datos[0]+" / "+datos[1]+" / "+datos[2]+"-");
                
                textoArchivo.add(linea);
                linea = lectorBuffer.readLine();
            }
 
            lectorBuffer.close();
        }
        catch (IOException e) {
        }
 
        String[] array = new String[textoArchivo.size()];
        array = textoArchivo.toArray(array);
 
       return array;

    }
     
     /**
      * Metodo que modifica la cantidad de articulos
      * de una pelicula  para atender un pre orden
      * de buena manera
      * @param nombrePelicula String el nombre de la pelicula por manipular
      * @param nuevaCantidad la nueva cantidad para la Pelicula
      */
     public void modificarCantidadPelicula(String nombrePelicula,String nuevaCantidad){
     
         try {
            String archivo = "catalogoPeliculas.txt";
            FileWriter fileWriter = new FileWriter(archivo, true);
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferWriter);
            
            FileReader fileReader = new FileReader("catalogoPeliculas.txt");
            BufferedReader lectorBuffer = new BufferedReader(fileReader);
            
            ArrayList<String> datosCatalogoPeliculas = new ArrayList();
            String linea;

            while ((linea = lectorBuffer.readLine()) != null) {
                datosCatalogoPeliculas.add(linea);
            }
            
            for (int i = 0; i <datosCatalogoPeliculas.size(); i++) {
             
                if(nombrePelicula.equals(datosCatalogoPeliculas.get(i).split(";")[0])){
                
                    String nombreP,nombreDirector,cantidadPelicula,precioPelicula,generoPelicula;
                    
                    nombreP=datosCatalogoPeliculas.get(i).split(";")[0];
                    nombreDirector=datosCatalogoPeliculas.get(i).split(";")[1];
                    cantidadPelicula=datosCatalogoPeliculas.get(i).split(";")[2];
                    
                    generoPelicula=datosCatalogoPeliculas.get(i).split(";")[3];
                    precioPelicula=datosCatalogoPeliculas.get(i).split(";")[4];
                
                   String peliculaModificada= nombreP+";"+nombreDirector+";"+nuevaCantidad+";"+generoPelicula+";"+precioPelicula;
                   
                   datosCatalogoPeliculas.set(i,peliculaModificada);
                   System.out.println("Se realizo con Exito la Modificacion en la cantidad de la Pelicula "+nombrePelicula);
                   
                    PrintWriter escritor = null;
                    FileWriter fichero = null;
                    try {
                        
                        fichero = new FileWriter(archivo);
                        escritor = new PrintWriter(fichero);
                        escritor.flush();
                        for (int j = 0; j < datosCatalogoPeliculas.size(); j++) {
                            
                            printWriter.write(datosCatalogoPeliculas.get(j));
                            printWriter.println();
                        }
                        escritor.close();
                    } catch (Exception e) {
                        JOptionPane.showConfirmDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }
               
         }

            printWriter.close();
        } catch (Exception e) {
            String error = "No se encontro archivo" + e;
            JOptionPane.showConfirmDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
     
     }
     
      /**
      * Metodo que modifica la cantidad de articulos
      * de un album  para atender un pre orden
      * de buena manera
      * @param nombreAlbum  String el nombre del Album por manipular
      * @param nuevaCantidadAlbum  la nueva cantidad para el Album
      */
     public void modificarCantidadCanciones(String nombreAlbum,String nuevaCantidadAlbum){
     
         try {
            String archivo = "catalogoCanciones.txt";
            FileWriter fileWriter = new FileWriter(archivo, true);
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferWriter);
            
            FileReader fileReader = new FileReader("catalogoCanciones.txt");
            BufferedReader lectorBuffer = new BufferedReader(fileReader);
            
            ArrayList<String> datosCatalogoCanciones = new ArrayList();
            String linea;

            while ((linea = lectorBuffer.readLine()) != null) {
                datosCatalogoCanciones.add(linea);
            }
            
            for (int i = 0; i <datosCatalogoCanciones.size(); i++) {
             
                if(nombreAlbum.equals(datosCatalogoCanciones.get(i).split(";")[0])){
                
                    String nombreAlbumDato,nombreArtista,generoAlbum,precioAlbum,cancion1,cancion2,cancion3,cantidadAlbum;
                    
                    nombreAlbumDato=datosCatalogoCanciones.get(i).split(";")[0];
                    nombreArtista=datosCatalogoCanciones.get(i).split(";")[1];
                    generoAlbum=datosCatalogoCanciones.get(i).split(";")[2];
                    precioAlbum=datosCatalogoCanciones.get(i).split(";")[3];
                    cancion1=datosCatalogoCanciones.get(i).split(";")[4];
                    cancion2=datosCatalogoCanciones.get(i).split(";")[5];
                    cancion3=datosCatalogoCanciones.get(i).split(";")[6];
                    cantidadAlbum=datosCatalogoCanciones.get(i).split(";")[7];
                
String albumModificado= nombreAlbumDato+";"+nombreArtista+";"+generoAlbum+";"+precioAlbum+";"+cancion1+";"+cancion2+";"+cancion3+";"+nuevaCantidadAlbum;
                   
                   datosCatalogoCanciones.set(i,albumModificado);
                   System.out.println("Se realizo con Exito la Modificacion en el Album "+nombreAlbum);
                   
                    PrintWriter escritor = null;
                    FileWriter fichero = null;
                    try {
                        
                        fichero = new FileWriter(archivo);
                        escritor = new PrintWriter(fichero);
                        escritor.flush();
                      
                        for (int j = 0; j <datosCatalogoCanciones.size() ; j++) {
                            
                            printWriter.write(datosCatalogoCanciones.get(j));
                            printWriter.println();
                            
                        }
                        
                        escritor.close();
                    } catch (Exception e) {
                        JOptionPane.showConfirmDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }
               
         }

        printWriter.close();
            
        } catch (Exception e) {
            String error = "No se encontro archivo" + e;
            JOptionPane.showConfirmDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
     
     }
    
}
