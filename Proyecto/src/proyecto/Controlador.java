/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Anthonny
 */
public class Controlador {

    
    /**
     * Esto le toca comentarlo a ti Campeon ;-)
     * @param a
     * @return 
     */
    public boolean enviarCorreo(Correo a) {
        try {
            Properties p = new Properties();
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.setProperty("mail.smtp.starttls.enable", "true");
            p.setProperty("mail.smtp.port", "587");
            p.setProperty("mail.smtp.user", a.getUsuario());
            p.setProperty("mail.smtp.auth", "true");

            Session s = Session.getDefaultInstance(p, null);
            BodyPart texto = new MimeBodyPart();
            texto.setText(a.getMensaje());
            BodyPart adjunto = new MimeBodyPart();

            if (!a.getRutaArchivo().equals("")) {
                adjunto.setDataHandler(new DataHandler(new FileDataSource(a.getRutaArchivo())));
                adjunto.setFileName(a.getNombreArchivo());
            }

            MimeMultipart m = new MimeMultipart();
            m.addBodyPart(texto);

            if (!a.getRutaArchivo().equals("")) {
                m.addBodyPart(adjunto);
            }
            MimeMessage mensaje = new MimeMessage(s);
            mensaje.setFrom(new InternetAddress(a.getUsuario()));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(a.getDestino()));
            mensaje.setSubject(a.getAsunto());
            mensaje.setContent(m);

            Transport t = s.getTransport("smtp");
            t.connect(a.getUsuario(), a.getContraseña());
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
            return true;

        } catch (Exception e) {
            System.out.println("Error" + e);
            return false;

        }

    }

}
