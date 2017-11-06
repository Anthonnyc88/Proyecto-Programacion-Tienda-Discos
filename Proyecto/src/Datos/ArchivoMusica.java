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

/**
 *
 * @author Admie21
 */
public class ArchivoMusica {

    /**
     * Metodo que funciona para ademas de escribir en un ArchivoMusica , sino
     * existe lo crea se da el Nombre del ArchivoMusica como parametro para
     * crear el objeto ArchivoMusica y posteriormente escribir en el archivo. 1
     *
     * @param nombreArchivo
     * @param informacion
     */
    @SuppressWarnings("empty-statement")
    public void guardarMusicaCatalogo(String nombreArchivo, String informacion) {
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
                bw.write(informacion);
            } else {

                fw = new FileWriter(f, true);//objeto que permite escribir en el archivo
                bw = new BufferedWriter(fw);// espacio de memoria para el archivo

                bw.write(informacion);

            }

            bw.close();
            fw.close();

        } catch (IOException e) {
        }

    }
    
     /**
     * Metodo que calcula la cantidad de Albunes en el Archivo de catalogo Canciones
     * y pone el limite de registros de albunes
     * @return true si se pasa la cantidad de registros de catalogo canciones 
     * es un boolean si se cumple la maxima maxima
     */
    public boolean limiteCatalogoCanciones(){
    
        boolean bandera=false;
        int numeroLineas=0;
        
         try{
    
        FileReader r = new FileReader("catalogoCanciones.txt");// se utiliza para poder leer archivos de texto
        BufferedReader buffer = new BufferedReader(r);//se utiliza para guardar todas las lineas que se obtienen del archivo
           
     
        String temp = "";
        /**
         * Ciclo que sirve para leer todo el archivo de manera  eficiente
         * la variable temporal temp que almacena el metodo de leer linea sea vacia o nula
         * que para y imprima todas lineas en las que existia algun contenido
         */
        
        while((temp=buffer.readLine())!=null)
        {
            numeroLineas++;
            
            if(numeroLineas==6){
            
                bandera=true;
            }
        }
        }
        catch(IOException e)// Se nececita del try y el catch para evitar un error 
            // en cuanto a archivos se trata, por ejemplo que el archivo no exista.
        {
        
            System.out.println(e.getMessage());
        }
         return bandera;

    }

}
