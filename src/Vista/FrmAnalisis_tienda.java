/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Diego
 */
public class FrmAnalisis_tienda extends javax.swing.JFrame {

    /**
     * Creates new form Gerentedistrital
     */
    public FrmAnalisis_tienda() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLtienda_enDistri = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CBXtienda_enDistri = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CBXurgencia_enDistri = new javax.swing.JComboBox<>();
        BTNclasificar_enDistri = new javax.swing.JButton();
        BTNconsultar_enDistri = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        LBLganancias_enDistri = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        LBLempaques_enDistri = new javax.swing.JLabel();
        LBLvasos_enDistri = new javax.swing.JLabel();
        LBLbolsas_enDistri = new javax.swing.JLabel();
        BTNlimpiar_enDistri = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLtienda_enDistri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(TBLtienda_enDistri);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 700, 160));

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 227, 169));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATOS DE TIENDA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 130, 20));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\josej\\Documents\\NetBeansProjects\\ADS\\imagenes\\small_icon_starbucks.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 90, 80));

        jPanel1.setBackground(new java.awt.Color(255, 93, 93));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 93, 93)));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(102, 255, 204));
        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 227, 169));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TIENDA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 67, 34));

        CBXtienda_enDistri.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        CBXtienda_enDistri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Starbucks Plz. Norte", "Starbucks Mega Plaza", "Starbucks Av. Tomas Valle" }));
        jPanel1.add(CBXtienda_enDistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 190, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 330, 70));

        jPanel2.setBackground(new java.awt.Color(255, 93, 93));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 10, 210));

        jPanel3.setBackground(new java.awt.Color(255, 93, 93));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 93, 93)));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(102, 102, 255));
        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 227, 169));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("clasificar urgencia");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 170, -1));

        CBXurgencia_enDistri.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        CBXurgencia_enDistri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajo", "Normal", "Alta", "Urgente" }));
        jPanel3.add(CBXurgencia_enDistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 190, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 410, 90));

        BTNclasificar_enDistri.setBackground(new java.awt.Color(255, 93, 93));
        BTNclasificar_enDistri.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        BTNclasificar_enDistri.setForeground(new java.awt.Color(255, 227, 169));
        BTNclasificar_enDistri.setText("clasificar");
        getContentPane().add(BTNclasificar_enDistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 220, 60));

        BTNconsultar_enDistri.setBackground(new java.awt.Color(255, 93, 93));
        BTNconsultar_enDistri.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        BTNconsultar_enDistri.setForeground(new java.awt.Color(255, 227, 169));
        BTNconsultar_enDistri.setText("CONSULTAR");
        getContentPane().add(BTNconsultar_enDistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 310, 70));

        jPanel4.setBackground(new java.awt.Color(255, 93, 93));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLganancias_enDistri.setBackground(new java.awt.Color(102, 255, 204));
        LBLganancias_enDistri.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        LBLganancias_enDistri.setForeground(new java.awt.Color(255, 227, 169));
        LBLganancias_enDistri.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBLganancias_enDistri.setText("Ganancias = s/. ");
        jPanel4.add(LBLganancias_enDistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 240, 70));

        jPanel5.setBackground(new java.awt.Color(255, 93, 93));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLempaques_enDistri.setBackground(new java.awt.Color(102, 255, 204));
        LBLempaques_enDistri.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        LBLempaques_enDistri.setForeground(new java.awt.Color(255, 227, 169));
        LBLempaques_enDistri.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBLempaques_enDistri.setText("empaques = ");
        jPanel5.add(LBLempaques_enDistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 20));

        LBLvasos_enDistri.setBackground(new java.awt.Color(102, 255, 204));
        LBLvasos_enDistri.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        LBLvasos_enDistri.setForeground(new java.awt.Color(255, 227, 169));
        LBLvasos_enDistri.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBLvasos_enDistri.setText("vasos = ");
        jPanel5.add(LBLvasos_enDistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, 20));

        LBLbolsas_enDistri.setBackground(new java.awt.Color(102, 255, 204));
        LBLbolsas_enDistri.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        LBLbolsas_enDistri.setForeground(new java.awt.Color(255, 227, 169));
        LBLbolsas_enDistri.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBLbolsas_enDistri.setText("bolsas =");
        jPanel5.add(LBLbolsas_enDistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 20));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, 200, 200));

        BTNlimpiar_enDistri.setBackground(new java.awt.Color(255, 93, 93));
        BTNlimpiar_enDistri.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        BTNlimpiar_enDistri.setForeground(new java.awt.Color(255, 227, 169));
        BTNlimpiar_enDistri.setText("LIMPIAR");
        getContentPane().add(BTNlimpiar_enDistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 220, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\josej\\Documents\\NetBeansProjects\\ADS\\imagenes\\cafeteria.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 520));

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
            java.util.logging.Logger.getLogger(FrmAnalisis_tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnalisis_tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnalisis_tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnalisis_tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAnalisis_tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTNclasificar_enDistri;
    public javax.swing.JButton BTNconsultar_enDistri;
    public javax.swing.JButton BTNlimpiar_enDistri;
    public javax.swing.JComboBox<String> CBXtienda_enDistri;
    public javax.swing.JComboBox<String> CBXurgencia_enDistri;
    public javax.swing.JLabel LBLbolsas_enDistri;
    public javax.swing.JLabel LBLempaques_enDistri;
    public javax.swing.JLabel LBLganancias_enDistri;
    public javax.swing.JLabel LBLvasos_enDistri;
    public javax.swing.JTable TBLtienda_enDistri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}