
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
public class ccCon {
    Connection con;
    
    public Connection getCon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection("DriverManager.getConnection(\"jdbc:mysql://localhost:3306/cctable\",\"\",\"\",\"\",\"\",\"\",\"\",\"\");", "admin", "admin");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ccCon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ccCon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return con;
    }
}
