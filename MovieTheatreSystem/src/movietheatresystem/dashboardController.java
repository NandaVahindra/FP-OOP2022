/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatresystem;

import java.io.IOException;
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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Nandavahindra
 */
public class dashboardController implements Initializable{

    @FXML
    private Button nav_bookbtn;
    @FXML
    private Button nav_nowShowingbtn;
    @FXML
    private Button sign_out;
    @FXML
    private Label nav_username;
    @FXML
    private AnchorPane page_booking;
    @FXML
    private DatePicker book_date;
    @FXML
    private ChoiceBox<?> book_movie;
    @FXML
    private Spinner<?> book_quantity;
    @FXML
    private Button book_buy;
    @FXML
    private Button book_clear;
    @FXML
    private Label detmov_title;
    @FXML
    private Label detmov_genre;
    @FXML
    private Label detmov_date;
    @FXML
    private Label detmov_ticketprice;
    @FXML
    private Label detmov_total;
    @FXML
    private ImageView detmov_img;
    @FXML
    private AnchorPane page_select;
    @FXML
    private Button select_regular;
    @FXML
    private Button select_exclusive;
    @FXML
    private Button close_btn;
    @FXML
    private Button minimize;
    @FXML
    private AnchorPane top_form;
    @FXML
    private AnchorPane nowshowing;
    @FXML
    private AnchorPane dashboardForm;

    @FXML
    public void close(){
    System.exit(0);
}
    @FXML
    public void minimizebtn(){
        Stage stage = (Stage)top_form.getScene().getWindow();
        stage.setIconified(true);
    }
    
    public void displayUsername()
    {
        nav_username.setText(getData.username);
    }
    
    @FXML
    public void navigationSelect(ActionEvent event)
    {
        if(event.getSource() == nav_bookbtn)
        {
            nowshowing.setVisible(false);
            page_select.setVisible(true);
            page_booking.setVisible(false);
            
            nav_bookbtn.setStyle("-fx-background-color:#6dd1b8");
            nav_nowShowingbtn.setStyle("-fx-background-color: TRANSPARENT");
        }
        else if(event.getSource() == nav_nowShowingbtn)
        {
            nowshowing.setVisible(true);
            page_select.setVisible(false);
            page_booking.setVisible(false);
            nav_bookbtn.setStyle("-fx-background-color:TRANSPARENT");
            nav_nowShowingbtn.setStyle("-fx-background-color:#6dd1b8");
        }
    }
    
    private double x = 0;
    private double y = 0;
    
    @FXML
    public void theatreSelect(ActionEvent event)
    {
        if(event.getSource() == select_regular)
        {
            page_select.setVisible(false);
            page_booking.setVisible(true);
            
        }
        else if(event.getSource() == select_exclusive)
        {
            page_select.setVisible(false);
            page_booking.setVisible(true);
        }
    }
    
    public void signOut()
    {
        dashboardForm.getScene().getWindow().hide();
        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            
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
            
            
        } catch (IOException ex) {
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        displayUsername();
    }
    
}
