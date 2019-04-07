/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author adi herlambang
 */
public class UserStatus {
    private static String userName;
    private static String userSts;
    
    public static void setUserLogin(String userName, String userSts){
        UserStatus.userName = userName;
        UserStatus.userSts = userSts;
    }
    
    public static String getUserName(){
        return  userName;
    }
    
    public static String getUserStatus(){
        return userSts;
    }
}