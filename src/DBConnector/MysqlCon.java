/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnector;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author adi herlambang
 */
public class MysqlCon {
    public Connection con;
    public Statement stm;
    
    public void config() {
        try{
            String url ="jdbc:mysql://localhost/vapeapp";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
//            System.out.println("Connection Succeed");
        } catch (Exception e){
//            System.err.println("Connection failure" +e.getMessage());
            JOptionPane.showMessageDialog(null,"Error !! "+ e.getMessage());
            System.exit(0);
        }
    }
}
