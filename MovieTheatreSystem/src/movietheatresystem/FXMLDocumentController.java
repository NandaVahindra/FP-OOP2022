/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package movietheatresystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Nandavahindra
 */
public class FXMLDocumentController implements Initializable {
    File f = new File("Logins");
    String Username,Password,Email;
    int ln;
    
    
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
    
    private AnchorPane popdialog;
    
    private Button pop_close;
    @FXML
    private PasswordField sign_pass;
    @FXML
    private Button sign_close1;
    @FXML
    private PasswordField up_password;
    @FXML
    private TextField up_username;
    @FXML
    private TextField up_email;
    @FXML
    private Hyperlink up_hyperlink;
    @FXML
    private Button up_create;
    @FXML
    private AnchorPane signup;
   
    @FXML
    public void signIn_closes()
    {
        System.exit(0);
    }
    
    public void createFolder(){
        if(!f.exists())
        {
            f.mkdirs();
        }
    }
    
    public void readFile()
    {
        try {
            FileReader fr = new FileReader(f+"\\Accounts.txt");
            //System.out.println("file exists!");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(f+"\\Accounts.txt");
                //System.out.println("file created");
            } catch (IOException ex1) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }    
    }
    
    public void addData(String usr, String pswd, String mail)
    {
        Alert alert;
        //check if sign up data field is empty
        if(usr.isEmpty() || pswd.isEmpty() || mail.isEmpty())
        {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please fill the blank spaces!");
            alert.showAndWait();
            return;
        }
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\Accounts.txt", "rw");
            int eml=2;
            for(int i=0;i<ln;i++)
            {
                //checking if username already taken or not
                if(i%4 == 0)
                {
                    String forUser = raf.readLine().substring(9);
                    i++;
                    if(usr.equals(forUser))
                    {
                        alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error Message");
                        alert.setHeaderText(null);
                        alert.setContentText("Username already taken!");
                        alert.showAndWait();
                        return;
                    }
                }
                //checking if email already in use
                else if(i==eml)
                {
                    String forEmail = raf.readLine().substring(6);
                    i++;
                    eml+=4;
                    if(mail.equals(forEmail))
                    {
                        alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error Message");
                        alert.setHeaderText(null);
                        alert.setContentText("Email has been used!");
                        alert.showAndWait();
                        return;
                    }
                }
                raf.readLine();
            }
            if(ln>0){
            raf.writeBytes("\r\n");
            raf.writeBytes("\r\n");
            }
            raf.writeBytes("Username:" +usr + "\r\n");
            raf.writeBytes("Password:" +pswd + "\r\n");
            raf.writeBytes("Email:" +mail);
            
            alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setContentText("Account created successfully\nPlease sign in to continue!");
            alert.showAndWait();
            signup.setVisible(false);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private double x  = 0;
    private double y = 0;

    
    public void CheckData()
    {
        Alert alert;
        if(sign_username.getText().isEmpty() || sign_pass.getText().isEmpty())
        {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please fill the blank spaces!");
            alert.showAndWait();
            return;
        }
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\Accounts.txt", "rw");
            for(int i=0;i<ln;i+=4)
            {
            //System.out.println("count "+i);
                String forUser = raf.readLine().substring(9);
                String forPswd = raf.readLine().substring(9);
                if(sign_username.getText().equals(forUser) & sign_pass.getText().equals(forPswd))
                {
                    
                    getData.setUsername(sign_username.getText());
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Welcome " + sign_username.getText() + " ! ^ ^");
                    alert.showAndWait();

                    sign_login.getScene().getWindow().hide();

                    Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));

                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    
                    root.setOnMousePressed((MouseEvent event) ->{
                    x = stage.getX() - event.getScreenX();
                    y = stage.getY() - event.getScreenY();
                    });
         
                    root.setOnMouseDragged((MouseEvent event)->{
                    stage.setX(event.getScreenX()+x);
                    stage.setY(event.getScreenY()+y); 
                    });
                    
                    stage.initStyle(StageStyle.TRANSPARENT);

                    stage.setScene(scene);
                    stage.show();
                    break;
                }
                else if(i==(ln-3))
                {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Wrong Username/Password");
                    alert.showAndWait();
                    
                }
                for(int k=1;k<=2;k++){
                    raf.readLine();
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void countLines()
    {
        try {
            ln=0;
            RandomAccessFile raf = new RandomAccessFile(f+"\\Accounts.txt", "rw");
            for(int i=0;raf.readLine() != null;i++)
            {
                ln++;
            }
            //System.out.println("Numbers of line: " +ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @FXML
    public void singup_action()
    {
        createFolder();
        readFile();
        countLines();
        addData(up_username.getText(),up_password.getText(),up_email.getText());
    }
    
    @FXML
    public void signinpop(ActionEvent event)
    {
        if(event.getSource() == sign_hyperlink)
        {
            signup.setVisible(true);
        }
        else if (event.getSource() == up_hyperlink)
        {
            signup.setVisible(false);
        }
    }
    
    @FXML
    public void login()
    {
        createFolder();
        readFile();
        countLines();
        CheckData();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    
    
}
