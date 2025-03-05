/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author USER
 */
public class view_transaksi_detail {

    public String getPetugas_id() {
        return petugas_id;
    }

    public void setPetugas_id(String petugas_id) {
        this.petugas_id = petugas_id;
    }

    public String getTransaksi_id() {
        return transaksi_id;
    }

    public void setTransaksi_id(String transaksi_id) {
        this.transaksi_id = transaksi_id;
    }

    public Date getWaktu_transaksi() {
        return waktu_transaksi;
    }

    public void setWaktu_transaksi(Date waktu_transaksi) {
        this.waktu_transaksi = waktu_transaksi;
    }

    public int getQty_produk() {
        return qty_produk;
    }

    public void setQty_produk(int qty_produk) {
        this.qty_produk = qty_produk;
    }

    public String getProduk_id() {
        return produk_id;
    }

    public void setProduk_id(String produk_id) {
        this.produk_id = produk_id;
    }

    public int getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(int harga_satuan) {
        this.harga_satuan = harga_satuan;
    }
    String petugas_id;
    String transaksi_id;
    Date waktu_transaksi;
    int qty_produk;
    String produk_id;
    int harga_satuan;
}