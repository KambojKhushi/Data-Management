/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khushi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author khushi
 */
public class javaConnect {
    public static Connection connectDb() throws SQLException{
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
    return conn;
    }catch(ClassNotFoundException |SQLException e){
    JOptionPane.showMessageDialog(null, e);
    return null;
    }
        
    }
}
