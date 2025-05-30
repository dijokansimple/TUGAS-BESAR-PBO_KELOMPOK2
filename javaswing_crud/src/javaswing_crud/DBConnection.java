/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DIMAS
 */
public class DBConnection {
    public static Connection getConnection () throws SQLException {
        String url = "jdbc:mysql://localhost:3306/CRUDPBO";
        String user = "root";
        String password = "";
        
        return DriverManager.getConnection( url, user, password);
    }
    
}
