/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USER
 */
public class Detail_Transaksi {
    int qty_produk;
    String transaksi_id;
    String produk_id;
    Double harga_satuan;

    public int getQty_produk() {
        return qty_produk;
    }

    public void setQty_produk(int qty_produk) {
        this.qty_produk = qty_produk;
    }

    public String getTransaksi_id() {
        return transaksi_id;
    }

    public void setTransaksi_id(String transaksi_id) {
        this.transaksi_id = transaksi_id;
    }

    public String getProduk_id() {
        return produk_id;
    }

    public void setProduk_id(String produk_id) {
        this.produk_id = produk_id;
    }

    public Double getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(Double total_harga) {
        this.harga_satuan = total_harga;
    }
    
    
}
