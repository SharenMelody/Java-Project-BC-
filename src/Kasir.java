import dao.ProdukDAO;
import java.sql.Timestamp;
import java.util.Date;
import model.Produk;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smkn24
 */
public class Kasir extends javax.swing.JPanel {
    Produk produk = new Produk();
    ProdukDAO dao = new ProdukDAO();
    LookupKasir lookupKasir;

    public Kasir() {
        initComponents();
        setWaktuTransaksi();
    }
    
    private String idPetugas;

    public void setIdPetugas(String idPetugas) {
        if (idPetugas == null || idPetugas.isEmpty()) {
            System.out.println("Warning: Empty Id Petugas"); // untuk debugging
            return;
        }

        this.idPetugas = idPetugas;
        if (IdPetugasTxt != null) {
            System.out.println("Setting Id Petugas to: " + idPetugas); // Debugging untuk nilai idPetugas
            System.out.println("Before setText: " + IdPetugasTxt.getText());
            IdPetugasTxt.setText("ID Petugas: " + idPetugas);
            System.out.println("After setText: " + IdPetugasTxt.getText());
        } else {
            System.out.println("IdPetugas JLabel is null"); // Debugging jika komponen null
        }
    }
    
    public void setWaktuTransaksi() {
        Date currentDate = new Date();
        System.out.println("Mendapatkan tanggal saat ini: " + currentDate); // Debugging
        WaktuTransaksiTxt.setDate(currentDate);
        System.out.println("Tanggal yang dipilih di JDateChooser (WaktuTransaksiTxt): " + WaktuTransaksiTxt.getDate());// Debugging
    }
    
    
    public javax.swing.JTable getTblProduk() {
        tblProduk.setModel(dao.getModel());
        srcProduk.setViewportView(tblProduk);
        return tblProduk;
    }
    
    // Setter untuk JTable (misalnya untuk mengubah data)
    public void setTableData(Object[][] data) {
        tblProduk.setModel(dao.getModel());
        srcProduk.setViewportView(tblProduk);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnBayar = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        srcProduk = new javax.swing.JScrollPane();
        tblProduk = new javax.swing.JTable();
        label1 = new java.awt.Label();
        txtPayment = new javax.swing.JTextField();
        txtKembalian = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        txtNamaProduk = new javax.swing.JTextField();
        IdPetugasTxt = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        txtHarga = new javax.swing.JTextField();
        label8 = new java.awt.Label();
        txtTotalHarga = new javax.swing.JTextField();
        spinJumlah = new javax.swing.JSpinner();
        WaktuTransaksiTxt = new com.toedter.calendar.JDateChooser();
        label9 = new java.awt.Label();
        txtIdProduk = new javax.swing.JTextField();
        Lookup = new javax.swing.JButton();

        btnReset.setBackground(new java.awt.Color(255, 0, 0));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnBayar.setText("Payment");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 226, 167));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        srcProduk.setViewportView(tblProduk);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Daftar Barang");

        txtPayment.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtPayment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentActionPerformed(evt);
            }
        });

        txtKembalian.setEditable(false);
        txtKembalian.setBackground(java.awt.Color.lightGray);
        txtKembalian.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txtKembalian.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Kembalian");

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Payment");

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Nama Barang");

        txtNamaProduk.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtNamaProduk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNamaProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaProdukActionPerformed(evt);
            }
        });

        IdPetugasTxt.setForeground(new java.awt.Color(0, 0, 0));
        IdPetugasTxt.setText("ID Petugas : ");

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("Jumlah Beli");

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 0, 0));
        label7.setText("Harga Barang");

        txtHarga.setEditable(false);
        txtHarga.setBackground(new java.awt.Color(204, 204, 204));
        txtHarga.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtHarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label8.setForeground(new java.awt.Color(0, 0, 0));
        label8.setText("Total Harga");

        txtTotalHarga.setEditable(false);
        txtTotalHarga.setBackground(new java.awt.Color(204, 204, 204));
        txtTotalHarga.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtTotalHarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label9.setForeground(new java.awt.Color(0, 0, 0));
        label9.setText("ID Barang");

        txtIdProduk.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtIdProduk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdukActionPerformed(evt);
            }
        });

        Lookup.setLabel("Lookup");
        Lookup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LookupMouseClicked(evt);
            }
        });
        Lookup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LookupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel2))
                    .addComponent(IdPetugasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaProduk)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(spinJumlah)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lookup))
                    .addComponent(txtIdProduk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
                    .addComponent(srcProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                    .addComponent(txtPayment)
                    .addComponent(txtKembalian)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WaktuTransaksiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdPetugasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WaktuTransaksiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(srcProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lookup))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentActionPerformed

    private void txtNamaProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaProdukActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed

    private void txtIdProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProdukActionPerformed

    private void LookupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LookupActionPerformed
        
    }//GEN-LAST:event_LookupActionPerformed

    private void LookupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LookupMouseClicked

        LookupKasir lookup = new LookupKasir(this, true);
        LookupKasir.tblLookup.setModel(dao.getLookProduk());
        LookupKasir.scrLookup.setViewportView(LookupKasir.tblLookup);
        lookup.setVisible(true);
    }//GEN-LAST:event_LookupMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label IdPetugasTxt;
    private javax.swing.JButton Lookup;
    private com.toedter.calendar.JDateChooser WaktuTransaksiTxt;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JSpinner spinJumlah;
    private javax.swing.JScrollPane srcProduk;
    private javax.swing.JTable tblProduk;
    public static javax.swing.JTextField txtHarga;
    public static javax.swing.JTextField txtIdProduk;
    private javax.swing.JTextField txtKembalian;
    public static javax.swing.JTextField txtNamaProduk;
    private javax.swing.JTextField txtPayment;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}
