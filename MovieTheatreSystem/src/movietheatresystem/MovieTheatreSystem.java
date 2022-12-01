/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package movietheatresystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Nandavahindra
 */
public class MovieTheatreSystem extends Application {
   
    private double x ;
    private double y ;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        
        stage.initStyle(StageStyle.TRANSPARENT);
        
        stage.setScene(scene);
        stage.show();
        
         root.setOnMousePressed((MouseEvent event) ->{
            x = stage.getX() - event.getScreenX();
            y = stage.getY() - event.getScreenY();
        });
         
         root.setOnMouseDragged((MouseEvent event)->{
             stage.setX(event.getScreenX()+x);
             stage.setY(event.getScreenY()+y);
         });
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
