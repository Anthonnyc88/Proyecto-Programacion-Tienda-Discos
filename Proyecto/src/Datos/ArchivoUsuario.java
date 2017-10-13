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
    
     /**
     * Metodo que compueba si un Usuario esta registrado
     *
     * @param nombre
     * @param contraseña
     * @return un boleano ture si la persona esta registrada y false cuando la
     * persoma no lo esta.
     */
    @SuppressWarnings("empty-statement")
    public boolean inicioSesionUsuario(String nombre, String contraseña) {

        boolean bandera = false;

        try {

            FileReader r = new FileReader("UsuariosRegistrados.txt");// se utiliza para poder leer archivos de texto
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

                if ((linea.contains(nombre)) && (linea.contains(contraseña))) {

                    System.out.println("¡Bienvenido Usuario " + nombre + ". !");

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
    
   
   public boolean inicioSesionAdministradores(String nombre, String contraseña){
   
   boolean bandera = false;

        try {

            FileReader r = new FileReader("Administrador.txt");// se utiliza para poder leer archivos de texto
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

                if ((linea.contains(nombre)) && (linea.contains(contraseña))) {

                    System.out.println("¡Bienvenido Administrador " + nombre + ". !");

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
