/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.ArchivoBuscarMusica;
import Datos.ArchivoBuscarPelicula;
import Datos.ArchivoOrdenes;
import Datos.ArchivoPreOrdenes;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import proyecto.Controlador;
import proyecto.Correo;

/**
 *
 * @author Anthonny
 */
public class BuscarMusica extends javax.swing.JFrame {

    private DefaultListModel modelo;
    private int seleccion = -1;
    private String correo = "";
    private String nombreDisco = "";
    Correo a = new Correo();

    /**
     * Creates new form comprarMusica
     */
    public BuscarMusica() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Sin música la vida sería un error.");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Musica1.jpg")).getImage());
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/Musica1.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

        bntComprar.setVisible(false);

        modelo = new DefaultListModel();
        resultadosCanciones.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textNombre = new javax.swing.JTextField();
        bntBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textAutor = new javax.swing.JTextField();
        textPrecio = new javax.swing.JTextField();
        textDisco = new javax.swing.JTextField();
        bntBuscarCancion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textAutors = new javax.swing.JTextField();
        textPrecios = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadosCanciones = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        bntComprar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        bntBuscar.setText("Buscar");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar Pelicula ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Autor");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del disco");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bntBuscarCancion.setText("Buscar");
        bntBuscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarCancionActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar Canciòn ");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Autor");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre del disco");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tienda de Musica");

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(resultadosCanciones);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Informacion de Cancion");

        bntComprar.setText("Comprar");
        bntComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntComprarActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textAutors, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(bntBuscarCancion)))
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(53, 53, 53)))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(55, 55, 55)
                        .addComponent(bntComprar)
                        .addGap(97, 97, 97))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntComprar)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(textAutors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(bntBuscarCancion)))
                .addGap(316, 316, 316)
                .addComponent(jButton2)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PrincipalUsuarios ventanaUsuarios = new PrincipalUsuarios();
        ventanaUsuarios.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bntBuscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarCancionActionPerformed
        // TODO add your handling code here:
        ArchivoBuscarMusica buscar = new ArchivoBuscarMusica();
        if (buscar.buscarCancion(textDisco.getText(), textAutors.getText(), textPrecios.getText())) {
            // JOptionPane.showMessageDialog(null, "Encontrado");

            ArchivoBuscarMusica archivoMusica = new ArchivoBuscarMusica();

            modelo.addElement(archivoMusica.verInformacionMusica(textDisco.getText()));
            bntComprar.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Cancion no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_bntBuscarCancionActionPerformed

    private void bntComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntComprarActionPerformed
        // TODO add your handling code here:

        String detalleMusica = resultadosCanciones.getSelectedValue().toString();
        String[] detalleInformacionMusica = detalleMusica.split(" / ");

        ArchivoOrdenes archivoMusicaOrdenes = new ArchivoOrdenes();

        ArchivoPreOrdenes archivoMusicaPreOrdenes = new ArchivoPreOrdenes();

        ArchivoBuscarMusica archivoMusica = new ArchivoBuscarMusica();

        int cantidaDeseada = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la Cantidad deseada : "));

        int cantidadOriginal = Integer.parseInt(archivoMusica.verificarCantidadDisponibleMusica(detalleInformacionMusica[0], detalleInformacionMusica[1]));

        if (cantidaDeseada > cantidadOriginal) {

            int opcionPreOrden = Integer.parseInt(JOptionPane.showInputDialog("Cantidad no Disponible \nDesea realizar una Pre Orden \n1: SI \n2: NO  "));

            if (opcionPreOrden == 1) {

                //esto es lo que se va a ir al archivo de preordenes
                String informacionPreOrden = detalleInformacionMusica[0] + ";Cancion;" + cantidaDeseada;

                JOptionPane.showMessageDialog(null, "Pre Orden Realizada");

                archivoMusicaPreOrdenes.registrarPreOrden("cancionesPreOrdenes.txt", informacionPreOrden);
                //aqui se guardan las pre ordenes

                System.out.println(informacionPreOrden);

            } else {
                System.out.println("Pre Orden negada");
            }

        } else if (cantidaDeseada <= cantidadOriginal) {

            String nombreCliente = JOptionPane.showInputDialog("Introduzca su Nombre : ");
            String cedulaCliente = JOptionPane.showInputDialog("Introduzca su Numero de Cedula: ");
            nombreDisco = JOptionPane.showInputDialog("Nombre del disco que compro");
            correo = JOptionPane.showInputDialog("Introduzca su Correo Electronico: ");
            String nombreMusica = detalleInformacionMusica[0];
            String cantidadOrdenada = String.valueOf(cantidaDeseada);

            //esto es lo que vamos a escribir en el archivo de compras es el detalle total de la Orden
            String detalleTotalOrdenCancion = nombreCliente + ";" + cedulaCliente + ";" + correo + ";" + nombreMusica + ";" + cantidadOrdenada;

            System.out.println(detalleTotalOrdenCancion);

            archivoMusicaOrdenes.registrarOrden("cancionesOrdenes.txt", detalleTotalOrdenCancion);

            JOptionPane.showMessageDialog(null, "Compra Realizada");

            enviarCorreoElectronico(cantidadOrdenada);
            
            //lo hice aqui tambien tambien

        }

    }

    public void enviarCorreoElectronico(String cantidadArticulo) {

        a.setContraseña("cnaipcaudzpcbdqh");
        a.setUsuario("anthonnyc10@gmail.com");
        a.setAsunto("Compra exitosa");
        a.setMensaje("El nombre del disco que compro es: " + nombreDisco+ "\nCantidad : "+cantidadArticulo);
        a.setDestino(correo);
        a.setNombreArchivo("Azul.jpg");
        a.setRutaArchivo("Azul.jpg");
        a.setAsunto(" Su compra ha sido un Exito !!!");
        Controlador b = new Controlador();

        if (b.enviarCorreo(a)) {
            JOptionPane.showMessageDialog(null, "Envio correcto");
        } else {

            JOptionPane.showMessageDialog(null, "error");

        }

    }//GEN-LAST:event_bntComprarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarMusica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBuscar;
    private javax.swing.JButton bntBuscarCancion;
    private javax.swing.JButton bntComprar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList resultadosCanciones;
    private javax.swing.JTextField textAutor;
    private javax.swing.JTextField textAutors;
    private javax.swing.JTextField textDisco;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPrecio;
    private javax.swing.JTextField textPrecios;
    // End of variables declaration//GEN-END:variables
}
