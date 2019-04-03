/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;
import DBConnector.MysqlCon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author adi herlambang
 */
public class SalesData{
    public static Connection con;
    public static Statement stm;
    ResultSet rs;
    String sql;
    
    MysqlCon DB = new MysqlCon();

    public DefaultListModel getJenisBarang(){
        DB.config();
        con = DB.con;
        stm = DB.stm;
        
        sql = "SELECT DISTINCT JenisBarang FROM `stock_barang`";
        DefaultListModel dm = new DefaultListModel();
        try{
            rs = stm.executeQuery(sql);
            while(rs.next()){                
                String JenisBarang = rs.getString(1);
                dm.addElement(JenisBarang);
            }
            return dm;
        }catch(Exception e){
            e.printStackTrace();           
        }
        
        return null;
    }
}    
