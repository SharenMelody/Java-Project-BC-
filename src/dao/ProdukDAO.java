/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;
import model.Produk;

public class ProdukDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Produk> listProduk;
    Produk produk;
    
    public ProdukDAO() {
        con = Koneksi.getConnection();
    }
    
    public void setProduk() throws SQLException {
        produk.setProduk_id(rs.getString("produk_id"));
        produk.setNama_produk(rs.getString("nama_produk"));
        produk.setHarga(rs.getDouble("harga"));
        produk.setDeskripsi(rs.getString("deskripsi"));
        produk.setStock(rs.getString("stock"));
        produk.setSatuan(rs.getString("satuan"));
    }
    
    public ArrayList<Produk> getListProduk() {
        try {
            listProduk = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM Produk", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery();
            rs.beforeFirst();
            while (rs.next()) {
                produk = new Produk();
                setProduk();
                listProduk.add(produk);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return listProduk;
    }
    
    public void insertProduk(String produk_id, String nama_produk, Double harga, String deskripsi, String stock, String satuan) {
        String query = "INSERT INTO produk (produk_id, nama_produk, harga, deskripsi, stock, satuan) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, produk_id);
            ps.setString(2, nama_produk);
            ps.setDouble(3, harga);
            ps.setString(4, deskripsi);
            ps.setString(5, stock);
            ps.setString(6, satuan);
            ps.executeUpdate();
            System.out.println("Produk berhasil ditambahkan");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void updateProduk(String produk_id, String nama_produk, Double harga, String deskripsi, String stock, String satuan) {
        String query = "UPDATE Produk SET produk_id = ?, nama_produk = ?, harga = ?, deskripsi = ?, stock = ?, satuan = ? WHERE produk_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, produk_id);
            ps.setString(2, nama_produk);
            ps.setDouble(3, harga);
            ps.setString(4, deskripsi);
            ps.setString(5, stock);
            ps.setString(6, satuan);
            ps.executeUpdate();
            System.out.println("Produk berhasil diupdate");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void deleteProduk(String produk_id) {
        String query = "DELETE FROM produk WHERE produk_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, produk_id);
            ps.executeUpdate();
            System.out.println("Produk berhasil dihapus");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
    
    public Produk getProdukById(String produk_id) {
        produk = new Produk();
        try {
            ps = con.prepareStatement("SELECT * FROM produk WHERE produk_id = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, produk_id);
            rs = ps.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                setProduk();
            } else {
                throw new SQLException("Produk tidak ditemukan");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;
        }
        return produk;
    }
    
    //View
    public DefaultTableModel getModel() {
        Object[][] dataTabel = new Object[getListProduk().size()][6];
        for(int i = 0; i < getListProduk().size(); i++) {
            dataTabel[i][0] = getListProduk().get(i).getProduk_id();
            dataTabel[i][1] = getListProduk().get(i).getNama_produk();
            dataTabel[i][2] = getListProduk().get(i).getDeskripsi();
            dataTabel[i][3] = getListProduk().get(i).getHarga();
            dataTabel[i][4] = getListProduk().get(i).getStock();
            dataTabel[i][5] = getListProduk().get(i).getSatuan();
        }
        String[] colNames = {"Produk ID", "Nama Produk", "Deskripsi","Harga", "Stock", "Satuan"};
        DefaultTableModel model = new DefaultTableModel(dataTabel, colNames);
        return model;
    }
    
    public DefaultTableModel getLookProduk() {
        DefaultTableModel modelProduk = new DefaultTableModel();
        try {
            listProduk = new ArrayList();
            ps = con.prepareStatement("SELECT produk_id, nama_produk, harga FROM Produk", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery();
            rs.beforeFirst();
            while(rs.next()) {
                produk = new Produk();
                produk.setProduk_id(rs.getString("produk_id"));
                produk.setNama_produk(rs.getString("nama_produk"));
                produk.setHarga(rs.getDouble("harga"));
                listProduk.add(produk);
            }
        }catch (SQLException se) {
                System.out.println("Error : "+se);
                listProduk = null;
        }
        if (listProduk != null && listProduk.size() > 0) {
            Object[][] dataTabel = new Object[listProduk.size()][3];
            for (int i = 0; i < listProduk.size(); i++) {                    
                dataTabel[i][0] = listProduk.get(i).getProduk_id();
                dataTabel[i][1] = listProduk.get(i).getNama_produk();
                dataTabel[i][2] = listProduk.get(i).getHarga();
            }
            String[] colNames = {"Produk ID", "Nama Produk", "Harga"};
            modelProduk = new DefaultTableModel(dataTabel, colNames);
        } else {
            System.out.println("Tidak ada produk.");
        }
        return modelProduk;
    }
}
