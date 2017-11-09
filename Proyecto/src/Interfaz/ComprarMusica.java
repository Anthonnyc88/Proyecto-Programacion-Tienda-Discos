/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.ArchivoBuscarMusica;
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
import proyecto.ReproducirMusica;

/**
 *
 * @author Anthonny
 */
public class ComprarMusica extends javax.swing.JFrame {

    ReproducirMusica b = new ReproducirMusica();

    private DefaultListModel modelo;
    private int seleccion = -1;
    private String correo = "";
    private String nombreDisco = "";
    Correo a = new Correo();

    /**
     * Creates new form ComprarMusica
     */
    public ComprarMusica() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Tienda de discos");
        listaMusica.setVisible(false);
        bntComprar.setVisible(false);
        bntDetalles.setVisible(false);

        setTitle("Tienda de discos");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Disco.jpg")).getImage());

        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/Disco.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        modelo = new DefaultListModel();
        listaMusica.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bntComprar = new javax.swing.JButton();
        categoriaMusica = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        bntDetalles = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMusica = new javax.swing.JList<>();
        bntReproducir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tienda de Musica");

        bntComprar.setText("Comprar");
        bntComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntComprarActionPerformed(evt);
            }
        });

        categoriaMusica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bachata", "Electronica", "Pop", "Reggae", "Raggaeton" }));
        categoriaMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaMusicaActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Categoria");

        bntDetalles.setText("Detalles");
        bntDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDetallesActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaMusica);

        bntReproducir.setText("Reproducir");
        bntReproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntReproducirActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(bntDetalles)
                        .addGap(18, 18, 18)
                        .addComponent(bntReproducir)
                        .addGap(31, 31, 31)
                        .addComponent(bntComprar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(categoriaMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(307, 307, 307))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntDetalles)
                            .addComponent(bntReproducir)
                            .addComponent(bntComprar))
                        .addGap(158, 158, 158))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(categoriaMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addGap(67, 67, 67))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntComprarActionPerformed
        // TODO add your handling code here:
        String[] detalleInformacionMusica = listaMusica.getSelectedValue().split(" / ");

        String nombreAlbum = detalleInformacionMusica[0];

        ArchivoBuscarMusica archivoMusica = new ArchivoBuscarMusica();

        ArchivoOrdenes archivoPeliculasOrdenes = new ArchivoOrdenes();

        ArchivoPreOrdenes archivoMusicaPreOrdenes = new ArchivoPreOrdenes();

        int cantidaDeseada = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la Cantidad deseada : "));

        int cantidadOriginal = Integer.parseInt(archivoMusica.verificarCantidadDisponibleMusica(detalleInformacionMusica[0], detalleInformacionMusica[1]));

        if (cantidaDeseada > cantidadOriginal) {

            int opcionPreOrden = Integer.parseInt(JOptionPane.showInputDialog("Cantidad no Disponible \nDesea realizar una Pre Orden \n1: SI \n2: NO  "));

            if (opcionPreOrden == 1) {

                String nombreClientes = JOptionPane.showInputDialog("Introduzca su Nombre : ");
                String cedulaClientes = JOptionPane.showInputDialog("Introduzca su Numero de Cedula: ");
                correo = JOptionPane.showInputDialog("Introduzca su Correo Electronico: ");
                 //esto es lo que se va a ir al archivo de preordenes
                //esto es lo que se va a ir al archivo de preordenes
                String informacionPreOrden = detalleInformacionMusica[0] + ";Album;" + cantidaDeseada;
                enviarCorreoElectronicoPreorden();
                JOptionPane.showMessageDialog(null, "Pre Orden Realizada");
                archivoMusicaPreOrdenes.registrarPreOrden("cancionesPreOrdenes.txt", informacionPreOrden);
                //aqui se guardan las pre ordenes

                System.out.println(informacionPreOrden);
            } else if (opcionPreOrden == 2) {
                System.out.println("Pre Orden negada");
            } else {

                System.out.println("Opcion no Disponible");
            }

        } else if (cantidaDeseada <= cantidadOriginal) {

            int cantidadTotalNueva = (cantidadOriginal - cantidaDeseada);
            String nuevaCantidad = String.valueOf(cantidadTotalNueva);

            archivoPeliculasOrdenes.modificarCantidadCanciones(nombreAlbum, nuevaCantidad);

            String correoElectronico = "";
            String nombreCliente = JOptionPane.showInputDialog("Introduzca su Nombre : ");
            String cedulaCliente = JOptionPane.showInputDialog("Introduzca su Numero de Cedula: ");
            //nombreDisco = JOptionPane.showInputDialog("Nombre del disco que compro:");
            correo = JOptionPane.showInputDialog("Introduzca su Correo Electronico: ");

            String cantidadOrdenada = String.valueOf(cantidaDeseada);

            while (!(nombreCliente.length() == 0 || cedulaCliente.length() == 0 || correo.length() == 0)) {

                //esto es lo que vamos a escribir en el archivo de compras es el detalle total de la Orden
                String detalleTotalOrdenMusica = nombreCliente + ";" + cedulaCliente + ";" + correoElectronico + ";" + nombreAlbum + ";" + cantidadOrdenada;

                archivoPeliculasOrdenes.registrarOrden("cancionesOrdenes.txt", detalleTotalOrdenMusica);
                System.out.println(detalleTotalOrdenMusica);

                JOptionPane.showMessageDialog(null, "Compra Realizada");
                enviarCorreoElectronico(cantidadOrdenada);

            }
            JOptionPane.showMessageDialog(null, "Error de la Entrada de Informacion \nNo se realizo la Compra\nVuelvalo a Intentar.");
        }
    }

    public void enviarCorreoElectronico(String cantidadArticulo) {

        a.setContraseña("cnaipcaudzpcbdqh");
        a.setUsuario("anthonnyc10@gmail.com");
        a.setAsunto("Compra exitosa");
        a.setMensaje("El nombre del disco que compro es: " + nombreDisco + "\nCantidad : " + cantidadArticulo);
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
    }

    public void enviarCorreoElectronicoPreorden() {

        a.setContraseña("cnaipcaudzpcbdqh");
        a.setUsuario("anthonnyc10@gmail.com");
        a.setAsunto("Compra exitosa");
        //a.setMensaje("El nombre de la pelicula que compro es : " + nombreDisco );
        a.setDestino(correo);
        a.setNombreArchivo("Azul.jpg");
        a.setRutaArchivo("Azul.jpg");
        a.setAsunto(" Su Preorden ha sido ordenada con exito !!!");
        Controlador b = new Controlador();

        if (b.enviarCorreo(a)) {
            JOptionPane.showMessageDialog(null, "Envio correcto");
        } else {

            JOptionPane.showMessageDialog(null, "error");

        }

    }//GEN-LAST:event_bntComprarActionPerformed

    private void bntDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDetallesActionPerformed
        // TODO add your handling code here:

        String[] detalleInformacionMusica = listaMusica.getSelectedValue().split(" / ");

        ArchivoBuscarMusica archivoMusica = new ArchivoBuscarMusica();

        String detalleTotal = archivoMusica.verDetalleInformacionMusica(detalleInformacionMusica[0], detalleInformacionMusica[1]);

        JOptionPane.showMessageDialog(null, detalleTotal);

    }//GEN-LAST:event_bntDetallesActionPerformed

    private void categoriaMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaMusicaActionPerformed
        // TODO add your handling code here:
        ArchivoBuscarMusica archivoMusica = new ArchivoBuscarMusica();

        listaMusica.setVisible(true);
        bntComprar.setVisible(true);
        bntDetalles.setVisible(true);
        String categoriaP = categoriaMusica.getSelectedItem().toString();
        modelo.addElement(archivoMusica.verCategoriaMusica(categoriaP));
    }//GEN-LAST:event_categoriaMusicaActionPerformed

    private void bntReproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntReproducirActionPerformed
        // TODO add your handling code here:
        b.reproducir();
    }//GEN-LAST:event_bntReproducirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:

        PrincipalUsuarios ventana = new PrincipalUsuarios();
        ventana.pack();
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(ComprarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprarMusica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntComprar;
    private javax.swing.JButton bntDetalles;
    private javax.swing.JButton bntReproducir;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox categoriaMusica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaMusica;
    // End of variables declaration//GEN-END:variables
}
