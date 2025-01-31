package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import koneksi.Koneksi;
import model.Transaksi;

public class TransaksiDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Transaksi> listTransaksi;
    Transaksi transaksi;

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
}