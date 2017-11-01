/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import proyecto.Reportes;
//import static proyecto.Reportes.buscarDiscoReggae;

/**
 *
 * @author Anthonny
 */
public class PrincipalReportes extends javax.swing.JFrame {

    JFreeChart Grafica;
    DefaultCategoryDataset Datos = new DefaultCategoryDataset();
    proyecto.Reportes a = new proyecto.Reportes();
    private int numero = 10;
    private String nombrePersona = "";
    private String cantidaDisponible = "";

    //Metodo para sacar el nombre del disco
    Reportes b = new Reportes();

    public PrincipalReportes() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Disco1.jpg")).getImage());

        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/Disco1.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

        setTitle("Tienda de discos");
        Datos.addValue(a.CantidadTerror(), "Terror", "Terror");
        Datos.addValue(a.CantidadSuspenso(), "Suspenso", "Suspenso");
        Datos.addValue(a.CantidadComedia(), "Comedia",  "Comedia");
        Datos.addValue(a.CantidadRomance(), "Romance",  "Romances");
        Datos.addValue(a.CantidadAccion(), "Accion",   "Accion");

        Grafica = ChartFactory.createBarChart("Compras de Peliculas",
                "Categorias", "Compras", Datos,
                PlotOrientation.HORIZONTAL, true, true, false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntReporte2 = new javax.swing.JButton();
        bntReporte3 = new javax.swing.JButton();
        bntReporte4 = new javax.swing.JButton();
        bntReporte5 = new javax.swing.JButton();
        bntReporte6 = new javax.swing.JButton();
        bntReporte1 = new javax.swing.JButton();
        bntRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bntReporte2.setText("Reporte 2");
        bntReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntReporte2ActionPerformed(evt);
            }
        });

        bntReporte3.setText("Reporte 3");

        bntReporte4.setText("Reporte 4");

        bntReporte5.setText("Reporte 5");
        bntReporte5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntReporte5ActionPerformed(evt);
            }
        });

        bntReporte6.setText("Reporte 6");

        bntReporte1.setText("Reporte 1");
        bntReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntReporte1ActionPerformed(evt);
            }
        });

        bntRegresar.setText("Regresar");
        bntRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bntReporte3)
                        .addComponent(bntReporte2))
                    .addComponent(bntReporte1))
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntReporte5)
                    .addComponent(bntReporte4)
                    .addComponent(bntReporte6))
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntRegresar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntReporte4)
                    .addComponent(bntReporte1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntReporte2)
                    .addComponent(bntReporte5))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntReporte3)
                    .addComponent(bntReporte6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(bntRegresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntReporte5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntReporte5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntReporte5ActionPerformed

    private void bntRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRegresarActionPerformed
        // TODO add your handling code here:
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_bntRegresarActionPerformed

    private void bntReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntReporte1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_bntReporte1ActionPerformed

    private void bntReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntReporte2ActionPerformed
        // TODO add your handling code here:
         ChartPanel Panel = new ChartPanel(Grafica);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.setTitle("Reporte 2");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_bntReporte2ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntRegresar;
    private javax.swing.JButton bntReporte1;
    private javax.swing.JButton bntReporte2;
    private javax.swing.JButton bntReporte3;
    private javax.swing.JButton bntReporte4;
    private javax.swing.JButton bntReporte5;
    private javax.swing.JButton bntReporte6;
    // End of variables declaration//GEN-END:variables
}
