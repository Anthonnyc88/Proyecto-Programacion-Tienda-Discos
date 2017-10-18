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
 * @author Anthonny
 */
public class ArchivoBuscarMusica {
     public boolean buscarCancion(String nombreDisco, String autor, String precio ) {

        boolean bandera = false;

        try {

            FileReader r = new FileReader("catalogoCanciones.txt");// se utiliza para poder leer archivos de texto
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
                
                if (( datos[0].equals(nombreDisco)) && ( datos[1].equals(autor) && (datos[3].equals(precio) ))) {

                    System.out.println("¡Cancion encontrada " + ". !");

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

}