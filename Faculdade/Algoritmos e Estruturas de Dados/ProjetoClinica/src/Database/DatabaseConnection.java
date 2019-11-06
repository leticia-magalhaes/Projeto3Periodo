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
    public Connection processRequest() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe [system em SYSTEM]","system","masterkey");
            return con;
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
