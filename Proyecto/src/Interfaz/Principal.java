/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Anthonny
 */
public class Principal extends javax.swing.JFrame {

    private Timer tiempo;
    int cont;
    public final static int TWO_SECOND = 25;

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        barrita.setVisible(false);
        setResizable(false);
        setTitle("Tienda de discos");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Disco1.jpg")).getImage());

        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/Disco1.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        textContrasena = new javax.swing.JPasswordField();
        barrita = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        optInicioUsuario = new javax.swing.JMenuItem();
        optInicioSesion = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrator");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");

        textContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textContrasenaActionPerformed(evt);
            }
        });
        textContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textContrasenaKeyPressed(evt);
            }
        });

        barrita.setForeground(new java.awt.Color(255, 102, 0));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("Opciones");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        optInicioUsuario.setText("Registrarse");
        optInicioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optInicioUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(optInicioUsuario);

        optInicioSesion.setText("Inicio Sesion Usuario");
        optInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optInicioSesionActionPerformed(evt);
            }
        });
        jMenu1.add(optInicioSesion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barrita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 296, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(textContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(31, 31, 31)
                .addComponent(barrita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optInicioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optInicioUsuarioActionPerformed
        // TODO add your handling code here:
        Registro ventanaSecundariaRegistro = new Registro();
        ventanaSecundariaRegistro.pack();
        ventanaSecundariaRegistro.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_optInicioUsuarioActionPerformed

    private void textContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textContrasenaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Login();
        }

    }//GEN-LAST:event_textContrasenaKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void optInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optInicioSesionActionPerformed
        // TODO add your handling code here:

        InicioSesionUsuario ventanaInicioUsuarioUsuario = new InicioSesionUsuario();
        ventanaInicioUsuarioUsuario.pack();
        ventanaInicioUsuarioUsuario.setVisible(true);
        setLocationRelativeTo(null);
        this.setVisible(false);
        
       


    }//GEN-LAST:event_optInicioSesionActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void textContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textContrasenaActionPerformed

    class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            cont++;
            barrita.setValue(cont);
            if (cont == 100) {
                tiempo.stop();
                esconder();
                Mantenimiento ventanaSecundariaMantenimiento = new Mantenimiento();
                ventanaSecundariaMantenimiento.setVisible(true);
                setVisible(false);
                System.out.println("");

            }

        }

    }

    public void esconder() {
        this.setVisible(false);
    }

    public void activar() {
        tiempo.start();
    }

    //Funcion donde el usuario se logea e inicie seccion
    //El usuario y la contrasena estan guardadas en un archivo.txt
    public void Login() {
        try {
            String archivo = "Administrador.txt";
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String usuario = "";
            String contraseña = "";
            usuario = textUser.getText();
            contraseña = textContrasena.getText();
            FileReader fr = new FileReader("Administrador.txt");
            BufferedReader lector = new BufferedReader(fr);
            String linea;
            boolean bandera = false;
            ArrayList<String> listaAdministradores = new ArrayList();
            while ((linea = lector.readLine()) != null) {
                listaAdministradores.add(linea);
            }
            for (int i = 0; i < listaAdministradores.size(); i++) {
                if (usuario.equals(listaAdministradores.get(i).split(" ")[0]) && contraseña.equals(listaAdministradores.get(i).split(" ")[1])) {
                    bandera = true;
                    System.out.println("Bienvenido Administrador " +textUser.getText());
                }
            }
            if (bandera) {
                barrita.setVisible(true);
                cont = -1;
                barrita.setValue(0);
                barrita.setStringPainted(true);
                tiempo = new Timer(TWO_SECOND, new TimerListener());
                activar();

                //JOptionPane.showMessageDialog(null, "Bienvenido");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña Invalidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            pw.close();

        } catch (Exception e) {

            System.err.println("No se encontro archivo" + e);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barrita;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem optInicioSesion;
    private javax.swing.JMenuItem optInicioUsuario;
    private javax.swing.JPasswordField textContrasena;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
