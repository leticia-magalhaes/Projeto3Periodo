/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author Letícia Magalhães
 */
public class DatabaseConnection {
    
    public Statement stm;
    public ResultSet rs;
    public Connection conexao;
    Connection con = null;
    
    public static Connection Conexao() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
                    
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "system" , "masterkey");
            System.out.println("Conectou");
            return con;
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } 
        return null;
    }
    }
