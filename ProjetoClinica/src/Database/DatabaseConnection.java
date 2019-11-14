/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;

/**
 *
 * @author Letícia Magalhães
 */
public class DatabaseConnection {
    
    public Connection Conexao() {
        
        Connection con = null;
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
                    
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "system" , "masterkey");
            System.out.println("Conectou");
        } catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch(SQLException e ) {
            e.printStackTrace();
        }
            
            return con;
        }
    
    }
