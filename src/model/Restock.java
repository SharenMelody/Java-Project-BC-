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
public class Restock {
    String status_restock;
    String no_sk;
    Date tanggal_restock;
    String restock_id;
    String petugas_id;
    String vendor_id;

    public String getStatus_restock() {
        return status_restock;
    }

    public void setStatus_restock(String status_restock) {
        this.status_restock = status_restock;
    }

    public String getNo_sk() {
        return no_sk;
    }

    public void setNo_sk(String no_sk) {
        this.no_sk = no_sk;
    }

    public Date getTanggal_restock() {
        return tanggal_restock;
    }

    public void setTanggal_restock(Date tanggal_restock) {
        this.tanggal_restock = tanggal_restock;
    }

    public String getRestock_id() {
        return restock_id;
    }

    public void setRestock_id(String restock_id) {
        this.restock_id = restock_id;
    }

    public String getPetugas_id() {
        return petugas_id;
    }

    public void setPetugas_id(String petugas_id) {
        this.petugas_id = petugas_id;
    }

    public String getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }
    
    
}
