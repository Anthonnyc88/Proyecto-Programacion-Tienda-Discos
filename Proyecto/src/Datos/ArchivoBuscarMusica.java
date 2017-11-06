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

    
    /**
     * Metodo que verifica si un Album esta en catalogo
     * respectivo
     * @param nombreDisco String
     * @param autor String
     * @param precio String
     * @return true si esta , false sino
     */
    public boolean buscarCancion(String nombreDisco, String autor, String precio) {

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

                if ((datos[0].equals(nombreDisco)) && (datos[1].equals(autor) && (datos[3].equals(precio)))) {

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

    
    /**
     * Metodo que retorna la informacacion de un Album
     * en la ventana de Comprar Album
     * @param categoriaMusica la categoria
     * @return un string de la informacion basica
     * del album
     */
    public String verCategoriaMusica(String categoriaMusica) {

        String datosCategoria = "";

        try {

            FileReader r = new FileReader("catalogoCanciones.txt");// se utiliza para poder leer archivos de texto
            BufferedReader buffer = new BufferedReader(r);//se utiliza para guardar todas las lineas que se obtienen del archivo

            String linea = "";

            while (linea != null) {

                linea = buffer.readLine();

                if (linea == null) {
                    break;
                }

                if (linea.contains(categoriaMusica)) {

                    String datos[] = linea.split(";");

                    System.out.println("¡Categoria existente.!");

                    datosCategoria = datos[0] + " / " + datos[1] + " / " + datos[3];
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
     * Retorna la informacion completa
     * de un album
     * @param nombreMusica nombre del album es String
     * @param artista el nombre String
     * @return la informacion completa del album
     */
    public String verDetalleInformacionMusica(String nombreMusica, String artista) {

        String datosMusica = "";

        try {

            FileReader r = new FileReader("catalogoCanciones.txt");// se utiliza para poder leer archivos de texto
            BufferedReader buffer = new BufferedReader(r);//se utiliza para guardar todas las lineas que se obtienen del archivo

            String linea = "";

            while (linea != null) {

                linea = buffer.readLine();

                if (linea == null) {
                    break;
                }

                if (linea.contains(nombreMusica) && linea.contains(artista)) {

                    String datos[] = linea.split(";");

                    System.out.println("Viendo Informacion De " + nombreMusica);

                    datosMusica = "Album : " + datos[0] + "\nArtista : " + datos[1] + "\nGenero : " + datos[2] + "\nPrecio : " + datos[3]+
                            "\nCancion 1 : "+datos[4]+"\nCancion 2 : "+datos[5]+"\nCancion 3 : "+datos[6];
                }

            }
        } catch (IOException e)// Se nececita del try y el catch para evitar un error 
        // en cuanto a archivos se trata, por ejemplo que el archivo no exista.
        {

            System.out.println(e.getMessage());
        }

        return datosMusica;

    }

    /**
     * Verifica que la cantidad de un album sea
     * la suficiente para abastecer una Orden
     * @param nombreMusica el nombre de album String
     * @param trailerMusica 
     * @return retorna la cantidad del Album
     */
    public String verificarCantidadDisponibleMusica(String nombreMusica, String trailerMusica) {

        String cantidaDisponible = "";

        try {

            FileReader r = new FileReader("catalogoCanciones.txt");// se utiliza para poder leer archivos de texto
            BufferedReader buffer = new BufferedReader(r);//se utiliza para guardar todas las lineas que se obtienen del archivo

            String linea = "";

            while (linea != null) {

                linea = buffer.readLine();

                if (linea == null) {
                    break;
                }

                if (linea.contains(nombreMusica) && linea.contains(trailerMusica)) {

                    String datos[] = linea.split(";");

                    System.out.println("Viendo Cantidad Disponible De " + nombreMusica);

                    cantidaDisponible = datos[7];
                }

            }
        } catch (IOException e)// Se nececita del try y el catch para evitar un error 
        // en cuanto a archivos se trata, por ejemplo que el archivo no exista.
        {

            System.out.println(e.getMessage());
        }

        return cantidaDisponible;

    }

    /**
     * Retorna la Informacion basica de un album
     * @param nombreMusica nombre del album es String
     * @return la informacion basica
     */
    public String verInformacionMusica(String nombreMusica) {

        String datosCategoria = "";

        try {

            FileReader r = new FileReader("catalogoCanciones.txt");// se utiliza para poder leer archivos de texto
            BufferedReader buffer = new BufferedReader(r);//se utiliza para guardar todas las lineas que se obtienen del archivo

            String linea = "";

            while (linea != null) {

                linea = buffer.readLine();

                if (linea == null) {
                    break;
                }

                if (linea.contains(nombreMusica)) {

                    String datos[] = linea.split(";");

                    System.out.println("¡Canción existente.!");

                    datosCategoria = datos[0] + " / " + datos[1] + " / " + datos[2];
                }

            }
        } catch (IOException e)// Se nececita del try y el catch para evitar un error 
        // en cuanto a archivos se trata, por ejemplo que el archivo no exista.
        {

            System.out.println(e.getMessage());
        }

        return datosCategoria;

    }

}
