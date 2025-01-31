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
import koneksi.Koneksi;
import model.Petugas;

/**
 *
 * @author USER
 */
public class PetugasDAO {
    Connection con; 
    PreparedStatement ps;
    ResultSet rs;
    ArrayList <Petugas> listPetugas;
    Petugas petugas;
    
    public PetugasDAO() {
        con = Koneksi.getConnection();
    }
    
    public void setPetugas() throws SQLException{
        petugas.setPetugas_id(rs.getString("petugas_id"));
        petugas.setNama_petugas(rs.getString("nama_petugas"));
        petugas.setEmail(rs.getString("email"));
        petugas.setPassword(rs.getString("password"));
        petugas.setJabatan(rs.getString("jabatan"));
        petugas.setNo_hp(rs.getString("no_hp"));
    }
    
    //crud
    
    public ArrayList<Petugas> getListPetugas () {
        try {
            listPetugas = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM Petugas", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery();
            rs.beforeFirst();
            while (rs.next()) {
                petugas = new Petugas();
                setPetugas();

                listPetugas.add(petugas);
            }
        }
        catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return listPetugas;
    }
    
    public void insertPetugas (String petugas_id, String nama_petugas, String email, String password, String jabatan, String no_hp) {
        String query = "INSERT INTO petugas (petugas_id, nama_petugas, email, password, jabatan, no_hp) VALUES (?, ?, ?, ?, ?, ?,)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, petugas_id);
            ps.setString(2, nama_petugas);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, jabatan);
            ps.setString(6, no_hp);
            ps.executeUpdate();

            System.out.println("Petugas berhasil ditambahkan");
        }
        catch(SQLException e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void updatePetugas (String petugas_idNew,String nama_petugas, String email, String password, String jabatan, String no_hp, String petugas_idOld) {
        String query = "UPDATE Petugas SET " +
                "petugas_id = ?, nama_petugas, email = ?, password = ?, jabatan = ?, no_hp = ?" +
                "WHERE petugas_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, petugas_idNew);
            ps.setString(2, nama_petugas);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, jabatan);
            ps.setString(6, no_hp);
            ps.setString(7, petugas_idOld);

            ps.executeUpdate();

            System.out.println("Petugas berhasil diupdate dengan id petugas lama = " + petugas_idOld + " menjadi id Petugas Baru = " + petugas_idNew);
        }
        catch (SQLException e) {
            System.out.println("Petugas dengan Id Petugas = " + petugas_idOld + "tidak ditemukan");
        }
    }
    
    public void deletePetugas (String petugas_id) {
        String query = "DELETE FROM petugsa WHERE petugas_id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, petugas_id);

            ps.executeUpdate();
            System.out.println("Data Petugas sudah terhapus");
        }
        catch (SQLException e) {
            System.out.println("Data Petugas dengan petugas_id = " + petugas_id + "tidak ditemukan");
        }
    }
    
    public Petugas getPetugasByNik (String petugas_id) {
        petugas = new Petugas();
        try {
            ps = con.prepareStatement("SELECT * FROM petugas WHERE petugas_id = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, petugas_id);
            rs = ps.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                setPetugas();
            }
            else {
                throw new SQLException("Petugas tidak ditemukan");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return petugas = null;
        }
        return petugas;
    }
}