/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class MyConnection {

    public static final String CONNECTION_USER_NAME = "root";
    public static final String CONNECTION_PASSWORD = "";
    public static final String CONNECTION_DATABASE_NAME = "student";
    public static final String CONNECTION_DATABASE_URL = "jdbc:mysql://localhost:3306/" + CONNECTION_DATABASE_NAME;
    public static final String CONNECTION_DATABASE_CLASS = "com.mysql.jdbc.Driver";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(CONNECTION_DATABASE_CLASS);
            connection = DriverManager.getConnection(CONNECTION_DATABASE_URL, CONNECTION_USER_NAME, CONNECTION_PASSWORD);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
