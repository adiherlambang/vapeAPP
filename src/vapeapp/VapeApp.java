/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vapeapp;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author adi herlambang
 */
public class VapeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //open login frame
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //login Frame
                JFrame login_frame = new login.Login();
                login_frame.setVisible(true);          
            }
        });
        //end login frame
    }
   
}
