/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package presentacion;

/**
 *
 * @author jerem
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JDesktopPane;

public class FmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FmPrincipal
     */
    public FmPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.WHITE);
                g.fillRect(0,0,getWidth(),getHeight());
            }
        };
        menuBar = new javax.swing.JMenuBar();
        MenuAlmacen = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MenuCompras = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        MenuVentas = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        MenuAcceso = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("puntoVenta");

        menuBar.setMaximumSize(new java.awt.Dimension(758, 32768));
        menuBar.setMinimumSize(new java.awt.Dimension(758, 71));
        menuBar.setPreferredSize(new java.awt.Dimension(758, 71));

        MenuAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/Almacen.png"))); // NOI18N
        MenuAlmacen.setText("Almacen");
        MenuAlmacen.setMaximumSize(new java.awt.Dimension(133, 32767));
        MenuAlmacen.setMinimumSize(new java.awt.Dimension(133, 70));
        MenuAlmacen.setPreferredSize(new java.awt.Dimension(133, 70));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Categorias");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuAlmacen.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Articulos");
        MenuAlmacen.add(jMenuItem2);

        menuBar.add(MenuAlmacen);

        MenuCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/Compras.png"))); // NOI18N
        MenuCompras.setText("Compras");
        MenuCompras.setMaximumSize(new java.awt.Dimension(134, 32767));
        MenuCompras.setMinimumSize(new java.awt.Dimension(134, 70));
        MenuCompras.setPreferredSize(new java.awt.Dimension(134, 70));

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Proveedores");
        MenuCompras.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Ingresos");
        MenuCompras.add(jMenuItem4);

        menuBar.add(MenuCompras);

        MenuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/Ventas.png"))); // NOI18N
        MenuVentas.setText("Ventas");
        MenuVentas.setMaximumSize(new java.awt.Dimension(133, 32767));
        MenuVentas.setMinimumSize(new java.awt.Dimension(133, 70));
        MenuVentas.setPreferredSize(new java.awt.Dimension(121, 70));

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Clientes");
        MenuVentas.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setText("Ventas");
        MenuVentas.add(jMenuItem6);

        menuBar.add(MenuVentas);

        MenuAcceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/Acceso.png"))); // NOI18N
        MenuAcceso.setText("Acceso");
        MenuAcceso.setMaximumSize(new java.awt.Dimension(133, 32767));
        MenuAcceso.setMinimumSize(new java.awt.Dimension(133, 70));
        MenuAcceso.setPreferredSize(new java.awt.Dimension(124, 70));

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setText("Roles");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        MenuAcceso.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem8.setText("Usuario");
        MenuAcceso.add(jMenuItem8);

        menuBar.add(MenuAcceso);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/Consultas.png"))); // NOI18N
        jMenu4.setText("Consultas");
        jMenu4.setMaximumSize(new java.awt.Dimension(128, 32767));
        jMenu4.setMinimumSize(new java.awt.Dimension(128, 70));
        jMenu4.setPreferredSize(new java.awt.Dimension(128, 70));

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem9.setText("Consultas Compras");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem10.setText("Consultas Ventas");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        menuBar.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/salir.png"))); // NOI18N
        jMenu5.setText("Salir");
        jMenu5.setMaximumSize(new java.awt.Dimension(108, 32767));
        jMenu5.setMinimumSize(new java.awt.Dimension(108, 70));
        jMenu5.setPreferredSize(new java.awt.Dimension(108, 70));
        menuBar.add(jMenu5);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmCategoria frmCategoria = new FrmCategoria();
        escritorio.add(frmCategoria);
        try {
            frmCategoria.setMaximum(true); // Hace que el JInternalFrame ocupe todo el espacio
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
        frmCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
            java.util.logging.Logger.getLogger(FmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmPrincipal().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAcceso;
    private javax.swing.JMenu MenuAlmacen;
    private javax.swing.JMenu MenuCompras;
    private javax.swing.JMenu MenuVentas;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
