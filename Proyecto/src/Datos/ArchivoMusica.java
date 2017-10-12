/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.BufferedWriter;
import java.io.File;
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

}
