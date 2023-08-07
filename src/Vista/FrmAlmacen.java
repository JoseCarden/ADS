package Vista;
import Modelo.PlaceHolder;
public class FrmAlmacen extends javax.swing.JFrame {
    
    public FrmAlmacen() {
        initComponents();
        PlaceHolder phNombrePro = new PlaceHolder("Producto", TXTproducto_alma);
        PlaceHolder phCantPro = new PlaceHolder("Cantidad", TXTcant_alma);
        PlaceHolder phStockPro = new PlaceHolder("Stock", TXTstock_alma);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TBLprod_brutos = new javax.swing.JTable();
        BTNactualizar_almacen = new javax.swing.JButton();
        BTNagregar_alma = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        LBLempaques_enDirec = new javax.swing.JLabel();
        LBLvasos_enDirec = new javax.swing.JLabel();
        LBLbolsas_enDirec = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTempaques_alma = new javax.swing.JTextField();
        TXTvasos_alma = new javax.swing.JTextField();
        TXTbolsas_alma = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        TXTstock_alma = new javax.swing.JTextField();
        TXTproducto_alma = new javax.swing.JTextField();
        TXTcant_alma = new javax.swing.JTextField();
        BTNactivar_alma = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLprod_brutos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TBLprod_brutos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 470, 160));

        BTNactualizar_almacen.setBackground(new java.awt.Color(255, 93, 93));
        BTNactualizar_almacen.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        BTNactualizar_almacen.setForeground(new java.awt.Color(255, 227, 169));
        BTNactualizar_almacen.setText("ACTUALIZAR");
        getContentPane().add(BTNactualizar_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, 360, 60));

        BTNagregar_alma.setBackground(new java.awt.Color(255, 93, 93));
        BTNagregar_alma.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        BTNagregar_alma.setForeground(new java.awt.Color(255, 227, 169));
        BTNagregar_alma.setText("agregar");
        getContentPane().add(BTNagregar_alma, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 470, 60));

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 227, 169));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUCTOS EN ALMACÉN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\josej\\Documents\\NetBeansProjects\\ADS\\imagenes\\small_icon_starbucks.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 80, 90));

        jPanel1.setBackground(new java.awt.Color(255, 93, 93));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 5, 550));

        jPanel5.setBackground(new java.awt.Color(255, 93, 93));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLempaques_enDirec.setBackground(new java.awt.Color(102, 255, 204));
        LBLempaques_enDirec.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        LBLempaques_enDirec.setForeground(new java.awt.Color(255, 227, 169));
        LBLempaques_enDirec.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBLempaques_enDirec.setText("3 - empaques = ");
        jPanel5.add(LBLempaques_enDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 150, 30));

        LBLvasos_enDirec.setBackground(new java.awt.Color(102, 255, 204));
        LBLvasos_enDirec.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        LBLvasos_enDirec.setForeground(new java.awt.Color(255, 227, 169));
        LBLvasos_enDirec.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBLvasos_enDirec.setText("1 - vasos = ");
        jPanel5.add(LBLvasos_enDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 20));

        LBLbolsas_enDirec.setBackground(new java.awt.Color(102, 255, 204));
        LBLbolsas_enDirec.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        LBLbolsas_enDirec.setForeground(new java.awt.Color(255, 227, 169));
        LBLbolsas_enDirec.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBLbolsas_enDirec.setText("2 - bolsas =");
        jPanel5.add(LBLbolsas_enDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 20));

        jLabel5.setBackground(new java.awt.Color(102, 255, 102));
        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 227, 169));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INsumos en almacen");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 260, 30));

        TXTempaques_alma.setBackground(new java.awt.Color(255, 93, 93));
        TXTempaques_alma.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        TXTempaques_alma.setForeground(new java.awt.Color(255, 227, 169));
        TXTempaques_alma.setBorder(null);
        TXTempaques_alma.setOpaque(false);
        jPanel5.add(TXTempaques_alma, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 150, 30));

        TXTvasos_alma.setBackground(new java.awt.Color(255, 93, 93));
        TXTvasos_alma.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        TXTvasos_alma.setForeground(new java.awt.Color(255, 227, 169));
        TXTvasos_alma.setBorder(null);
        TXTvasos_alma.setOpaque(false);
        jPanel5.add(TXTvasos_alma, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 150, 40));

        TXTbolsas_alma.setBackground(new java.awt.Color(255, 93, 93));
        TXTbolsas_alma.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        TXTbolsas_alma.setForeground(new java.awt.Color(255, 227, 169));
        TXTbolsas_alma.setBorder(null);
        TXTbolsas_alma.setOpaque(false);
        jPanel5.add(TXTbolsas_alma, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 160, 40));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 360, 260));

        jPanel6.setBackground(new java.awt.Color(255, 93, 93));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTstock_alma.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TXTstock_alma.setBorder(null);
        jPanel6.add(TXTstock_alma, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 360, 40));

        TXTproducto_alma.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TXTproducto_alma.setBorder(null);
        jPanel6.add(TXTproducto_alma, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 360, 40));

        TXTcant_alma.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TXTcant_alma.setBorder(null);
        jPanel6.add(TXTcant_alma, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 360, 40));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 470, 260));

        BTNactivar_alma.setBackground(new java.awt.Color(255, 93, 93));
        BTNactivar_alma.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        BTNactivar_alma.setForeground(new java.awt.Color(255, 227, 169));
        BTNactivar_alma.setText("activar");
        getContentPane().add(BTNactivar_alma, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 360, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\josej\\Documents\\NetBeansProjects\\ADS\\imagenes\\cafeteria.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 640));

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
            java.util.logging.Logger.getLogger(FrmAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlmacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTNactivar_alma;
    public javax.swing.JButton BTNactualizar_almacen;
    public javax.swing.JButton BTNagregar_alma;
    public javax.swing.JLabel LBLbolsas_enDirec;
    public javax.swing.JLabel LBLempaques_enDirec;
    public javax.swing.JLabel LBLvasos_enDirec;
    public javax.swing.JTable TBLprod_brutos;
    public javax.swing.JTextField TXTbolsas_alma;
    private javax.swing.JTextField TXTcant_alma;
    public javax.swing.JTextField TXTempaques_alma;
    private javax.swing.JTextField TXTproducto_alma;
    private javax.swing.JTextField TXTstock_alma;
    public javax.swing.JTextField TXTvasos_alma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}