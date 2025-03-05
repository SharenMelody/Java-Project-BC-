import dao.TransaksiDAO;
import dao.ProdukDAO;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
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
    TransaksiDAO TransaksiDao = new TransaksiDAO();
    LookupKasir lookupKasir;

    public Kasir() {
        initComponents();
        setWaktuTransaksi();
    }
    
    private String idPetugas;

    public void setIdPetugas(String idPetugas) {
        if (idPetugas == null || idPetugas.isEmpty()) {
            System.out.println("Warning: Empty Id Petugas");
            IdPetugasTxt.setText("ID Petugas: Tidak Diketahui");
            return;
        }

        this.idPetugas = idPetugas;
        if (IdPetugasTxt != null) {
            System.out.println("Setting Id Petugas to: " + idPetugas);
            System.out.println("Before setText: " + IdPetugasTxt.getText());

            // Hanya set "ID Petugas: " + idPetugas jika idPetugas valid
            IdPetugasTxt.setText("ID Petugas: " + idPetugas);

            System.out.println("After setText: " + IdPetugasTxt.getText());
        } else {
            System.out.println("IdPetugas JTextField is null");
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
        IdPetugasTxt = new java.awt.Label();
        label10 = new java.awt.Label();
        txtTransaksi = new javax.swing.JTextField();
        btnTransaksi = new javax.swing.JButton();

        btnReset.setBackground(new java.awt.Color(255, 0, 0));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnBayar.setText("Payment");
        btnBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBayarMouseClicked(evt);
            }
        });
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 226, 167));
        btnSave.setText("SAVE");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        srcProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                srcProdukMousePressed(evt);
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
        tblProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProdukMousePressed(evt);
            }
        });
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

        IdPetugasTxt.setForeground(new java.awt.Color(0, 0, 0));
        IdPetugasTxt.setText("ID Petugas : ...");

        label10.setAlignment(java.awt.Label.CENTER);
        label10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label10.setForeground(new java.awt.Color(0, 0, 0));
        label10.setText("Transaksi");

        txtTransaksi.setEditable(false);
        txtTransaksi.setBackground(new java.awt.Color(204, 204, 204));
        txtTransaksi.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtTransaksi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransaksiActionPerformed(evt);
            }
        });

        btnTransaksi.setText("Buat Transaksi");
        btnTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransaksiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(314, 314, 314)
                            .addComponent(jLabel2))
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
                    .addComponent(IdPetugasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(srcProduk)
                    .addComponent(txtPayment)
                    .addComponent(txtKembalian)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(WaktuTransaksiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WaktuTransaksiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdPetugasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)))
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

    private void srcProdukMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srcProdukMousePressed

    }//GEN-LAST:event_srcProdukMousePressed

    private void tblProdukMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdukMousePressed
        int row = tblProduk.getSelectedRow();
        
        if (row >= 0) {
            String produk_id = tblProduk.getValueAt(row, 0).toString();  // Kolom pertama: Produk ID
            String nama_produk = tblProduk.getValueAt(row, 1).toString(); // Kolom kedua: Nama Produk
            String harga = tblProduk.getValueAt(row, 3).toString();       // Kolom ketiga: Harga

            // Menampilkan nilai yang dipilih ke dalam JTextField
            txtIdProduk.setText(produk_id);
            txtNamaProduk.setText(nama_produk);
            txtHarga.setText(harga);
        }
        Hitung();
    }//GEN-LAST:event_tblProdukMousePressed

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        txtIdProduk.setText("");
        txtNamaProduk.setText("");
        txtHarga.setText("");
        spinJumlah.setValue(0);
        txtTotalHarga.setText("");
        txtPayment.setText("");
        txtKembalian.setText("");
        
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        Hitung();
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBayarMouseClicked

        transaksiID = TransaksiDao.getLatestTransaksiId();
        if (!TransaksiDao.checkTransaksiIdExists(transaksiID)) {
            System.out.println("Transaksi ID tidak ditemukan di tabel transaksi");
            return;
        }

        // Tabel DetailTransaksi
        String ProdukID = txtIdProduk.getText();
        int JumlahProduk = (int) spinJumlah.getValue();
        Double Harga = Double.parseDouble(txtHarga.getText());

        // Insert ke Detail Transaksi
        TransaksiDao.insertDetailTransaksi(transaksiID, ProdukID, JumlahProduk, Harga);
    }//GEN-LAST:event_btnBayarMouseClicked

    private void txtTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransaksiActionPerformed

    private void btnTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaksiMouseClicked
        String PetugasID = "3";
        if (PetugasID == null || PetugasID.isEmpty()) {
            System.out.println("Petugas ID is null or empty");
            return;
        }
        
        String transaksiID = "T-" + java.util.UUID.randomUUID().toString().replace("-", "");
        java.sql.Timestamp waktuTransaksi = new java.sql.Timestamp(System.currentTimeMillis());
        
        // Insert ke Tabel Transaksi dan cek apakah berhasil
        boolean transaksiInserted = TransaksiDao.insertTransaksi(transaksiID, PetugasID);

        if (!transaksiInserted) {
            System.out.println("Transaksi gagal ditambahkan");
            return;
        }
        
        txtTransaksi.setText(transaksiID);
    }//GEN-LAST:event_btnTransaksiMouseClicked

    private void Hitung() {
        Object jumlahObj = spinJumlah.getValue();
        Double jumlah = 0.0;

        if (jumlahObj instanceof Integer) {
            jumlah = ((Integer) jumlahObj).doubleValue();
        } else if (jumlahObj instanceof Double) {
            jumlah = (Double) jumlahObj;
        }

        // Memeriksa jika txtHarga kosong atau null, dan mengembalikan 0
        Double harga = 0.0;
        if (txtHarga.getText() != null && !txtHarga.getText().isEmpty()) {
            harga = Double.parseDouble(txtHarga.getText());
        }

        // Menghitung total harga
        Double TotalHarga = jumlah * harga;
        String formattedTotalHarga = formatNumber(TotalHarga);
        txtTotalHarga.setText(formattedTotalHarga);

        // Memeriksa jika txtPayment kosong atau null, dan mengembalikan 0
        Double payment = 0.0;
        if (txtPayment.getText() != null && !txtPayment.getText().isEmpty()) {
            payment = Double.parseDouble(txtPayment.getText());
        }

        // Menghitung kembalian
        Double Kembalian = payment - TotalHarga;
        String formattedKembalian = formatNumber(Kembalian);
        txtKembalian.setText(formattedKembalian);
    }
    
    private String formatNumber(Double number) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
        return numberFormat.format(number);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static java.awt.Label IdPetugasTxt;
    private javax.swing.JButton Lookup;
    private com.toedter.calendar.JDateChooser WaktuTransaksiTxt;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnTransaksi;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    private java.awt.Label label10;
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
    private javax.swing.JTextField txtTransaksi;
    // End of variables declaration//GEN-END:variables
}
