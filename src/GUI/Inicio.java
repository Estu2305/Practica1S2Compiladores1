/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author SELVYN
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        VentanaInicio = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        VentanaArchivo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        VentanaReportes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dubai Light", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenidos ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 270, 50));

        jButton1.setText("Archivos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo/4819735.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 640));

        jMenu1.setText("Principal");

        VentanaInicio.setText("Inicio ");
        VentanaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaInicioActionPerformed(evt);
            }
        });
        jMenu1.add(VentanaInicio);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cargar");

        VentanaArchivo.setText("Archivos");
        VentanaArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaArchivoActionPerformed(evt);
            }
        });
        jMenu2.add(VentanaArchivo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Informe");

        VentanaReportes.setText("Reportes");
        VentanaReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaReportesActionPerformed(evt);
            }
        });
        jMenu3.add(VentanaReportes);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VentanaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaInicioActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Inicio prin = new Inicio();
        prin.setVisible(true);
    }//GEN-LAST:event_VentanaInicioActionPerformed

    private void VentanaArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaArchivoActionPerformed
        // TODO add your handling code here:\
        this.setVisible(false);
        Archivos prin = new Archivos();
        prin.setVisible(true);
    }//GEN-LAST:event_VentanaArchivoActionPerformed

    private void VentanaReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaReportesActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Reportes prin = new Reportes();
        prin.setVisible(true);
    }//GEN-LAST:event_VentanaReportesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Archivos prin = new Archivos();
        prin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem VentanaArchivo;
    private javax.swing.JMenuItem VentanaInicio;
    private javax.swing.JMenuItem VentanaReportes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
