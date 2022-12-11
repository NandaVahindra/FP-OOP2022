/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatresystem;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
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
    private ComboBox<?> book_movie;
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
    private TextField book_intQuantity;
    @FXML
    private ComboBox book_movies;
    @FXML
    private FontAwesomeIcon qtycheck_btn;
    @FXML
    private Spinner<?> book_quantity;
    @FXML
    private Button info_close;
    @FXML
    private AnchorPane information_box;
    @FXML
    private Hyperlink hype_close;
    @FXML
    private Label re_mov;
    @FXML
    private Label re_date;
    @FXML
    private Label re_price;
    @FXML
    private Label re_tot;
    @FXML
    private Label re_code;
    @FXML
    private Label re_user;
    @FXML
    private AnchorPane receipt;
    @FXML
    private Button re_back;
    @FXML
    private AnchorPane Page_receipt;
    @FXML
    private AnchorPane fsg_preview;
    @FXML
    private Button fsg_close;
    @FXML
    private AnchorPane mt_preview;
    @FXML
    private Button mt_close;
    @FXML
    private AnchorPane spd_preview;
    @FXML
    private Button spd_close;
    @FXML
    private AnchorPane yn_preview;
    @FXML
    private Button yn_close;
    @FXML
    private ImageView ns_fsg;
    @FXML
    private ImageView ns_mt;
    @FXML
    private ImageView ns_spd;
    @FXML
    private ImageView ns_yn;
    @FXML
    private ImageView img_fsg;
    @FXML
    private ImageView img_mt;
    @FXML
    private ImageView img_spd;
    @FXML
    private ImageView img_yn;
    @FXML
    private AnchorPane fsg;
    @FXML
    private AnchorPane mt;
    @FXML
    private AnchorPane spd;
    @FXML
    private AnchorPane yn;
    
    @FXML
    public void close_info()
    {
        information_box.setVisible(false);
    }
    
    @FXML
    public void hyp_info()
    {
        information_box.setVisible(true);
    }

    @FXML
    public void close(){
    System.exit(0);
}
    @FXML
    public void minimizebtn(){
        Stage stage = (Stage)top_form.getScene().getWindow();
        stage.setIconified(true);
    }
    
    HashMap<String,String> movieGenre = new HashMap();
    HashMap<String,Image> movieImage = new HashMap();
    Alert alert;
    
    public void storemovie()
    {
        movieGenre.put("The Friendship Game","Horror");
        movieGenre.put("Me Time","Comedy");
        movieGenre.put("Your Name","Romance");
        movieGenre.put("Spider-Man: No Way Home","Action");
    }
    public void storeimg()
    {
        Image hrr = new Image("/image/Horror.jpg");
        Image cdy = new Image("/image/Comedy.jpg");
        Image rmc = new Image("/image/Romance.jpg");
        Image acn = new Image("/image/Action.jpg");
        movieImage.put("The Friendship Game",hrr);
        movieImage.put("Me Time",cdy);
        movieImage.put("Your Name",rmc);
        movieImage.put("Spider-Man: No Way Home",acn);
        ns_fsg.setImage(hrr);
        ns_mt.setImage(cdy);
        ns_spd.setImage(acn);
        ns_yn.setImage(rmc);
        img_fsg.setImage(hrr);
        img_mt.setImage(cdy);
        img_spd.setImage(acn);
        img_yn.setImage(rmc);
    }

    public void displayUsername()
    {
        nav_username.setText(getData.getUsername());
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
    private String cinemaClass;
    @FXML
    public void theatreSelect(ActionEvent event)
    {
        if(event.getSource() == select_regular)
        {
            page_select.setVisible(false);
            page_booking.setVisible(true);
            cinemaClass = "Regular";
            clear();
            
        }
        else if(event.getSource() == select_exclusive)
        {
            page_select.setVisible(false);
            page_booking.setVisible(true);
            cinemaClass = "Exclusive";
            clear();
        }
    }
    
    @FXML
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
    
    Ticket ti = new Ticket(); 
    
    private String[] movieList = {"The Friendship Game", "Me Time", "Spider-Man: No Way Home", "Your Name"}; //save to arraylist
    @FXML
    public void comboBox(ActionEvent event)
    {
        String s = book_movies.getSelectionModel().getSelectedItem().toString();
        getData.setMovieName(s);
        detmov_title.setText(s);
        detmov_genre.setText(movieGenre.get(s));
        detmov_img.setImage(movieImage.get(s));
        ti.Ticket(movieGenre.get(s),cinemaClass);
        detmov_ticketprice.setText("Rp " + Integer.toString(ti.getTicketPrice()));
        
        
    }
    
    @FXML
    public void setDate(ActionEvent event)
    {
        getData.setDate(book_date.getValue());
        detmov_date.setText(getData.getDate().toString());
    }
    
    @FXML
    public void quantityCheck(ActionEvent event)
    {
        try{
            getData.setQuantity(Integer.parseInt(book_intQuantity.getText()));
        }
        catch(NumberFormatException e){
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please enter the correct number!");
            alert.showAndWait();
            return;
        }
        
        if(book_intQuantity.getText().isEmpty() || book_intQuantity.getText().equals("0"))
        {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please enter the correct number!");
            alert.showAndWait();
            return;
        }
        else if(detmov_ticketprice.getText().equals("Ticket Price"))
        {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please select a movie first!");
            alert.showAndWait();
            return;
        }
        else if(cinemaClass.equals("Regular") && getData.getQuantity() > 60)
        {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Exceed the maximum amount!");
            alert.showAndWait();
            return;
        }
        else if(cinemaClass.equals("Exclusive") && getData.getQuantity() > 30)
        {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Exceed the maximum amount!");
            alert.showAndWait();
            return;
        }
            detmov_total.setText("Rp " + Integer.toString(getData.getQuantity()*ti.getTicketPrice()));
         
    }
    
    @FXML
    public void clear()
    {
        detmov_title.setText("Movie Title");
        detmov_genre.setText("Genre");
        detmov_img.setImage(null);
        detmov_ticketprice.setText("Ticket Price");
        detmov_date.setText("Date");
        book_date.getEditor().clear();
        book_intQuantity.setText("");
        detmov_total.setText("Total Price");
        
    }
    
    @FXML
    public void buy()
    {
        if(detmov_title.getText().equals("Movie Title") || detmov_genre.getText().equals("Genre") || 
           detmov_date.getText().equals("Date") || detmov_ticketprice.getText().equals("Ticket Price") || 
           detmov_total.getText().equals("Total Price"))
        {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Make sure data on the right side in correct!");
            alert.showAndWait();
            return;
        }
        else
        {
            alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("Proceed your payment?");
            if (alert.showAndWait().get() != ButtonType.OK)
            return;
        }
        alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setContentText("Payment Success");
            alert.showAndWait();
        
        Page_receipt.setVisible(true);
        page_booking.setVisible(false);
        int tic = 100;
        Random rd = new Random();
        int int_random = rd.nextInt(tic);
        
        re_user.setText(getData.getUsername());
        re_mov.setText(getData.getMovieName());
        re_date.setText(getData.getDate().toString());
        re_price.setText("Rp " + Integer.toString(ti.getTicketPrice()));
        re_tot.setText("Rp " + Integer.toString(ti.getTicketPrice() * getData.getQuantity()));
        re_code.setText("2210129374" + int_random);
        
    }
    
    @FXML
    public void back_dash()
    {
        Page_receipt.setVisible(false);
        page_select.setVisible(true);
        
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> list = FXCollections.observableArrayList(movieList);
        book_movies.setItems(list);
        displayUsername();
        storemovie();
        storeimg();
        
    }

    @FXML
    private void now_showingSelect(MouseEvent event) {
    }
    
}
