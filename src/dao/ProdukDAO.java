/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import koneksi.Koneksi;
import model.Produk;

/**
 *
 * @author USER
 */
public class ProdukDAO {
    Connection con; 
    PreparedStatement ps;
    ResultSet rs;
    ArrayList <Produk> listProduks;
    Produk produk;
    
    public ProdukDAO() {
        con = Koneksi.getConnection();
    }
}
