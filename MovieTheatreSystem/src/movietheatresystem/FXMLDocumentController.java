/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package movietheatresystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Nandavahindra
 */
public class FXMLDocumentController implements Initializable {
    
    String nama;
    
    @FXML
    private AnchorPane mainform;

    @FXML
    private Button sign_close;

    @FXML
    private AnchorPane sign_form;

    @FXML
    private Hyperlink sign_hyperlink;

    @FXML
    private Button sign_login;

    @FXML
    private TextField sign_username;
    
    @FXML
    private AnchorPane popdialog;
    
    @FXML
    private Button pop_close;
   
    @FXML
    public void signIn_closes()
    {
        System.exit(0);
    }
    
    public void popupDialog(ActionEvent event)
    {
        if(event.getSource() == sign_hyperlink)
        {
            popdialog.setVisible(true);
        }
        else if (event.getSource() == pop_close)
        {
            popdialog.setVisible(false);
        }
    }
    
    public void login()
    {
        try{
            nama = sign_username.getText();
            Alert alert;
            if(sign_username.getText().isEmpty())
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please input your name!");
                alert.showAndWait();
                
            }
            else
            {
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Welcome " + nama + " ! ^ ^");
                alert.showAndWait();
                
                sign_login.getScene().getWindow().hide();
                
                Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
                
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                
                stage.setScene(scene);
                stage.show();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    
    
}
