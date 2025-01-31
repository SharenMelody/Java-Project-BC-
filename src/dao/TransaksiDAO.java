package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import koneksi.Koneksi;
import model.Transaksi;
import model.Detail_Transaksi;

public class TransaksiDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Transaksi> listTransaksi;
    Transaksi transaksi;
    ArrayList<Detail_Transaksi> listDetailTransaksi;
    Detail_Transaksi detailTransaksi;

    public TransaksiDAO() {
        con = Koneksi.getConnection();
    }

    public void setTransaksi() throws SQLException {
        transaksi.setTransaksi_id(rs.getString("transaksi_id"));
        transaksi.setPetugas_id(rs.getString("petugas_id"));
        transaksi.setWaktu_transaksi(rs.getDate("waktu_transaksi"));
        transaksi.setStatus_transaksi(rs.getString("status_transaksi"));
    }

    // CRUD Methods
    public ArrayList<Transaksi> getListTransaksi() {
        try {
            listTransaksi = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM Transaksi", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery();
            rs.beforeFirst();
            while (rs.next()) {
                transaksi = new Transaksi();
                setTransaksi();
                listTransaksi.add(transaksi);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return listTransaksi;
    }

    public void insertTransaksi(String transaksi_id, String petugas_id, java.sql.Timestamp waktu_transaksi, String status_transaksi) {
        String query = "INSERT INTO transaksi (transaksi_id, petugas_id, waktu_transaksi, status_transaksi) VALUES (?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, transaksi_id);
            ps.setString(2, petugas_id);
            ps.setTimestamp(3, waktu_transaksi);
            ps.setString(4, status_transaksi);
            ps.executeUpdate();

            System.out.println("Transaksi berhasil ditambahkan");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    public void updateTransaksi(String transaksi_idNew, String petugas_id, java.sql.Timestamp waktu_transaksi, String status_transaksi, String transaksi_idOld) {
        String query = "UPDATE Transaksi SET transaksi_id = ?, petugas_id = ?, waktu_transaksi = ?, status_transaksi = ? WHERE transaksi_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, transaksi_idNew);
            ps.setString(2, petugas_id);
            ps.setTimestamp(3, waktu_transaksi);
            ps.setString(4, status_transaksi);
            ps.setString(5, transaksi_idOld);
            ps.executeUpdate();

            System.out.println("Transaksi berhasil diupdate dengan id transaksi lama = " + transaksi_idOld + " menjadi id transaksi baru = " + transaksi_idNew);
        } catch (SQLException e) {
            System.out.println("Transaksi dengan id transaksi = " + transaksi_idOld + " tidak ditemukan");
        }
    }

    public void deleteTransaksi(String transaksi_id) {
        String query = "DELETE FROM transaksi WHERE transaksi_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, transaksi_id);
            ps.executeUpdate();
            System.out.println("Data Transaksi sudah terhapus");
        } catch (SQLException e) {
            System.out.println("Data Transaksi dengan id transaksi = " + transaksi_id + " tidak ditemukan");
        }
    }

    public Transaksi getTransaksiById(String transaksi_id) {
        transaksi = new Transaksi();
        try {
            ps = con.prepareStatement("SELECT * FROM transaksi WHERE transaksi_id = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, transaksi_id);
            rs = ps.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                setTransaksi();
            } else {
                throw new SQLException("Transaksi tidak ditemukan");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return transaksi = null;
        }
        return transaksi;
    }
    
    public void setDetailTransaksi() throws SQLException {
        detailTransaksi.setQty_produk(rs.getInt("qty_produk"));
        detailTransaksi.setTransaksi_id(rs.getString("transaksi_id"));
        detailTransaksi.setProduk_id(rs.getString("produk_id"));
        detailTransaksi.setHarga_satuan(rs.getDouble("harga_satuan"));
    }

    // CRUD Methods

    public ArrayList<Detail_Transaksi> getListDetailTransaksiByTransaksiId(String transaksi_id) {
        try {
            listDetailTransaksi = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM detail_transaksi WHERE transaksi_id = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, transaksi_id);
            rs = ps.executeQuery();
            rs.beforeFirst();
            while (rs.next()) {
                detailTransaksi = new Detail_Transaksi();
                setDetailTransaksi();
                listDetailTransaksi.add(detailTransaksi);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return listDetailTransaksi;
    }

    public void insertDetailTransaksi(String transaksi_id, String produk_id, int qty_produk, double harga_satuan) {
        String query = "INSERT INTO detail_transaksi (transaksi_id, produk_id, qty_produk, harga_satuan) VALUES (?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, transaksi_id);
            ps.setString(2, produk_id);
            ps.setInt(3, qty_produk);
            ps.setDouble(4, harga_satuan);
            ps.executeUpdate();

            System.out.println("Detail Transaksi berhasil ditambahkan");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    public void updateDetailTransaksi(String transaksi_id, String produk_id, int qty_produk, double harga_satuan) {
        String query = "UPDATE detail_transaksi SET qty_produk = ?, harga_satuan = ? WHERE transaksi_id = ? AND produk_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, qty_produk);
            ps.setDouble(2, harga_satuan);
            ps.setString(3, transaksi_id);
            ps.setString(4, produk_id);
            ps.executeUpdate();

            System.out.println("Detail Transaksi berhasil diupdate");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    public void deleteDetailTransaksi(String transaksi_id, String produk_id) {
        String query = "DELETE FROM detail_transaksi WHERE transaksi_id = ? AND produk_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, transaksi_id);
            ps.setString(2, produk_id);
            ps.executeUpdate();
            System.out.println("Detail Transaksi berhasil dihapus");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    public Detail_Transaksi getDetailTransaksiById(String transaksi_id, String produk_id) {
        detailTransaksi = new Detail_Transaksi();
        try {
            ps = con.prepareStatement("SELECT * FROM detail_transaksi WHERE transaksi_id = ? AND produk_id = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, transaksi_id);
            ps.setString(2, produk_id);
            rs = ps.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                setDetailTransaksi();
            } else {
                throw new SQLException("Detail Transaksi tidak ditemukan");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return detailTransaksi = null;
        }
        return detailTransaksi;
    }
}