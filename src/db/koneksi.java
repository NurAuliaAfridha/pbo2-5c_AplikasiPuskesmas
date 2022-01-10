/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ACER
 */
public class koneksi {
    public static Connection getConnection(){
        Connection connection = null;
        String driver = "com.mysql.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/puskesmasuas";
        String USER = "root";
        String PASS = "";
        if (connection == null){
            try{
                Class.forName(driver);
                connection = DriverManager.getConnection(URL, USER, PASS);
            }catch(ClassNotFoundException | SQLException error) {
                System.exit(0);
            }
        }return connection;
    }
    
}
