/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.ArchivoBuscarMusica;
import Datos.ArchivoBuscarPelicula;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Anthonny
 */
public class ComprarMusica extends javax.swing.JFrame {
     private DefaultListModel modelo;
    private int seleccion = -1;

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
        listaMusica = new javax.swing.JList<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tienda de Musica");

        bntComprar.setText("Comprar");
        bntComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntComprarActionPerformed(evt);
            }
        });

        categoriaMusica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bachata", "Electronica", "Pop", "Reggae", "Reggaeton" }));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(categoriaMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(bntDetalles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addComponent(bntComprar)
                        .addGap(107, 107, 107))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(categoriaMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 392, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntDetalles)
                            .addComponent(bntComprar))
                        .addGap(144, 144, 144))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntComprarActionPerformed
        // TODO add your handling code here:
        
         String[] detalleInformacionMusica = listaMusica.getSelectedValue().split(" / ");

        ArchivoBuscarMusica archivoMusica = new ArchivoBuscarMusica();

        int cantidaDeseada = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la Cantidad deseada : "));

        int cantidadOriginal = Integer.parseInt(archivoMusica.verificarCantidadDisponibleMusica(detalleInformacionMusica[0], detalleInformacionMusica[1]));

        if (cantidaDeseada > cantidadOriginal) {

            int opcionPreOrden = Integer.parseInt(JOptionPane.showInputDialog("Cantidad no Disponible \nDesea realizar una Pre Orden \n1: SI \n2: NO  "));

            if (opcionPreOrden == 1) {

                //esto es lo que se va a ir al archivo de preordenes
                String informacionPreOrden = detalleInformacionMusica[0] + ";Musica;" + cantidaDeseada;

                JOptionPane.showMessageDialog(null, "Pre Orden Realizada");

                System.out.println(informacionPreOrden);
            } else {
                System.out.println("Pre Orden negada");
            }

        } else if (cantidaDeseada <= cantidadOriginal) {

            String nombreCliente = JOptionPane.showInputDialog("Introduzca su Nombre : ");
            String cedulaCliente = JOptionPane.showInputDialog("Introduzca su Numero de Cedula: ");
            String correoCliente = JOptionPane.showInputDialog("Introduzca su Correo Electronico: ");
            String nombrePelicula = detalleInformacionMusica[0];
            String cantidadOrdenada = String.valueOf(cantidaDeseada);

            //esto es lo que vamos a escribir en el archivo de compras es el detalle total de la Orden
            String detalleTotalOrdenMusica = nombreCliente + ";" + cedulaCliente + ";" + correoCliente + ";" + nombrePelicula + ";" + cantidadOrdenada;

            System.out.println(detalleTotalOrdenMusica);
            JOptionPane.showMessageDialog(null, "Compra Realizada");

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
    private javax.swing.JComboBox categoriaMusica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaMusica;
    // End of variables declaration//GEN-END:variables
}
