/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackgorundIMg;


import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author adi herlambang
 */
public class IconTable extends DefaultTableCellRenderer{

    public void fillColor(JTable t,JLabel l,boolean isSelected ){
        //setting the background and foreground when JLabel is selected
        if(isSelected){
            l.setBackground(t.getSelectionBackground());
            l.setForeground(t.getSelectionForeground());
        }
 
        else{
            l.setBackground(t.getBackground());
            l.setForeground(t.getForeground());
        }
 
    }
    
@Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
         boolean hasFocus, int row, int column)
     {
 
        if(value instanceof JLabel){
            JLabel label = (JLabel)value;
            //you can add the image here
            
            label.setIcon(new ImageIcon(getClass().getResource("src\\Img\\login.png")));
            label.setOpaque(true);
            fillColor(table,label,isSelected);
 
            return label;
        }  
        return null;
     }    

}
