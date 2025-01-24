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
public class Detail_Restock {
    String qty_produk;
    String restock_id;
    String produk_id;
    Double total_harga;

    public String getQty_produk() {
        return qty_produk;
    }

    public void setQty_produk(String qty_produk) {
        this.qty_produk = qty_produk;
    }

    public String getRestock_id() {
        return restock_id;
    }

    public void setRestock_id(String restock_id) {
        this.restock_id = restock_id;
    }

    public String getProduk_id() {
        return produk_id;
    }

    public void setProduk_id(String produk_id) {
        this.produk_id = produk_id;
    }

    public Double getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(Double total_harga) {
        this.total_harga = total_harga;
    }
   
    
}