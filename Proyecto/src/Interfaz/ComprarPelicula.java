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

/**
 *
 * @author Admie21
 */
public class ComprarPelicula extends javax.swing.JFrame {

    private DefaultListModel modelo;
    private int seleccion = -1;

    /**
     * Creates new form ComprarPelicula
     */
    public ComprarPelicula() {
        initComponents();
        setLocationRelativeTo(null);
        listaPeliculas.setVisible(false);
        btnComprarPelicula.setVisible(false);
        btnConsultarDetalle.setVisible(false);

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
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
                .addContainerGap(116, Short.MAX_VALUE))
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

        ArchivoBuscarPelicula archivoPeliculas = new ArchivoBuscarPelicula();
        
         ArchivoOrdenes archivoPeliculasOrdenes = new ArchivoOrdenes();
         
          ArchivoPreOrdenes archivoPeliculasPreOrdenes = new ArchivoPreOrdenes();

        int cantidaDeseada = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la Cantidad deseada : "));

        int cantidadOriginal = Integer.parseInt(archivoPeliculas.verificarCantidadDisponiblePelicula(detalleInformacionPelicula[0], detalleInformacionPelicula[1]));

        if (cantidaDeseada > cantidadOriginal) {

            int opcionPreOrden = Integer.parseInt(JOptionPane.showInputDialog("Cantidad no Disponible \nDesea realizar una Pre Orden \n1: SI \n2: NO  "));

            if (opcionPreOrden == 1) {

                //esto es lo que se va a ir al archivo de preordenes
                String informacionPreOrden = detalleInformacionPelicula[0] + ";Pelicula;" + cantidaDeseada;

                JOptionPane.showMessageDialog(null, "Pre Orden Realizada");
                
                archivoPeliculasPreOrdenes.registrarPreOrden("peliculasPreOrdenes.txt", informacionPreOrden);
                //aqui se guardan las pre ordenes

                System.out.println(informacionPreOrden);
            } else {
                System.out.println("Pre Orden negada");
            }

        } else if (cantidaDeseada <= cantidadOriginal) {

            String nombreCliente = JOptionPane.showInputDialog("Introduzca su Nombre : ");
            String cedulaCliente = JOptionPane.showInputDialog("Introduzca su Numero de Cedula: ");
            String correoCliente = JOptionPane.showInputDialog("Introduzca su Correo Electronico: ");
            String nombrePelicula = detalleInformacionPelicula[0];
            String cantidadOrdenada = String.valueOf(cantidaDeseada);

            //esto es lo que vamos a escribir en el archivo de compras es el detalle total de la Orden
            String detalleTotalOrdenPelicula = nombreCliente + ";" + cedulaCliente + ";" + correoCliente + ";" + nombrePelicula + ";" + cantidadOrdenada;
            
            archivoPeliculasOrdenes.registrarOrden("peliculasOrdenes.txt",detalleTotalOrdenPelicula);
            System.out.println(detalleTotalOrdenPelicula);
            
            
            JOptionPane.showMessageDialog(null, "Compra Realizada");

        }

    }//GEN-LAST:event_btnComprarPeliculaActionPerformed

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
    private javax.swing.JComboBox<String> categoriaPeliculas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaPeliculas;
    // End of variables declaration//GEN-END:variables
}
