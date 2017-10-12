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
public class ArchivoUsuario {
    
     /**
     * Metodo que funciona para ademas de escribir en un Usuarios , sino
 existe lo crea se da el Nombre del ArchivoUsuario USUARIOS como parametro para
 crear el objeto Usuario y posteriormente guardarlo en el archivo. 
     *
     * @param nombreArchivo
     * @param usuario
     */
    
    @SuppressWarnings("empty-statement")
    public void registrarUsuario(String nombreArchivo, String usuario) {
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
                bw.write(usuario);
            } else {

                fw = new FileWriter(f, true);//objeto que permite escribir en el archivo
                bw = new BufferedWriter(fw);// espacio de memoria para el archivo

                bw.write(usuario);

            }

            bw.close();
            fw.close();

        } catch (IOException e) {
        }

    }
    
}
