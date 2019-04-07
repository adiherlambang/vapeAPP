/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales;
import DBConnector.MysqlCon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.swing.DefaultListModel;
import java.util.Date;

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
    
    public String generatedID() {
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMdd");
        String val;
        DB.config();
        con = DB.con;
        stm = DB.stm;
        
        
        Random id_pemesanan = new Random();
        Date date = new Date();
        
        //System.out.print(id_pemesanan);
        
        val = "PO"+dateformat.format(date)+id_pemesanan.nextInt(100000);
        
        sql="SELECT NomorPemesanan FROM `pemesanan_retailer`";
        
        try{
            rs = stm.executeQuery(sql);
            while(rs.next()){
                if(val.equals(rs.getString(1))){
                    val = "PO"+dateformat.format(date)+id_pemesanan.nextInt(100000);
                }            
            }
            return val;
        }catch(Exception e){
            e.printStackTrace();           
        }
        
        return null;
        
    }
}    
