/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Atharva
 */
class DBconnect {
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;

public static Connection getConnection() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String passwd = "MahatmaGandhi";
        return DriverManager.getConnection(url, user, passwd);
    }
}

    
    
  

