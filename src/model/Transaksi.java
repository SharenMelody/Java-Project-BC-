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
public class Transaksi {
    String petugas_id;
    String transaksi_id;
    String waktu_transaksi;
    String status_transaksi;

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

    public String getWaktu_transaksi() {
        return waktu_transaksi;
    }

    public void setWaktu_transaksi(String waktu_transaksi) {
        this.waktu_transaksi = waktu_transaksi;
    }

    public String getStatus_transaksi() {
        return status_transaksi;
    }

    public void setStatus_transaksi(String status_transaksi) {
        this.status_transaksi = status_transaksi;
    }
    
    
}
