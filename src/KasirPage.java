
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class KasirPage extends javax.swing.JFrame {

    Dashboard dashboardPanel = new Dashboard();
    Kasir kasirPanel = new Kasir();
    /**
     * Creates new form ManagerPage
     */
    public KasirPage() {
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

        pn_kiti = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_Main = new javax.swing.JPanel();
        panel_Line = new javax.swing.JPanel();
        labDashboard = new javax.swing.JLabel();
        panelOrder = new javax.swing.JPanel();
        psLine = new javax.swing.JPanel();
        labOrder = new javax.swing.JLabel();
        buttonLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pn_full = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_kiti.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Staff Kasir");

        panel_Main.setBackground(new java.awt.Color(255, 255, 255));
        panel_Main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_MainMouseEntered(evt);
            }
        });

        panel_Line.setBackground(new java.awt.Color(255, 255, 255));
        panel_Line.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_LineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_LineMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_LineLayout = new javax.swing.GroupLayout(panel_Line);
        panel_Line.setLayout(panel_LineLayout);
        panel_LineLayout.setHorizontalGroup(
            panel_LineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        panel_LineLayout.setVerticalGroup(
            panel_LineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_MainLayout.setVerticalGroup(
            panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_MainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labDashboard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelOrder.setBackground(new java.awt.Color(255, 255, 255));

        psLine.setBackground(new java.awt.Color(255, 255, 255));
        psLine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                psLineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                psLineMouseExited(evt);
            }
        });

        javax.swing.GroupLayout psLineLayout = new javax.swing.GroupLayout(psLine);
        psLine.setLayout(psLineLayout);
        psLineLayout.setHorizontalGroup(
            psLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        psLineLayout.setVerticalGroup(
            psLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labOrder.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        labOrder.setText("Order");
        labOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labOrderMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelOrderLayout = new javax.swing.GroupLayout(panelOrder);
        panelOrder.setLayout(panelOrderLayout);
        panelOrderLayout.setHorizontalGroup(
            panelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrderLayout.createSequentialGroup()
                .addComponent(psLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelOrderLayout.setVerticalGroup(
            panelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(psLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labOrder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonLogout.setText("Logout");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N

        javax.swing.GroupLayout pn_kitiLayout = new javax.swing.GroupLayout(pn_kiti);
        pn_kiti.setLayout(pn_kitiLayout);
        pn_kitiLayout.setHorizontalGroup(
            pn_kitiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kitiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_kitiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_kitiLayout.createSequentialGroup()
                        .addComponent(buttonLogout)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_kitiLayout.createSequentialGroup()
                        .addGroup(pn_kitiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel_Main, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pn_kitiLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(83, 83, 83))))
            .addGroup(pn_kitiLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn_kitiLayout.setVerticalGroup(
            pn_kitiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kitiLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addComponent(panel_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(buttonLogout)
                .addContainerGap())
        );

        getContentPane().add(pn_kiti, java.awt.BorderLayout.LINE_START);

        pn_full.setBackground(new java.awt.Color(255, 255, 255));
        pn_full.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        pn_full.add(jPanel1, java.awt.BorderLayout.CENTER);

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

    private void labOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labOrderMouseEntered
        panelOrder.setBackground(new Color(250,250,250));
        psLine.setBackground(new Color(0,120,153));
    }//GEN-LAST:event_labOrderMouseEntered

    private void labOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labOrderMouseExited
        panelOrder.setBackground(new Color(255,255,255));
        psLine.setBackground(new Color(255, 255,255));
    }//GEN-LAST:event_labOrderMouseExited

    private void panel_LineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_LineMouseEntered
        panelOrder.setBackground(new Color(250,250,250));
        psLine.setBackground(new Color(0,120,153));
    }//GEN-LAST:event_panel_LineMouseEntered

    private void panel_LineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_LineMouseExited
     panelOrder.setBackground(new Color(255,255,255));
      psLine.setBackground(new Color(255, 255,255));
    }//GEN-LAST:event_panel_LineMouseExited

    private void psLineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psLineMouseEntered
       panelOrder.setBackground(new Color(250,250,250));
        psLine.setBackground(new Color(0,120,153));
    }//GEN-LAST:event_psLineMouseEntered

    private void psLineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psLineMouseExited
        panelOrder.setBackground(new Color(255,255,255));
      psLine.setBackground(new Color(255, 255,255));
    }//GEN-LAST:event_psLineMouseExited

    private void labDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labDashboardMouseClicked
        pn_full.removeAll(); // Clear the current panel
        pn_full.add(dashboardPanel); // Add the Dashboard panel
        pn_full.revalidate(); // Refresh the panel
        pn_full.repaint(); // Repaint the panel
    }//GEN-LAST:event_labDashboardMouseClicked

    private void labOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labOrderMouseClicked
        pn_full.removeAll(); // Clear the current panel
        pn_full.add(kasirPanel); // Add the Dashboard panel
        pn_full.revalidate(); // Refresh the panel
        pn_full.repaint(); // Repaint the panel
    }//GEN-LAST:event_labOrderMouseClicked

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
                new KasirPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labDashboard;
    private javax.swing.JLabel labOrder;
    private javax.swing.JPanel panelOrder;
    private javax.swing.JPanel panel_Line;
    private javax.swing.JPanel panel_Main;
    private javax.swing.JPanel pn_full;
    private javax.swing.JPanel pn_kiti;
    private javax.swing.JPanel psLine;
    // End of variables declaration//GEN-END:variables
}
