/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.applet.AudioClip;
import java.awt.Frame;

/**
 *
 * @author Anthonny
 */
public class ReproducirMusica extends Frame{
       AudioClip sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/El ojo de tigre(Canción) (online-audio-converter.com).wav"));
    public void reproducir(){
          sonido.play();
    }
    
}
