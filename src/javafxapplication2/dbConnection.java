package javafxapplication2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dbConnection {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

          Class.forName("oracle.jdbc.driver.OracleDriver");
           return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
//        try {
//            String url = "jdbc:derby://localhost:1527/sample ";
//            String user = "system";
//            String password = "";
//
//            Class.forName(user);
//            Connection conn = DriverManager.getConnection(url, user, password);
//            return conn;
//            
//            
//        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//         return null;
    }

}
