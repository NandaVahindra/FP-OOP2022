/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatresystem;

/**
 *
 * @author Nandavahindra
 */
public class horror extends Genre{
    horror(String cinema)
    {
        if(cinema == "Regular")
            setTicketPrice(65000);
        else if(cinema == "Exclusive")
            setTicketPrice(130000);
    }
    
    @Override
    public String printGenre()
    {
        return "Horror";
    }
}
