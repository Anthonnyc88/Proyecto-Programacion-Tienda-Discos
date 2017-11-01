/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Anthonny
 */
public class Reportes {
    
    
    public String BuscarPeliculaTerror() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("catalogoPeliculas.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Anabelle")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }
    
    
    
     public int CantidadTerror() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("peliculasOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp =linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[3].equals(BuscarPeliculaTerror())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

      public String BuscarPeliculaSuspenso() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("catalogoPeliculas.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Ana Frank")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }
    
    public int CantidadSuspenso() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("peliculasOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp =linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[3].equals(BuscarPeliculaSuspenso())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 public String BuscarPeliculaComedia() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("catalogoPeliculas.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Donde estan los Fantasmas")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }
    
    public int CantidadComedia() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("peliculasOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp =linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[3].equals(BuscarPeliculaComedia())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     public String BuscarPeliculaRomance() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("catalogoPeliculas.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Bajo La Misma Estrella")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }
    
    public int CantidadRomance() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("peliculasOrdenes.txt"));
            int contador = 0;
            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp =linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[3].equals(BuscarPeliculaRomance())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     public String BuscarPeliculaAccion() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("catalogoPeliculas.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Bad Boys 2")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }
    
    public int CantidadAccion() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("peliculasOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp =linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[3].equals(BuscarPeliculaAccion())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }
    
    
    
}
