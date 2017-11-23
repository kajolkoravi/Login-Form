package javafxapplication2;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author pc1
 */
public class Form1Controller implements Initializable {

    @FXML
    private Label signupbutton;

    @FXML
    private TextField usernamelabel;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private Button loginbutton;

    @FXML
    private Button enrollnowbutton;

    @FXML
    private Label closelabel;

    @FXML
    private void Formhandler(ActionEvent event) throws ClassNotFoundException 
    {
       try{
           
        UserFormDao.insertForm(new UserForm(usernamelabel.getText(),passwordfield.getText()));
        System.out.println("record inserted");
       }    
       catch(SQLException sql){
           System.out.println(sql);
       }
       }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //To change body of generated methods, choose Tools | Templates.
    }
    }


