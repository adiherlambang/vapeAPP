/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributor;


import DBConnector.MysqlCon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author adi herlambang
 */

public class DistributorData {
    
    public static Connection con;
    public static Statement stm;
    ResultSet rs;
    String sql;
    
    MysqlCon DB = new MysqlCon();
    
    
    
    public DefaultTableModel getDataPending(){
        DB.config();
        con = DB.con;
        stm = DB.stm;
        
        DefaultTableModel dm = new DefaultTableModel();
        
        dm.addColumn("ID");
        dm.addColumn("NomorPO");
        dm.addColumn("JenisBarang");
        dm.addColumn("JumlahBarang");
        dm.addColumn("Tanggal");
        dm.addColumn("Keterangan");
        dm.addColumn("Action");
        
        sql = "SELECT * FROM `pemesanan_distributor` WHERE STATUS=1";
        
        try{
            rs = stm.executeQuery(sql);
            
            while(rs.next()){
                String ID = rs.getString(1);
                String NomorPO = rs.getString(2);
                String JenisBarang = rs.getString(3);
                String JumlahBarang = rs.getString(4);
                String Tanggal = rs.getString(5);
                String Keterangan = rs.getString(7);
                
                dm.addRow(new String[]{ID,NomorPO,JenisBarang,JumlahBarang,Tanggal,Keterangan});
            }
            return dm;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public DefaultTableModel getDataOnProgress(){
        DB.config();
        con = DB.con;
        stm = DB.stm;
        
        DefaultTableModel dm = new DefaultTableModel();
        
        dm.addColumn("ID");
        dm.addColumn("NomorPO");
        dm.addColumn("JenisBarang");
        dm.addColumn("JumlahBarang");
        dm.addColumn("Tanggal");
        dm.addColumn("Keterangan");
        dm.addColumn("Action");
        
        sql = "SELECT * FROM `pemesanan_distributor` WHERE STATUS=2";
        
        try{
            rs = stm.executeQuery(sql);
            
            while(rs.next()){
                String ID = rs.getString(1);
                String NomorPO = rs.getString(2);
                String JenisBarang = rs.getString(3);
                String JumlahBarang = rs.getString(4);
                String Tanggal = rs.getString(5);
                String Keterangan = rs.getString(7);
                
                dm.addRow(new String[]{ID,NomorPO,JenisBarang,JumlahBarang,Tanggal,Keterangan});
            }
            return dm;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public DefaultTableModel getDataCompleted(){
        DB.config();
        con = DB.con;
        stm = DB.stm;
        
        DefaultTableModel dm = new DefaultTableModel();
        
        dm.addColumn("ID");
        dm.addColumn("NomorPO");
        dm.addColumn("JenisBarang");
        dm.addColumn("JumlahBarang");
        dm.addColumn("Tanggal");
        dm.addColumn("Keterangan");
        dm.addColumn("Action");
        
        sql = "SELECT * FROM `pemesanan_distributor` WHERE STATUS=3";
        
        try{
            rs = stm.executeQuery(sql);
            
            while(rs.next()){
                String ID = rs.getString(1);
                String NomorPO = rs.getString(2);
                String JenisBarang = rs.getString(3);
                String JumlahBarang = rs.getString(4);
                String Tanggal = rs.getString(5);
                String Keterangan = rs.getString(7);
                
                dm.addRow(new String[]{ID,NomorPO,JenisBarang,JumlahBarang,Tanggal,Keterangan});
            }
            return dm;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
