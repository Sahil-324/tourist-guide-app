
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sahil
 */
public class DataBase {
    static String url = "jdbc:mysql://localhost:3306/work";
    
    
    static void saveCustomer(String MobileNumber , String Name , String Email , String Password) throws Exception{
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
            url,"root","root");
        
        Statement stmt = conn.createStatement();
        
        stmt.executeUpdate("insert into work values('"+MobileNumber+"','"+Name+"','"+Email+"','"+Password+"',0)");
        
        //closing connection
        conn.close();
    }
}
