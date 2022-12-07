/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatresystem;

/**
 *
 * @author Nandavahindra
 */
public class comedy extends Genre{
    comedy(String cinema)
    {
        if(cinema == "Regular")
            setTicketPrice(35000);
        else if(cinema == "Exclusive")
            setTicketPrice(105000);
    }
    
    @Override
    public String printGenre()
    {
        return "Comedy";
    }
}
