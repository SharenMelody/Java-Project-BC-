import dao.RestockDAO;
import dao.ProdukDAO;
import dao.VendorDAO;
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
public class Restock extends javax.swing.JPanel {
    Produk produk = new Produk();
    ProdukDAO dao = new ProdukDAO();
    RestockDAO restockDAO = new RestockDAO();
    VendorDAO VendorDao = new VendorDAO();
    LookupKasir lookupKasir;

    public Restock() {
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
        btnKirim = new javax.swing.JButton();
        srcProduk = new javax.swing.JScrollPane();
        tblProduk = new javax.swing.JTable();
        label4 = new java.awt.Label();
        txtNamaProduk = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        txtHarga = new javax.swing.JTextField();
        spinJumlah = new javax.swing.JSpinner();
        WaktuTransaksiTxt = new com.toedter.calendar.JDateChooser();
        label9 = new java.awt.Label();
        txtIdProduk = new javax.swing.JTextField();
        Lookup = new javax.swing.JButton();
        IdPetugasTxt = new java.awt.Label();
        label10 = new java.awt.Label();
        txtRestockID = new javax.swing.JTextField();
        btnRestock = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        label11 = new java.awt.Label();
        LookupVendor = new javax.swing.JButton();
        txtVendor = new javax.swing.JTextField();
        label12 = new java.awt.Label();
        txtTotalHarga = new javax.swing.JTextField();
        btnHarga = new javax.swing.JButton();

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

        btnKirim.setBackground(new java.awt.Color(255, 226, 167));
        btnKirim.setText("KIRIM PERMINTAAN");
        btnKirim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKirimMouseClicked(evt);
            }
        });
        btnKirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKirimActionPerformed(evt);
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

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Nama Barang");

        txtNamaProduk.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtNamaProduk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNamaProduk.setEnabled(false);
        txtNamaProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaProdukActionPerformed(evt);
            }
        });

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("Jumlah Restock");

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 0, 0));
        label7.setText("Harga Beli Barang");

        txtHarga.setEditable(false);
        txtHarga.setBackground(new java.awt.Color(204, 204, 204));
        txtHarga.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtHarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        spinJumlah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spinJumlahMouseClicked(evt);
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
        label10.setText("Restock ID");

        txtRestockID.setEditable(false);
        txtRestockID.setBackground(new java.awt.Color(204, 204, 204));
        txtRestockID.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtRestockID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRestockID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRestockIDActionPerformed(evt);
            }
        });

        btnRestock.setLabel("Buat ID");
        btnRestock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRestockMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("Barang");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel11.setText("Restock");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setText("stock");

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("Barang");

        label11.setAlignment(java.awt.Label.CENTER);
        label11.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label11.setForeground(new java.awt.Color(0, 0, 0));
        label11.setText("Vendor");

        LookupVendor.setText("Pilih Vendor");
        LookupVendor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LookupVendorMouseClicked(evt);
            }
        });
        LookupVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LookupVendorActionPerformed(evt);
            }
        });

        txtVendor.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtVendor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendorActionPerformed(evt);
            }
        });

        label12.setAlignment(java.awt.Label.CENTER);
        label12.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label12.setForeground(new java.awt.Color(0, 0, 0));
        label12.setText("Total Harga");

        txtTotalHarga.setEditable(false);
        txtTotalHarga.setBackground(new java.awt.Color(204, 204, 204));
        txtTotalHarga.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtTotalHarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });

        btnHarga.setText("Perbarui Harga");
        btnHarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHargaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IdPetugasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(170, 170, 170))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtRestockID, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(314, 314, 314)
                            .addComponent(jLabel2))
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNamaProduk)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                        .addComponent(spinJumlah)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Lookup))
                        .addComponent(txtIdProduk)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtTotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LookupVendor))
                                    .addComponent(txtVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKirim, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(srcProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(WaktuTransaksiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(258, 258, 258))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel11))
                    .addComponent(WaktuTransaksiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdPetugasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(srcProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LookupVendor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKirim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRestockID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnKirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKirimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKirimActionPerformed

    private void txtNamaProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaProdukActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtIdProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProdukActionPerformed

    private void LookupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LookupActionPerformed
        
    }//GEN-LAST:event_LookupActionPerformed

    private void LookupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LookupMouseClicked
        LookupKasir lookup = new LookupKasir(this, true);
        LookupKasir.lblLookup.setText("Daftar Produk");
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
            String harga_value = tblProduk.getValueAt(row, 3).toString();       // Kolom ketiga: Harga
            
            Double Harga = Harga(harga_value);

            // Menampilkan nilai yang dipilih ke dalam JTextField
            txtIdProduk.setText(produk_id);
            txtNamaProduk.setText(nama_produk);
            txtHarga.setText(Harga.toString());
        }
        Hitung();
    }//GEN-LAST:event_tblProdukMousePressed

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        txtIdProduk.setText("");
        txtNamaProduk.setText("");
        txtHarga.setText("");
        spinJumlah.setValue(0);
        txtTotalHarga.setText("");
        txtVendor.setText("");
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnKirimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKirimMouseClicked
        String RestockID = txtRestockID.getText();
        String produk_id = txtIdProduk.getText();
        int JumlahProduk = (int) spinJumlah.getValue();
        Double harga_satuan = Double.parseDouble(txtHarga.getText());
        restockDAO.insertDetailRestock(RestockID, produk_id, JumlahProduk, harga_satuan);
    }//GEN-LAST:event_btnKirimMouseClicked

    private void txtRestockIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRestockIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRestockIDActionPerformed

    private void btnRestockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestockMouseClicked
        String PetugasID = "3";  // PetugasID diset langsung, Anda bisa menyesuaikan
        if (PetugasID == null || PetugasID.isEmpty()) {
            System.out.println("Petugas ID is null or empty");
            return;
        }

        // Generate RestockID menggunakan UUID
        String RestockID = "R-" + java.util.UUID.randomUUID().toString().replace("-", "");
        java.sql.Timestamp waktuRestock = new java.sql.Timestamp(System.currentTimeMillis());  // Waktu saat ini

        // Mengambil nilai VendorID dari txtVendor
        String VendorIDText = txtVendor.getText();

        // Memisahkan string berdasarkan tanda hubung "-"
        String[] parts = VendorIDText.split(" - ");

        if (parts.length > 0) {
            try {
                // Mengambil angka VendorID dari bagian pertama string dan mengonversinya menjadi integer
                int VendorID = Integer.parseInt(parts[0]);
                System.out.println("VendorID: " + VendorID);

                // Menggunakan VendorID sebagai parameter untuk insertRestock
                boolean restockInserted = restockDAO.insertRestock(RestockID, PetugasID, VendorID);  // Pastikan restockDAO menerima parameter yang sesuai

                if (!restockInserted) {
                    System.out.println("Restock gagal ditambahkan");
                    return;
                }

                // Update GUI jika restock berhasil
                txtRestockID.setText(RestockID);  // Update dengan RestockID yang baru

            } catch (NumberFormatException e) {
                System.out.println("Error: Tidak dapat mengonversi bagian pertama menjadi angka.");
            }
        } else {
            System.out.println("Format tidak sesuai. Tanda hubung tidak ditemukan.");
        }
    }//GEN-LAST:event_btnRestockMouseClicked

    private void LookupVendorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LookupVendorMouseClicked
        LookupVendor lookup = new LookupVendor(this, true);
        lookup.tblLookup.setModel(VendorDao.getLookVendor());
        lookup.scrLookup.setViewportView(lookup.tblLookup);
        lookup.setVisible(true);
    }//GEN-LAST:event_LookupVendorMouseClicked

    private void LookupVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LookupVendorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LookupVendorActionPerformed

    private void txtVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendorActionPerformed

    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed

    private void spinJumlahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spinJumlahMouseClicked
        Hitung();
    }//GEN-LAST:event_spinJumlahMouseClicked

    private void btnHargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHargaMouseClicked
        Hitung();
    }//GEN-LAST:event_btnHargaMouseClicked

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
    }
    
    private double Harga(String value) {
        Double Harga = null;
            if (value != null) {
                try {
                    // Mengonversi nilai ke Double, jika formatnya benar
                    Harga = Double.parseDouble(value.toString());

                    // Melakukan pengurangan berdasarkan ketentuan yang diberikan
                    if (Harga <= 1000) {
                        Harga -= 500;
                    } else if (Harga <= 3000) {
                        Harga -= 1000;
                    } else if (Harga <= 5000) {
                        Harga -= 2000;
                    } else if (Harga <= 10000) {
                        Harga -= 3000;
                    } else if (Harga <= 15000) {
                        Harga -= 5000;
                    } else if (Harga <= 25000) {
                        Harga -= 10000;
                    } else if (Harga <= 50000) {
                        Harga -= 15000;
                    } else {
                        Harga -= 25000;  // Jika lebih dari 50,000
                    }

                    // Menampilkan harga yang telah dikurangi
                    System.out.println("Harga setelah pengurangan: " + Harga);

                } catch (NumberFormatException e) {
                    // Menangani error jika konversi gagal
                    System.out.println("Error: Tidak dapat mengonversi nilai menjadi Double.");
                }
            }
        return Harga;
    }
    
    private String formatNumber(Double number) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
        return numberFormat.format(number);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static java.awt.Label IdPetugasTxt;
    private javax.swing.JButton Lookup;
    private javax.swing.JButton LookupVendor;
    private com.toedter.calendar.JDateChooser WaktuTransaksiTxt;
    private javax.swing.JButton btnHarga;
    private javax.swing.JButton btnKirim;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRestock;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label9;
    private javax.swing.JSpinner spinJumlah;
    private javax.swing.JScrollPane srcProduk;
    private javax.swing.JTable tblProduk;
    public static javax.swing.JTextField txtHarga;
    public static javax.swing.JTextField txtIdProduk;
    public static javax.swing.JTextField txtNamaProduk;
    private javax.swing.JTextField txtRestockID;
    public static javax.swing.JTextField txtTotalHarga;
    public static javax.swing.JTextField txtVendor;
    // End of variables declaration//GEN-END:variables
}
