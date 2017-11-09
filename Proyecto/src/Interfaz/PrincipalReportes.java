/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import proyecto.Reportes;
//import static proyecto.Reportes.buscarDiscoReggae;

/**
 *
 * @author Anthonny
 */
public class PrincipalReportes extends javax.swing.JFrame {

    JFreeChart GraficaMusica;
    DefaultCategoryDataset musica = new DefaultCategoryDataset();
    
    JFreeChart graficaFechaMusica;
    DefaultCategoryDataset fechaReporte3 = new DefaultCategoryDataset();
    
    JFreeChart graficaFecha1;
    DefaultCategoryDataset fechaMusica = new DefaultCategoryDataset();

    JFreeChart GraficaUsuarios;
    DefaultCategoryDataset musicaUsuarios = new DefaultCategoryDataset();
    SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM");

////////////////////////////////////////////////////////////////////
    JFreeChart Grafica;
    JFreeChart grafica1;
    JFreeChart fechaPeliculas;
    DefaultCategoryDataset fechaReporte6 = new DefaultCategoryDataset();
    DefaultCategoryDataset Datos = new DefaultCategoryDataset();
    DefaultCategoryDataset DatosUsuario = new DefaultCategoryDataset();
    proyecto.Reportes a = new proyecto.Reportes();
    private int numero = 10;
    private String nombrePersona = "";
    private String cantidaDisponible = "";

    //Metodo para sacar el nombre del disco y la cantida del disco
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

//REPORTES DE MUSICA  
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////GRAFICA REPORTE 1////
        setTitle("Tienda de Discos");
        musica.addValue(a.CantidadBachata(), "Bachata", "Bachata");
        musica.addValue(a.CantidadElectronica(), "Electronica", "Electronica");
        musica.addValue(a.CantidadReggae(), "Reggae", "Reggae");
        musica.addValue(a.CantidadReaggaeton(), "Reaggaeton", "Reggaeton");
        musica.addValue(a.CantidadPop(), "Pop", "Pop");
        GraficaMusica = ChartFactory.createBarChart("Compras de discos de musica",
                "Categorias", "Compras", musica,
                PlotOrientation.HORIZONTAL, true, true, false);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////GRAFICA DE REPORTE 2////
        musicaUsuarios.addValue(a.CantidadUsuarioMusica(), "Kevin", "Kevin");
        musicaUsuarios.addValue(a.CantidadUsuarioMusica2(), "Raquel", "Raquel");
        musicaUsuarios.addValue(a.CantidadUsuarioMusica3(), "Anthonny", "Anthonny");
        musicaUsuarios.addValue(a.CantidadUsuarioMusica4(), "Ruben", "Ruben");
        musicaUsuarios.addValue(a.CantidadUsuarioMusica5(), "Kendall", "Kendall");
        GraficaUsuarios = ChartFactory.createBarChart("Usuarios que han comprado mas discos",
                "Categorias", "Compras", musicaUsuarios,
                PlotOrientation.HORIZONTAL, true, true, false);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         ////GRAFICA DE REPORTE 3////
        
         setTitle("Tienda de Discos");
        fechaReporte3.addValue(a.CantidadBachata(), "Bachata", "06/11/2017");
        fechaReporte3.addValue(a.CantidadElectronica(), "Electronica", "05/11/2017");
        fechaReporte3.addValue(a.CantidadReggae(), "Reggae", "29/10/2017");
        fechaReporte3.addValue(a.CantidadReaggaeton(), "Reaggaeton", "01/11/2017");
        fechaReporte3.addValue(a.CantidadPop(), "Pop", "28/2017/2017");
        graficaFechaMusica = ChartFactory.createBarChart("Compras de discos de musica por Fecha",
                "Categorias", "Fechas", fechaReporte3,
                PlotOrientation.HORIZONTAL, true, true, false);


//REPORTES DE PELICULAS
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //GRAFICA DE REPORTE 4////
        setTitle("Tienda de discos");
        Datos.addValue(a.CantidadTerror(), "Terror", "Terror");
        Datos.addValue(a.CantidadSuspenso(), "Suspenso", "Suspenso");
        Datos.addValue(a.CantidadComedia(), "Comedia", "Comedia");
        Datos.addValue(a.CantidadRomance(), "Romance", "Romances");
        Datos.addValue(a.CantidadAccion(), "Accion", "Accion");

        Grafica = ChartFactory.createBarChart("Compras de Peliculas",
                "Categorias", "Compras", Datos,
                PlotOrientation.HORIZONTAL, true, true, false);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //GRAFICA DE REPORTE 5////

        setTitle("Tienda de discos");
        DatosUsuario.addValue(a.CantidadUsuario1(), "Maria", "Maria");
        DatosUsuario.addValue(a.CantidadUsuario2(), "Anthonny", "Anthonny");
        DatosUsuario.addValue(a.CantidadUsuario3(), "Antonio", "Anthonio");
        DatosUsuario.addValue(a.CantidadUsuario4(), "Noel", "Noel");
        DatosUsuario.addValue(a.CantidadUsuario5(), "Roger", "Roger");

        grafica1 = ChartFactory.createBarChart("Discos de Peliculas mas comprados por usuario",
                "Usuarios", "Usuarios", DatosUsuario,
                PlotOrientation.HORIZONTAL, true, true, false);
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //GRAFICA DE REPORTE 6//////////////////////////////////////////////////////////////////////////////////////////
       setTitle("Tienda de discos");
        fechaReporte6.addValue(a.CantidadTerror(), "Terror", "06/11/2017");
        fechaReporte6.addValue(a.CantidadSuspenso(), "Suspenso", "05/11/2017");
        fechaReporte6.addValue(a.CantidadComedia(), "Comedia", "01/11/2017");
        fechaReporte6.addValue(a.CantidadRomance(), "Romance", "29/10/2017");
        fechaReporte6.addValue(a.CantidadAccion(), "Accion", "28/2017/2017");

        graficaFecha1 = ChartFactory.createBarChart("Discos de Peliculas mas comprados por Fecha",
                "Fechas", "Fechas", fechaReporte6,
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
        bntReporte5 = new javax.swing.JButton();
        bntReporte6 = new javax.swing.JButton();
        bntReporte1 = new javax.swing.JButton();
        bntRegresar = new javax.swing.JButton();
        bntPrueba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bntReporte2.setText("Reporte 2");
        bntReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntReporte2ActionPerformed(evt);
            }
        });

        bntReporte3.setText("Reporte 3");
        bntReporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntReporte3ActionPerformed(evt);
            }
        });

        bntReporte5.setText("Reporte 5");
        bntReporte5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntReporte5ActionPerformed(evt);
            }
        });

        bntReporte6.setText("Reporte 6");
        bntReporte6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntReporte6ActionPerformed(evt);
            }
        });

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

        bntPrueba.setText("Reporte 4");
        bntPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPruebaActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bntReporte5)
                        .addComponent(bntReporte6))
                    .addComponent(bntPrueba))
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
                    .addComponent(bntReporte1)
                    .addComponent(bntPrueba))
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
        ChartPanel Panel = new ChartPanel(grafica1);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.setTitle("Reporte 5");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//GEN-LAST:event_bntReporte5ActionPerformed

    private void bntRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRegresarActionPerformed
        // TODO add your handling code here:
        Mantenimiento ventanaPrincipal = new Mantenimiento();
        ventanaPrincipal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_bntRegresarActionPerformed

    private void bntReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntReporte1ActionPerformed
        // TODO add your handling code here:
        ChartPanel Panel = new ChartPanel(GraficaMusica);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.setTitle("Reporte 1");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }//GEN-LAST:event_bntReporte1ActionPerformed

    private void bntReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntReporte2ActionPerformed
        // TODO add your handling code here:
        ChartPanel Panel = new ChartPanel(GraficaUsuarios);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.setTitle("Reporte 2");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_bntReporte2ActionPerformed

    private void bntReporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntReporte3ActionPerformed
        // TODO add your handling code here:
        ChartPanel Pane1= new ChartPanel(graficaFechaMusica);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.setTitle("Reporte 3");
        Ventana.getContentPane().add(Pane1);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }//GEN-LAST:event_bntReporte3ActionPerformed

    private void bntReporte6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntReporte6ActionPerformed
     
       ChartPanel Panel = new ChartPanel(graficaFecha1);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.setTitle("Reporte 6");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_bntReporte6ActionPerformed

    private void bntPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPruebaActionPerformed
        // TODO add your handling code here:
        ChartPanel Panel = new ChartPanel(Grafica);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.setTitle("Reporte 4");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_bntPruebaActionPerformed

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
    private javax.swing.JButton bntPrueba;
    private javax.swing.JButton bntRegresar;
    private javax.swing.JButton bntReporte1;
    private javax.swing.JButton bntReporte2;
    private javax.swing.JButton bntReporte3;
    private javax.swing.JButton bntReporte5;
    private javax.swing.JButton bntReporte6;
    // End of variables declaration//GEN-END:variables
}
