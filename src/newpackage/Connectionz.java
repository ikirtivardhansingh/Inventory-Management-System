/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author RAHUL
 */
public class Connectionz {
    
    static Connection con;
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginuser", "root", "");
            
        }catch(ClassNotFoundException | SQLException ex){
            //System.out.println("" + ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
        return con;
    }
    
}
