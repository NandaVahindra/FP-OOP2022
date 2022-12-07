/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatresystem;

/**
 *
 * @author Nandavahindra
 */
public class action extends Genre{
    action(String cinema)
    {
        if(cinema == "Regular")
            setTicketPrice(50000);
        else if(cinema == "Exclusive")
            setTicketPrice(120000);
    }
    
    @Override
    public String printGenre()
    {
        return "Action";
    }
}
