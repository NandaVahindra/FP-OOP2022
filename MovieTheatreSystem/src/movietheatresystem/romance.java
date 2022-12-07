/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatresystem;

/**
 *
 * @author Nandavahindra
 */
public class romance extends Genre{
    romance(String cinema)
    {
        if(cinema == "Regular")
            setTicketPrice(70000);
        else if(cinema == "Exclusive")
            setTicketPrice(150000);
    }
    
    @Override
    public String printGenre()
    {
        return "Romance";
    }
}
