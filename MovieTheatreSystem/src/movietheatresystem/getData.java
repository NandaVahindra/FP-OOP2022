/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatresystem;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Nandavahindra
 */
public class getData {
    private static String movieName;
    private static String username;
    private static LocalDate date;
    private static int quantity;

    /**
     * @return the username
     */
    public static String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public static void setUsername(String user) {
        username = user;
    }

    /**
     * @return the quantity
     */
    public static int getQuantity() {
        return quantity;
    }
    
    public static int getQueantity(String dsc)
    {
        return quantity + 1;
    }

    /**
     * @param aQuantity the quantity to set
     */
    public static void setQuantity(int aQuantity) {
        quantity = aQuantity;
    }

    /**
     * @return the date
     */
    public static LocalDate getDate() {
        return date;
    }

    /**
     * @param aDate the date to set
     */
    public static void setDate(LocalDate aDate) {
        date = aDate;
    }

    /**
     * @return the movieName
     */
    public static String getMovieName() {
        return movieName;
    }

    /**
     * @param aMovieName the movieName to set
     */
    public static void setMovieName(String aMovieName) {
        movieName = aMovieName;
    }

    
}
