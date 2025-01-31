package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import koneksi.Koneksi;
import model.Restock;
import model.Detail_Restock;

public class RestockDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Restock> listRestock;
    Restock restock;
    ArrayList<Detail_Restock> listDetailRestock;
    Detail_Restock detailRestock;

    public RestockDAO() {
        con = Koneksi.getConnection();  // Menginisialisasi koneksi ke database
    }

    // ------------ Restock ------------ 

    // Metode untuk mengisi objek Restock berdasarkan hasil query
    public void setRestock() throws SQLException {
        restock.setRestock_id(rs.getString("restock_id"));
        restock.setPetugas_id(rs.getString("petugas_id"));
        restock.setVendor_id(rs.getString("vendor_id"));
        restock.setNo_sk(rs.getString("no_sk"));
        restock.setTanggal_restock(rs.getDate("tanggal_restock"));
        restock.setStatus_restock(rs.getString("status_restock"));
    }

    // Mengambil semua data restock dari tabel 'restock'
    public ArrayList<Restock> getListRestock() {
        try {
            listRestock = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM restock", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery();
            rs.beforeFirst();
            while (rs.next()) {
                restock = new Restock();
                setRestock();  // Menetapkan data restock pada objek restock
                listRestock.add(restock);  // Menambahkan restock ke dalam list
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return listRestock;
    }

    // Menambahkan data restock baru ke dalam tabel 'restock'
    public void insertRestock(String restock_id, String petugas_id, String vendor_id, String no_sk, java.sql.Date tanggal_restock, String status_restock) {
        String query = "INSERT INTO restock (restock_id, petugas_id, vendor_id, no_sk, tanggal_restock, status_restock) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, restock_id);
            ps.setString(2, petugas_id);
            ps.setString(3, vendor_id);
            ps.setString(4, no_sk);
            ps.setDate(5, tanggal_restock);
            ps.setString(6, status_restock);
            ps.executeUpdate();  // Menjalankan query untuk menambahkan restock baru

            System.out.println("Restock berhasil ditambahkan");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    // Mengupdate data restock berdasarkan restock_id
    public void updateRestock(String restock_idNew, String petugas_id, String vendor_id, String no_sk, java.sql.Date tanggal_restock, String status_restock, String restock_idOld) {
        String query = "UPDATE restock SET restock_id = ?, petugas_id = ?, vendor_id = ?, no_sk = ?, tanggal_restock = ?, status_restock = ? WHERE restock_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, restock_idNew);
            ps.setString(2, petugas_id);
            ps.setString(3, vendor_id);
            ps.setString(4, no_sk);
            ps.setDate(5, tanggal_restock);
            ps.setString(6, status_restock);
            ps.setString(7, restock_idOld);
            ps.executeUpdate();  // Menjalankan query untuk mengupdate restock berdasarkan id

            System.out.println("Restock berhasil diupdate dengan id restock lama = " + restock_idOld + " menjadi id restock baru = " + restock_idNew);
        } catch (SQLException e) {
            System.out.println("Restock dengan id restock = " + restock_idOld + " tidak ditemukan");
        }
    }

    // Menghapus restock berdasarkan restock_id
    public void deleteRestock(String restock_id) {
        String query = "DELETE FROM restock WHERE restock_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, restock_id);
            ps.executeUpdate();  // Menjalankan query untuk menghapus restock berdasarkan id
            System.out.println("Data Restock sudah terhapus");
        } catch (SQLException e) {
            System.out.println("Data Restock dengan id restock = " + restock_id + " tidak ditemukan");
        }
    }

    // Mengambil data restock berdasarkan restock_id
    public Restock getRestockById(String restock_id) {
        restock = new Restock();
        try {
            ps = con.prepareStatement("SELECT * FROM restock WHERE restock_id = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, restock_id);
            rs = ps.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                setRestock();  // Menetapkan data restock pada objek restock
            } else {
                throw new SQLException("Restock tidak ditemukan");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return restock = null;  // Mengembalikan objek restock null jika tidak ditemukan
        }
        return restock;
    }

    // ------------ Detail Restock ------------ 
    
    // Metode untuk mengisi objek detail_restock berdasarkan hasil query
    public void setDetailRestock() throws SQLException {
        detailRestock.setQty_produk(rs.getInt("qty_produk"));
        detailRestock.setRestock_id(rs.getString("restock_id"));
        detailRestock.setProduk_id(rs.getString("produk_id"));
        detailRestock.setHarga_satuan(rs.getDouble("harga_satuan"));
    }

    // Mengambil semua detail restock berdasarkan restock_id
    public ArrayList<Detail_Restock> getListDetailRestockByRestockId(String restock_id) {
        try {
            listDetailRestock = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM detail_restock WHERE restock_id = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, restock_id);
            rs = ps.executeQuery();
            rs.beforeFirst();
            while (rs.next()) {
                detailRestock = new Detail_Restock();
                setDetailRestock();  // Menetapkan data detail restock pada objek detail_restock
                listDetailRestock.add(detailRestock);  // Menambahkan detail restock ke dalam list
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return listDetailRestock;
    }

    // Menambahkan detail restock baru ke dalam tabel 'detail_restock'
    public void insertDetailRestock(String restock_id, String produk_id, int qty_produk, double harga_satuan) {
        String query = "INSERT INTO detail_restock (restock_id, produk_id, qty_produk, harga_satuan) VALUES (?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, restock_id);
            ps.setString(2, produk_id);
            ps.setInt(3, qty_produk);
            ps.setDouble(4, harga_satuan);
            ps.executeUpdate();  // Menjalankan query untuk menambahkan detail restock baru

            System.out.println("Detail Restock berhasil ditambahkan");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    // Mengupdate detail restock berdasarkan restock_id dan produk_id
    public void updateDetailRestock(String restock_id, String produk_id, int qty_produk, double harga_satuan) {
        String query = "UPDATE detail_restock SET qty_produk = ?, harga_satuan = ? WHERE restock_id = ? AND produk_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, qty_produk);
            ps.setDouble(2, harga_satuan);
            ps.setString(3, restock_id);
            ps.setString(4, produk_id);
            ps.executeUpdate();  // Menjalankan query untuk mengupdate detail restock

            System.out.println("Detail Restock berhasil diupdate");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    // Menghapus detail restock berdasarkan restock_id dan produk_id
    public void deleteDetailRestock(String restock_id, String produk_id) {
        String query = "DELETE FROM detail_restock WHERE restock_id = ? AND produk_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, restock_id);
            ps.setString(2, produk_id);
            ps.executeUpdate();  // Menjalankan query untuk menghapus detail restock berdasarkan id
            System.out.println("Detail Restock berhasil dihapus");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    // Mengambil detail restock berdasarkan restock_id dan produk_id
    public Detail_Restock getDetailRestockById(String restock_id, String produk_id) {
        detailRestock = new Detail_Restock();
        try {
            ps = con.prepareStatement("SELECT * FROM detail_restock WHERE restock_id = ? AND produk_id = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, restock_id);
            ps.setString(2, produk_id);
            rs = ps.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                setDetailRestock();  // Menetapkan data detail restock pada objek detail_restock
            } else {
                throw new SQLException("Detail Restock tidak ditemukan");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return detailRestock = null;  // Mengembalikan objek detail_restock null jika tidak ditemukan
        }
        return detailRestock;
    }
}