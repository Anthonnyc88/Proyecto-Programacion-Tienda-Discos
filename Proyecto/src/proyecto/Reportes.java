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

    public String BuscarMusicaBachata() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("catalogoCanciones.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Melodia")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadBachata() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("cancionesOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[3].equals(BuscarMusicaBachata())) {
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
public String BuscarMusicaElectronica() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("catalogoCanciones.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Titanium")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadElectronica() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("cancionesOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[3].equals(BuscarMusicaElectronica())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
public String BuscarMusicaReggae() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("catalogoCanciones.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Legend")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadReggae() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("cancionesOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[3].equals(BuscarMusicaReggae())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 public String BuscarMusicaReaggaeton() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("catalogoCanciones.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Despacito")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadReaggaeton() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("cancionesOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[3].equals(BuscarMusicaReaggaeton())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String BuscarMusicaPop() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("catalogoCanciones.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Purpose")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadPop() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("cancionesOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[3].equals(BuscarMusicaPop())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }
    
//////////////////////REPORTE DOS DISCOS DE MUSICA MAS COMPRADOS POR USUARIO////////////////////////////////////////////////////////
    
 public String Usuario1() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("UsuariosRegistrados.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Maria")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadUsuario1() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("peliculasOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals(Usuario1())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
                temp = linea;
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
                temp = linea;
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
                temp = linea;
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
                temp = linea;
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
                temp = linea;
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String UsuarioMusica() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("UsuariosRegistrados.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Kevin")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadUsuarioMusica() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("CancionesOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals(UsuarioMusica())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }
    
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     public String UsuarioMusica2() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("UsuariosRegistrados.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Raquel")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadUsuarioMusica2() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("CancionesOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals(UsuarioMusica2())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     public String UsuarioMusica3() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("UsuariosRegistrados.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Anthonny")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadUsuarioMusica3() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("CancionesOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals(UsuarioMusica3())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     public String UsuarioMusica4() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("UsuariosRegistrados.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Ruben")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadUsuarioMusica4() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("CancionesOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals(UsuarioMusica4())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     public String UsuarioMusica5() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("UsuariosRegistrados.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Kendall")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadUsuarioMusica5() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("CancionesOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals(UsuarioMusica5())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }
 
 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String Usuario2() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("UsuariosRegistrados.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Anthonny")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadUsuario2() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("peliculasOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals(Usuario2())) {
                    cantidad += Integer.parseInt(lista1[4]);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return cantidad;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String Usuario3() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("UsuariosRegistrados.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Antonio")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadUsuario3() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("peliculasOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals(Usuario3())) {
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
    public String Usuario4() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("UsuariosRegistrados.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Noel")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadUsuario4() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("peliculasOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals(Usuario4())) {
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
    public String Usuario5() {
        String nombredisco = "";
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("UsuariosRegistrados.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals("Roger")) {
                    nombredisco = lista1[0];
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo" + e);
        }

        return nombredisco;
    }

    public int CantidadUsuario5() {
        int cantidad = 0;
        try {
            String temp;
            BufferedReader lector = new BufferedReader(new FileReader("peliculasOrdenes.txt"));
            int contador = 0;

            temp = "";
            String linea;

            while ((linea = lector.readLine()) != null) {
                contador++;
                temp = linea;
                String lista = temp;
                String[] lista1 = lista.split(";");
                if (lista1[0].equals(Usuario5())) {
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
