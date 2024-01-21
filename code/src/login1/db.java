package login1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author genej
 */
public class db {
    public static Connection mycon() {
    
        Connection con = null;
    
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login", "root", "");
    
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Use printStackTrace() to print the exception details
        }
    
        return con;
    }
}
