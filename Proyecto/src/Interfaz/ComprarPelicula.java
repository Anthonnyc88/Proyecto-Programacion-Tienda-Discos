/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.ArchivoBuscarPelicula;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import Datos.ArchivoOrdenes;
import Datos.ArchivoPreOrdenes;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import proyecto.Controlador;
import proyecto.Correo;
import proyecto.ReproducirPelicula;

/**
 *
 * @author Admie21
 */
public class ComprarPelicula extends javax.swing.JFrame {

    ReproducirPelicula pelicula = new ReproducirPelicula();

    private DefaultListModel modelo;
    private int seleccion = -1;
    private String correo = "";
    private String nombreDisco = "";
    Correo a = new Correo();
    ReproducirPelicula table = new ReproducirPelicula();

    /**
     * Creates new form ComprarPelicula
     */
    public ComprarPelicula() {
        initComponents();
        setLocationRelativeTo(null);
        listaPeliculas.setVisible(false);
        btnComprarPelicula.setVisible(false);
        btnConsultarDetalle.setVisible(false);

        setResizable(false);
        setTitle("Tienda de discos");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Disco1.jpg")).getImage());

        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/Disco1.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

        modelo = new DefaultListModel();
        listaPeliculas.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categoriaPeliculas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPeliculas = new javax.swing.JList<>();
        btnConsultarDetalle = new javax.swing.JButton();
        btnComprarPelicula = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        categoriaPeliculas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terror", "Suspenso", "Comedia", "Romance", "Accion" }));
        categoriaPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaPeliculasActionPerformed(evt);
            }
        });

        jLabel1.setText("Categoria");

        jScrollPane1.setViewportView(listaPeliculas);

        btnConsultarDetalle.setText("Detalles");
        btnConsultarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarDetalleActionPerformed(evt);
            }
        });

        btnComprarPelicula.setText("Comprar");
        btnComprarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarPeliculaActionPerformed(evt);
            }
        });

        jButton1.setText("Reproducir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(categoriaPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnConsultarDetalle)
                        .addGap(90, 90, 90)
                        .addComponent(btnComprarPelicula))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton1)))
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarDetalle)
                    .addComponent(btnComprarPelicula))
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoriaPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaPeliculasActionPerformed
        // TODO add your handling code here:

        ArchivoBuscarPelicula archivoPeliculas = new ArchivoBuscarPelicula();

        listaPeliculas.setVisible(true);
        btnComprarPelicula.setVisible(true);
        btnConsultarDetalle.setVisible(true);
        String categoriaP = categoriaPeliculas.getSelectedItem().toString();
        modelo.addElement(archivoPeliculas.verCategoriaPelicula(categoriaP));
    }//GEN-LAST:event_categoriaPeliculasActionPerformed

    private void btnConsultarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarDetalleActionPerformed
        // TODO add your handling code here:

        String[] detalleInformacionPelicula = listaPeliculas.getSelectedValue().split(" / ");

        ArchivoBuscarPelicula archivoPeliculas = new ArchivoBuscarPelicula();

        String detalleTotal = archivoPeliculas.verDetalleInformacionPelicula(detalleInformacionPelicula[0], detalleInformacionPelicula[1]);

        JOptionPane.showMessageDialog(null, detalleTotal);
    }//GEN-LAST:event_btnConsultarDetalleActionPerformed

    private void btnComprarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarPeliculaActionPerformed
        // TODO add your handling code here:

        String[] detalleInformacionPelicula = listaPeliculas.getSelectedValue().split(" / ");

        String nombrePelicula = detalleInformacionPelicula[0];

        ArchivoBuscarPelicula archivoPeliculas = new ArchivoBuscarPelicula();

        ArchivoOrdenes archivoPeliculasOrdenes = new ArchivoOrdenes();

        ArchivoPreOrdenes archivoPeliculasPreOrdenes = new ArchivoPreOrdenes();

        int cantidaDeseada = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la Cantidad deseada : "));

        int cantidadOriginal = Integer.parseInt(archivoPeliculas.verificarCantidadDisponiblePelicula(detalleInformacionPelicula[0], detalleInformacionPelicula[1]));

        if (cantidaDeseada > cantidadOriginal) {

            int opcionPreOrden = Integer.parseInt(JOptionPane.showInputDialog("Cantidad no Disponible \nDesea realizar una Pre Orden \n1: SI \n2: NO  "));

            switch (opcionPreOrden) {
                case 1:

                    String nombreClientes = JOptionPane.showInputDialog("Introduzca su Nombre : ");
                    String cedulaClientes = JOptionPane.showInputDialog("Introduzca su Numero de Cedula: ");
                    correo = JOptionPane.showInputDialog("Introduzca su Correo Electronico: ");
                    //esto es lo que se va a ir al archivo de preordenes
                    String informacionPreOrden = detalleInformacionPelicula[0] + ";Pelicula;" + cantidaDeseada + ";" + nombreClientes +";" + cedulaClientes + ";" + correo +";";
                    JOptionPane.showMessageDialog(null, "Pre Orden Realizada");

                    archivoPeliculasPreOrdenes.registrarPreOrden("peliculasPreOrdenes.txt", informacionPreOrden);
                    //aqui se guardan las pre ordenes
                    System.out.println(informacionPreOrden);
                    break;
                case 2:
                    System.out.println("Pre Orden negada");
                    break;
                default:
                    System.out.println("Opcion No Disponible");
                    break;
            }

        } else if (cantidaDeseada <= cantidadOriginal) {

            int cantidadTotalNueva = (cantidadOriginal - cantidaDeseada);
            String nuevaCantidad = String.valueOf(cantidadTotalNueva);

            archivoPeliculasOrdenes.modificarCantidadPelicula(nombrePelicula, nuevaCantidad);

            String nombreCliente = JOptionPane.showInputDialog("Introduzca su Nombre : ");
            String cedulaCliente = JOptionPane.showInputDialog("Introduzca su Numero de Cedula: ");
            correo = JOptionPane.showInputDialog("Introduzca su Correo Electronico: ");

            String cantidadOrdenada = String.valueOf(cantidaDeseada);

            while (!(nombreCliente.length() == 0 || cedulaCliente.length() == 0 || correo.length() == 0)) {

                //esto es lo que vamos a escribir en el archivo de compras es el detalle total de la Orden
                String detalleTotalOrdenPelicula = nombreCliente + ";" + cedulaCliente + ";" + correo + ";" + nombrePelicula + ";" + cantidadOrdenada;

                archivoPeliculasOrdenes.registrarOrden("peliculasOrdenes.txt", detalleTotalOrdenPelicula);
                System.out.println(detalleTotalOrdenPelicula);

                JOptionPane.showMessageDialog(null, "Compra Realizada");

//            Agrego como paramtro la cantidad del articulo para poder enviarlo
//            en el mensaje del correo en Comprar Pelicula
                enviarCorreoElectronico(cantidadOrdenada);

            }

            JOptionPane.showMessageDialog(null, "Error de la Entrada de Informacion \nNo se realizo la Compra\nVuelvalo a Intentar.");

        }
    }

    public void enviarCorreoElectronico(String cantidadArticulo) {

        a.setContraseña("cnaipcaudzpcbdqh");
        a.setUsuario("anthonnyc10@gmail.com");
        a.setAsunto("Compra exitosa");
        a.setMensaje("El nombre de la pelicula que compro es : " + nombreDisco + "\nCantidad : " + cantidadArticulo);
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


    }//GEN-LAST:event_btnComprarPeliculaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            pelicula.reproducirvideo();
        } catch (IOException ex) {
            Logger.getLogger(ComprarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ComprarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprarPelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarPelicula;
    private javax.swing.JButton btnConsultarDetalle;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> categoriaPeliculas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaPeliculas;
    // End of variables declaration//GEN-END:variables
}
