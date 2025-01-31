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
import javax.swing.JOptionPane;
import koneksi.Koneksi;
import model.Petugas;

/**
 *
 * @author Asus
 */
public class LoginDAO {
    Connection con; 
    PreparedStatement ps;
    ResultSet rs;
    ArrayList <Petugas> listPetugas;
    Petugas petugas;
    
    public LoginDAO() {
        con = Koneksi.getConnection();
    }
    
    public Petugas getPetugasByUsername(String nama_petugas, String password) {
    petugas = null;
    try {
        ps = con.prepareStatement("SELECT * FROM petugas WHERE nama_petugas = ? AND password = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setString(1, nama_petugas);
        ps.setString(2, password);
        rs = ps.executeQuery();

        if (rs.next()) {
            petugas = new Petugas();
            petugas.setPetugas_id(rs.getString("petugas_id"));
            petugas.setNama_petugas(rs.getString("nama_petugas"));
            petugas.setEmail(rs.getString("email"));
            petugas.setPassword(rs.getString("password"));
            petugas.setJabatan(rs.getString("jabatan"));
            petugas.setNo_hp(rs.getString("no_hp"));
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error saat login: " + e.getMessage());
    }
    return petugas;
}

}
