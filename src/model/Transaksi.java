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
public class Transaksi {
    String petugas_id;
    String transaksi_id;
    Date waktu_transaksi;

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
}
