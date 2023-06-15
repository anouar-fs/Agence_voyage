package jvproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class project_db {
    public static Connection getConnectio(){
        String user = "root";
        String password="APK2001";
        String url = "jdbc:mysql://localhost:3306/jvproject";
        Connection pconnection = null;
        try {
            
            pconnection = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return pconnection;
    } 
}
