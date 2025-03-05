
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTable;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class gudangpage2 extends javax.swing.JFrame {
    private Dashboard dashboardPanel; // Ubah ini menjadi variabel instance

    // Constructor yang menerima Dashboard
    public gudangpage2(Dashboard dashboard) {
        this.dashboardPanel = dashboard; // Set dashboardPanel dengan instance yang diberikan
        initComponents();
    }
    
 
//    private Dashboard dashboardPanel; // Panel Dashboard
    private Stock stockBarangPanel; // Panel Stock Barang
    private CardLayout cardLayout;  // Variabel CardLayout
    
    /**
     * Creates new form ManagerPage
     */
    public gudangpage2() {
        initComponents();
        
        cardLayout = new CardLayout();
        pn_full.setLayout(cardLayout);
        
        dashboardPanel = new Dashboard();
        stockBarangPanel = new Stock();

        pn_full.add(dashboardPanel, "Dashboard");
        pn_full.add(stockBarangPanel, "Stock");

//        cardLayout = new CardLayout();
//        pn_full.getLayout();
//
//        pn_full.add(dashboardPanel, "Dashboard");
//        pn_full.add(stockBarangPanel, "StockBarang");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pn_kiti = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_Main = new javax.swing.JPanel();
        panel_Line = new javax.swing.JPanel();
        labDashboard = new javax.swing.JLabel();
        panelStock = new javax.swing.JPanel();
        psLine = new javax.swing.JPanel();
        labStock = new javax.swing.JLabel();
        buttonLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pn_full = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_kiti.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Staff Gudang");

        panel_Main.setBackground(new java.awt.Color(255, 255, 255));
        panel_Main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_MainMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_MainMouseEntered(evt);
            }
        });

        panel_Line.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_LineLayout = new javax.swing.GroupLayout(panel_Line);
        panel_Line.setLayout(panel_LineLayout);
        panel_LineLayout.setHorizontalGroup(
            panel_LineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panel_LineLayout.setVerticalGroup(
            panel_LineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        labDashboard.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labDashboard.setText("Dashboard");
        labDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labDashboardMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_MainLayout = new javax.swing.GroupLayout(panel_Main);
        panel_Main.setLayout(panel_MainLayout);
        panel_MainLayout.setHorizontalGroup(
            panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MainLayout.createSequentialGroup()
                .addComponent(panel_Line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_MainLayout.setVerticalGroup(
            panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelStock.setBackground(new java.awt.Color(255, 255, 255));

        psLine.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout psLineLayout = new javax.swing.GroupLayout(psLine);
        psLine.setLayout(psLineLayout);
        psLineLayout.setHorizontalGroup(
            psLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        psLineLayout.setVerticalGroup(
            psLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        labStock.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labStock.setText("Stock Barang");
        labStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labStockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labStockMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelStockLayout = new javax.swing.GroupLayout(panelStock);
        panelStock.setLayout(panelStockLayout);
        panelStockLayout.setHorizontalGroup(
            panelStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockLayout.createSequentialGroup()
                .addComponent(psLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labStock, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelStockLayout.setVerticalGroup(
            panelStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(psLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N

        javax.swing.GroupLayout pn_kitiLayout = new javax.swing.GroupLayout(pn_kiti);
        pn_kiti.setLayout(pn_kitiLayout);
        pn_kitiLayout.setHorizontalGroup(
            pn_kitiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kitiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_kitiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_Main, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83))
            .addGroup(pn_kitiLayout.createSequentialGroup()
                .addGroup(pn_kitiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_kitiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonLogout))
                    .addGroup(pn_kitiLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1))
                    .addGroup(pn_kitiLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_kitiLayout.setVerticalGroup(
            pn_kitiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kitiLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(panel_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(buttonLogout)
                .addContainerGap())
        );

        getContentPane().add(pn_kiti, java.awt.BorderLayout.LINE_START);

        pn_full.setBackground(new java.awt.Color(255, 255, 255));
        pn_full.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pn_full, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel_MainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_MainMouseEntered
        
    }//GEN-LAST:event_panel_MainMouseEntered

    private void labDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labDashboardMouseEntered
        panel_Main.setBackground(new Color(250,250,250));
        panel_Line.setBackground(new Color(0, 120,153));
        
    }//GEN-LAST:event_labDashboardMouseEntered

    private void labDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labDashboardMouseExited
        panel_Main.setBackground(new Color(255,255,255));
        panel_Line.setBackground(new Color(255, 255,255));
    }//GEN-LAST:event_labDashboardMouseExited

    private void labStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labStockMouseEntered
        panelStock.setBackground(new Color(250,250,250));
        psLine.setBackground(new Color(0,120,153));
    }//GEN-LAST:event_labStockMouseEntered

    private void labStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labStockMouseExited
        panelStock.setBackground(new Color(255,255,255));
        psLine.setBackground(new Color(255, 255,255));
    }//GEN-LAST:event_labStockMouseExited

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        // Tutup halaman gudangpage2
    this.dispose();
    
    // Buka halaman login (pastikan Anda punya class LoginPage)
    loginpage1 login = new loginpage1();
    login.setVisible(true);
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pn_full.removeAll(); // Clear the current panel
        pn_full.add(dashboardPanel); // Add the Dashboard panel
        pn_full.revalidate(); // Refresh the panel
        pn_full.repaint(); // Repaint the panel
    }//GEN-LAST:event_formWindowOpened

    private void panel_MainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_MainMouseClicked
        System.out.println("Dashboard diklik, menampilkan Dashboard...");
        setContentPanel("Dashboard");
    }//GEN-LAST:event_panel_MainMouseClicked

    private void labStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labStockMouseClicked
        System.out.println("Stock Barang diklik, menampilkan Stock...");
        setContentPanel("Stock");
        accessStockTable();
    }//GEN-LAST:event_labStockMouseClicked

    private void labDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labDashboardMouseClicked
        System.out.println("Dashboard diklik, menampilkan Dashboard...");
        setContentPanel("Dashboard");
    }//GEN-LAST:event_labDashboardMouseClicked
    
    private void setContentPanel(String panelName) {
        cardLayout.show(pn_full, panelName);
    }
    
    // Method untuk mengakses dan memanipulasi tabel di Stock
    public void updateStockTable(Object[][] data) {
        stockBarangPanel.setTableData(data);
    }
    
    // Getter untuk akses tabel di Stock
    public JTable getStockTable() {
        return stockBarangPanel.getTblStock();
    }
    
    public void accessStockTable() {
        JTable table = getStockTable();        
        System.out.println("Number of rows in table: " + table.getRowCount());
    }
        
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
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gudangpage2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labDashboard;
    private javax.swing.JLabel labStock;
    private javax.swing.JPanel panelStock;
    private javax.swing.JPanel panel_Line;
    private javax.swing.JPanel panel_Main;
    private javax.swing.JPanel pn_full;
    private javax.swing.JPanel pn_kiti;
    private javax.swing.JPanel psLine;
    // End of variables declaration//GEN-END:variables
}
