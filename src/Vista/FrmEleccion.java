/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author josej
 */
public class FrmEleccion extends javax.swing.JFrame {

    /**
     * Creates new form FrmEleccion
     */
    public FrmEleccion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNtiendas_elec = new javax.swing.JButton();
        BTNalmacen_elec = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNtiendas_elec.setBackground(new java.awt.Color(255, 234, 195));
        BTNtiendas_elec.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        BTNtiendas_elec.setForeground(new java.awt.Color(89, 69, 69));
        BTNtiendas_elec.setText("TIENDAS");
        BTNtiendas_elec.setBorder(null);
        getContentPane().add(BTNtiendas_elec, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 370, 80));

        BTNalmacen_elec.setBackground(new java.awt.Color(255, 234, 195));
        BTNalmacen_elec.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        BTNalmacen_elec.setForeground(new java.awt.Color(89, 69, 69));
        BTNalmacen_elec.setText("ALMACEN");
        BTNalmacen_elec.setBorder(null);
        getContentPane().add(BTNalmacen_elec, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 370, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\josej\\Documents\\NetBeansProjects\\ADS\\imagenes\\caption.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTNalmacen_elec;
    public javax.swing.JButton BTNtiendas_elec;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}