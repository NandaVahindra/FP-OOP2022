/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatresystem;

/**
 *
 * @author Nandavahindra
 */
public class Ticket {
    private Genre g;
    
    public void Ticket(String genre, String cinema)
    {
        switch(genre)
        {
            case "Horror":
                g = new horror(cinema);
                break;
            case "Romance":
                g = new romance(cinema);
                break;
            case "Comedy":
                g = new comedy(cinema);
                break;
            case "Action":
                g = new action(cinema);
                break;
            default:
            {
                System.out.println("Invalid Genre, Please try again");
                System.exit(0);
            } 
        }
    }
    
    public int getTicketPrice(){
        return g.getTicketPrice();
    }
    
    public void ResetPrice()
    {
        g.setTicketPrice(0);
    }
}
