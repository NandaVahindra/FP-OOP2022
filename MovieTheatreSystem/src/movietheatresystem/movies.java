/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatresystem;

import java.util.Date;

/**
 *
 * @author Nandavahindra
 */
public class movies {
    private String title;
    private String genre;
    private String image;
    private Date date;
            
     public movies (String title, String genre, String image, Date date)
     {
         this.title = title;
         this.genre = genre;
         this.image = image;
         this.date = date;
     }
}
