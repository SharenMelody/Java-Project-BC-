/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class Koneksi {
         private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            String dbUrl = "jdbc:mysql://localhost:3306/" +
                    "business_center";
            String username = "root";
            String password = "";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(dbUrl, username, password);
                System.out.println("Koneksi sukses");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Koneksi gagal : " + e);
            }
            return connection;
        }
    }

    public static void main(String[] args) {
        getConnection();
    }
}
