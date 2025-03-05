package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
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
        con = Koneksi.getConnection();  // Menginisialisasi koneksi ke database
    }

    // ------------ Transaksi ------------ 

    // Metode untuk mengisi objek Transaksi berdasarkan hasil query
    public void setTransaksi() throws SQLException {
        transaksi.setTransaksi_id(rs.getString("transaksi_id"));
        transaksi.setPetugas_id(rs.getString("petugas_id"));
        transaksi.setWaktu_transaksi(rs.getTimestamp("waktu_transaksi"));
    }

    // Mengambil semua data transaksi dari tabel 'transaksi'
    public ArrayList<Transaksi> getListTransaksi() {
        try {
            listTransaksi = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM Transaksi", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery();
            rs.beforeFirst();
            while (rs.next()) {
                transaksi = new Transaksi();
                setTransaksi();  // Menetapkan data transaksi pada objek transaksi
                listTransaksi.add(transaksi);  // Menambahkan transaksi ke dalam list
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return listTransaksi;
    }

    // Menambahkan data transaksi baru ke dalam tabel 'transaksi'
    public void insertTransaksi(String transaksi_id, String petugas_id, java.sql.Timestamp waktu_transaksi) {
        String query = "INSERT INTO transaksi (transaksi_id, petugas_id, waktu_transaksi) VALUES (?, ?, ?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, transaksi_id);
            ps.setString(2, petugas_id);
            ps.setTimestamp(3, waktu_transaksi);
            ps.executeUpdate();  // Menjalankan query untuk menambahkan transaksi baru

            System.out.println("Transaksi berhasil ditambahkan");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    // Mengupdate data transaksi berdasarkan transaksi_id
    public void updateTransaksi(String transaksi_idNew, String petugas_id, java.sql.Timestamp waktu_transaksi, String transaksi_idOld) {
        String query = "UPDATE Transaksi SET transaksi_id = ?, petugas_id = ?, waktu_transaksi = ? WHERE transaksi_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, transaksi_idNew);
            ps.setString(2, petugas_id);
            ps.setTimestamp(3, waktu_transaksi);
            ps.setString(4, transaksi_idOld);
            ps.executeUpdate();  // Menjalankan query untuk mengupdate transaksi berdasarkan id

            System.out.println("Transaksi berhasil diupdate dengan id transaksi lama = " + transaksi_idOld + " menjadi id transaksi baru = " + transaksi_idNew);
        } catch (SQLException e) {
            System.out.println("Transaksi dengan id transaksi = " + transaksi_idOld + " tidak ditemukan");
        }
    }

    // Menghapus transaksi berdasarkan transaksi_id
    public void deleteTransaksi(String transaksi_id) {
        String query = "DELETE FROM transaksi WHERE transaksi_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, transaksi_id);
            ps.executeUpdate();  // Menjalankan query untuk menghapus transaksi berdasarkan id
            System.out.println("Data Transaksi sudah terhapus");
        } catch (SQLException e) {
            System.out.println("Data Transaksi dengan id transaksi = " + transaksi_id + " tidak ditemukan");
        }
    }

    // Mengambil data transaksi berdasarkan transaksi_id
//    public Transaksi getTransaksiById(String transaksi_id) {
//        transaksi = new Transaksi();
//        try {
//            ps = con.prepareStatement("SELECT * FROM transaksi WHERE transaksi_id = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            ps.setString(1, transaksi_id);
//            rs = ps.executeQuery();
//            rs.beforeFirst();
//            if (rs.next()) {
//                setTransaksi();  // Menetapkan data transaksi pada objek transaksi
//            } else {
//                throw new SQLException("Transaksi tidak ditemukan");
//            }
//        } catch (SQLException e) {
//            System.out.println("Error: " + e);
//            return transaksi = null;  // Mengembalikan objek transaksi null jika tidak ditemukan
//        }
//        return transaksi;
//    }
    
    // Method untuk mendapatkan Transaksi berdasarkan ID (untuk keperluan lookup)
    public Transaksi getTransaksiById(String transaksiId) {
        Transaksi transaksi = null;
        try {
            ps = con.prepareStatement(
                "SELECT * FROM transaksi WHERE transaksi_id = ?", 
                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_READ_ONLY
            );
            ps.setString(1, transaksiId);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                transaksi = new Transaksi();
                transaksi.setTransaksi_id(rs.getString("transaksi_id"));
                transaksi.setPetugas_id(rs.getString("petugas_id"));
                transaksi.setWaktu_transaksi(rs.getTimestamp("waktu_transaksi"));
            }
        } catch (SQLException e) {
            System.out.println("Error getting transaksi by ID: " + e);
        }
        
        return transaksi;
    }
    
    // Method untuk mendapatkan model tabel transaksi
    public DefaultTableModel getTransaksiTableModel() {
        String[] columnNames = {"Transaksi ID", "Petugas ID", "Waktu Transaksi"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
        try {
            ps = con.prepareStatement("SELECT * FROM transaksi", 
                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Object[] row = {
                    rs.getString("transaksi_id"),
                    rs.getString("petugas_id"),
                    rs.getTimestamp("waktu_transaksi")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            System.out.println("Error getting transaksi table model: " + e);
        }
        
        return model;
    }
    
    // Method untuk mencari transaksi berdasarkan ID
    public DefaultTableModel searchTransaksiById(String searchId) {
        String[] columnNames = {"Transaksi ID", "Petugas ID", "Waktu Transaksi"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
        try {
            ps = con.prepareStatement(
                "SELECT * FROM transaksi WHERE transaksi_id LIKE ?", 
                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_READ_ONLY
            );
            ps.setString(1, "%" + searchId + "%");
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Object[] row = {
                    rs.getString("transaksi_id"),
                    rs.getString("petugas_id"),
                    rs.getTimestamp("waktu_transaksi")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            System.out.println("Error searching transactions: " + e);
        }
        
        return model;
    }

    // ------------ Detail Transaksi ------------ 

    // Metode untuk mengisi objek detail_transaksi berdasarkan hasil query
    public void setDetailTransaksi() throws SQLException {
        detailTransaksi.setQty_produk(rs.getInt("qty_produk"));
        detailTransaksi.setTransaksi_id(rs.getString("transaksi_id"));
        detailTransaksi.setProduk_id(rs.getString("produk_id"));
        detailTransaksi.setHarga_satuan(rs.getDouble("harga_satuan"));
    }

    // Mengambil semua detail transaksi berdasarkan transaksi_id
    public ArrayList<Detail_Transaksi> getListDetailTransaksiByTransaksiId(String transaksi_id) {
        try {
            listDetailTransaksi = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM detail_transaksi WHERE transaksi_id = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, transaksi_id);
            rs = ps.executeQuery();
            rs.beforeFirst();
            while (rs.next()) {
                detailTransaksi = new Detail_Transaksi();
                setDetailTransaksi();  // Menetapkan data detail transaksi pada objek detail_transaksi
                listDetailTransaksi.add(detailTransaksi);  // Menambahkan detail transaksi ke dalam list
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return listDetailTransaksi;
    }

    // Menambahkan detail transaksi baru ke dalam tabel 'detail_transaksi'
    public void insertDetailTransaksi(String transaksi_id, String produk_id, int qty_produk, double harga_satuan) {
        String query = "INSERT INTO detail_transaksi (transaksi_id, produk_id, qty_produk, harga_satuan) VALUES (?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, transaksi_id);
            ps.setString(2, produk_id);
            ps.setInt(3, qty_produk);
            ps.setDouble(4, harga_satuan);
            ps.executeUpdate();  // Menjalankan query untuk menambahkan detail transaksi baru

            System.out.println("Detail Transaksi berhasil ditambahkan");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    // Mengupdate detail transaksi berdasarkan transaksi_id dan produk_id
    public void updateDetailTransaksi(String transaksi_id, String produk_id, int qty_produk, double harga_satuan) {
        String query = "UPDATE detail_transaksi SET qty_produk = ?, harga_satuan = ? WHERE transaksi_id = ? AND produk_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, qty_produk);
            ps.setDouble(2, harga_satuan);
            ps.setString(3, transaksi_id);
            ps.setString(4, produk_id);
            ps.executeUpdate();  // Menjalankan query untuk mengupdate detail transaksi

            System.out.println("Detail Transaksi berhasil diupdate");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    // Menghapus detail transaksi berdasarkan transaksi_id dan produk_id
    public void deleteDetailTransaksi(String transaksi_id, String produk_id) {
        String query = "DELETE FROM detail_transaksi WHERE transaksi_id = ? AND produk_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, transaksi_id);
            ps.setString(2, produk_id);
            ps.executeUpdate();  // Menjalankan query untuk menghapus detail transaksi berdasarkan id
            System.out.println("Detail Transaksi berhasil dihapus");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    // Mengambil detail transaksi berdasarkan transaksi_id dan produk_id
    public Detail_Transaksi getDetailTransaksiById(String transaksi_id, String produk_id) {
        detailTransaksi = new Detail_Transaksi();
        try {
            ps = con.prepareStatement("SELECT * FROM detail_transaksi WHERE transaksi_id = ? AND produk_id = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, transaksi_id);
            ps.setString(2, produk_id);
            rs = ps.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                setDetailTransaksi();  // Menetapkan data detail transaksi pada objek detail_transaksi
            } else {
                throw new SQLException("Detail Transaksi tidak ditemukan");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return detailTransaksi = null;  // Mengembalikan objek detail_transaksi null jika tidak ditemukan
        }
        return detailTransaksi;
    }
    
    // Method untuk mendapatkan detail transaksi berdasarkan ID
    public DefaultTableModel getDetailTransaksiTableModel(String transaksiId) {
        String[] columnNames = {"Produk ID", "Qty Produk", "Harga Satuan", "Total"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
        try {
            ps = con.prepareStatement(
                "SELECT produk_id, qty_produk, harga_satuan, " +
                "(qty_produk * harga_satuan) AS total " +
                "FROM detail_transaksi WHERE transaksi_id = ?"
            );
            ps.setString(1, transaksiId);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Object[] row = {
                    rs.getString("produk_id"),
                    rs.getInt("qty_produk"),
                    rs.getDouble("harga_satuan"),
                    rs.getDouble("total")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            System.out.println("Error getting detail transaksi: " + e);
        }
        
        return model;
    }
    
    // Method untuk menghitung penghasilan kotor
    public double calculateGrossIncome() {
        double grossIncome = 0;
        try {
            ps = con.prepareStatement(
                "SELECT SUM(qty_produk * harga_satuan) AS gross_income " +
                "FROM detail_transaksi"
            );
            rs = ps.executeQuery();
            if (rs.next()) {
                grossIncome = rs.getDouble("gross_income");
            }
        } catch (SQLException e) {
            System.out.println("Error calculating gross income: " + e);
        }
        return grossIncome;
    }
}