/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatresystem;

/**
 *
 * @author Nandavahindra
 */
public class Genre extends abstractGenre{
    private int ticketPrice;

    /**
     * @return the ticketPrice
     */
    @Override
    public int getTicketPrice() {
        return ticketPrice;
    }

    /**
     * @param ticketPrice the ticketPrice to set
     */
    @Override
    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    
    @Override
    public String printGenre()
    {
        return "Invalid";
    }
}
