/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import koneksi.Koneksi;
import model.view_transaksi_detail;

/**
 *
 * @author USER
 */
public class View_TransaksiDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<view_transaksi_detail> listViewTransaksi;
    view_transaksi_detail dao;

    public View_TransaksiDAO() {
        con = Koneksi.getConnection();  // Menginisialisasi koneksi ke database
    }

    // Metode untuk mengisi objek View_Transaksi berdasarkan hasil query
    public void setViewTransaksi() throws SQLException {
        dao.setPetugas_id(rs.getString("petugas_id"));
        dao.setTransaksi_id(rs.getString("transaksi_id"));
        dao.setProduk_id(rs.getString("produk_id"));
        dao.setQty_produk(rs.getInt("qty_produk"));
        dao.setHarga_satuan(rs.getInt("harga_satuan"));
        dao.setWaktu_transaksi(rs.getDate("waktu_transaksi"));
    }

    // Mengambil semua data dari view_transaksi
    public ArrayList<view_transaksi_detail> getListViewTransaksi() {
        try {
            listViewTransaksi = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM view_transaksi", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery();
            rs.beforeFirst();
            while (rs.next()) {
                listViewTransaksi = new View_Transaksi();
                setViewTransaksi();  // Menetapkan data view_transaksi pada objek viewTransaksi
                listViewTransaksi.add(viewTransaksi);  // Menambahkan view transaksi ke dalam list
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return listViewTransaksi;
    }

    // Mengambil data berdasarkan transaksi_id
    public View_Transaksi getViewTransaksiById(String transaksi_id) {
        viewTransaksi = new View_Transaksi();
        try {
            ps = con.prepareStatement("SELECT * FROM view_transaksi WHERE transaksi_id = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, transaksi_id);
            rs = ps.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                setViewTransaksi();  // Menetapkan data view transaksi pada objek viewTransaksi
            } else {
                throw new SQLException("View Transaksi tidak ditemukan");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return viewTransaksi = null;  // Mengembalikan objek viewTransaksi null jika tidak ditemukan
        }
        return viewTransaksi;
    }
}
}
