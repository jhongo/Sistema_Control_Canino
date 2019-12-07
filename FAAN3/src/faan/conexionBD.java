package faan;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexionBD {
    
     Connection con = null; 
    
    public Connection conectar()
    {
    
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
            con =DriverManager.getConnection("jdbc:ucanaccess://C://FAAN2/BDFAAN.accdb");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) { 
            
             JOptionPane.showMessageDialog(null, "No se conecto con la base de datos"); 
             System.out.println(e);
        } 
        return con;
    }
}
