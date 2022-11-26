/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * GAD KALU worked on this
 */
public class ConnectionManager {
    public static Connection connect(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","ReadAlways22");          
        }
        catch(Exception e){
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, e);
        }
        return con;
    }
}
