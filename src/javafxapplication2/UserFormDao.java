/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UserFormDao {

    public static void insertForm(UserForm uform) throws ClassNotFoundException, SQLException {

        try
        {
            try (Connection con = dbConnection.getConnection()) {
                PreparedStatement ps=con.prepareStatement("insert into UserForm(username,password)values(?,?)");
                ps.setString(1, uform.getUsername());
                ps.setString(2, uform.getPassword());
                
                ps.executeQuery();
            }
        }
        catch(SQLException sql){
            System.out.println(sql);
            
        }
    }
}
