/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Anthonny
 */
public class ReproducirPelicula {

    public void reproducirvideo() throws IOException {

        String file = new String("RÁPIDOS Y FURIOSOS 8 - TRAILER SUBTITULADO.mp4");
        File path = new File(file);
        Desktop.getDesktop().open(path);
    }

}

//     if (listaPeliculas.isSelectionEmpty()) {
//            JOptionPane.showMessageDialog(null, "Seleccione una Pelicula para Reproducir!");
//        } else {
//
//            if (listaPeliculas.getSelectedValue().equals("IT")) {
//                String file = new String("It Trailer #1 (2017) - Movieclips Trailers.mp4");
//                File path = new File(file);
//                Desktop.getDesktop().open(path);
//            }
//}
