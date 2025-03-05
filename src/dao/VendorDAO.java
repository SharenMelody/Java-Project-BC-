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
import model.Vendor;

/**
 *
 * @author USER
 */
public class VendorDAO {
    Connection con; 
    PreparedStatement ps;
    ResultSet rs;
    ArrayList <Vendor> listVendor;
    Vendor vendor;
    
    public VendorDAO() {
        con = Koneksi.getConnection();
    }
    
    public void setVendor() throws SQLException{
        vendor.setVendor_id(rs.getString("vendor_id"));
        vendor.setNama_vendor(rs.getString("nama_vendor"));
        vendor.setEmail(rs.getString("email"));
        vendor.setNo_hp(rs.getString("no_hp"));
    }
    
    public ArrayList<Vendor> getListPetugas () {
        try {
            listVendor = new ArrayList<>();
            ps = con.prepareStatement("SELECT * FROM vendor", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery();
            rs.beforeFirst();
            while (rs.next()) {
                vendor = new Vendor();
                setVendor();

                listVendor.add(vendor);
            }
        }
        catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return listVendor;
    }
    
    public Vendor getVendorByvendor_id (String vendor_id) {
        vendor = new Vendor();
        try {
            ps = con.prepareStatement("SELECT * FROM vendor WHERE vendor_id = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, vendor_id);
            rs = ps.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                setVendor();
            }
            else {
                throw new SQLException("Vendor tidak ditemukan");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return vendor = null;
        }
        return vendor;
    }
    
    public DefaultTableModel getLookVendor() {
        DefaultTableModel modelVendor = new DefaultTableModel();
        try {
            listVendor = new ArrayList();
            ps = con.prepareStatement("SELECT * FROM vendor", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery();
            rs.beforeFirst();
            while(rs.next()) {
                vendor = new Vendor();
                vendor.setVendor_id(rs.getString("vendor_id"));
                vendor.setNama_vendor(rs.getString("nama_vendor"));
                vendor.setEmail(rs.getString("email"));
                vendor.setNo_hp(rs.getString("no_hp"));
                listVendor.add(vendor);
            }
        }catch (SQLException se) {
                System.out.println("Error : "+se);
                listVendor = null;
        }
        if (listVendor != null && listVendor.size() > 0) {
            Object[][] dataTabel = new Object[listVendor.size()][4];
            for (int i = 0; i < listVendor.size(); i++) {                    
                dataTabel[i][0] = listVendor.get(i).getVendor_id();
                dataTabel[i][1] = listVendor.get(i).getNama_vendor();
                dataTabel[i][2] = listVendor.get(i).getEmail();
                dataTabel[i][3] = listVendor.get(i).getNo_hp();
            }
            String[] colNames = {"Vendor ID", "Nama Vendor", "Email", "No Hp"};
            modelVendor = new DefaultTableModel(dataTabel, colNames);
        } else {
            System.out.println("Tidak ada vendor.");
        }
        return modelVendor;
    }
}