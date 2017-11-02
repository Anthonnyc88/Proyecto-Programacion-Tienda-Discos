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
        
   //return "Si funciono Roger pero no quero mandar la lista";
    }
    
}
