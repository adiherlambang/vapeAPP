/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackgorundIMg;


import java.awt.Color;
import java.awt.Component;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author adi herlambang
 */
public class IconTable extends JLabel implements TableCellRenderer{
      
      public IconTable(String path){
          setOpaque(true);
          //setBackground(Color.BLUE);
           //URL imgURL = getClass().getResource(path);
           this.setText("delete");
           this.setIcon(new ImageIcon(path));
           this.setSize(35,40);
      }
     @Override
      public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        setSize(table.getRowHeight(row),Short.SIZE);
        
        if(isSelected){
            setBackground(Color.cyan);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int rows = table.getSelectedRow();
            model.removeRow(rows);
            
        }else{
            setBackground(Color.WHITE);
        } 
        return this;
        
      }
}
