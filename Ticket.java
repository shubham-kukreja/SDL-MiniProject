import java.util.*;  

public class Ticket { 
    public int ticket_id;  
    public Flight flight;
    public Passenger passenger;
    public String seatNo;
    
    public Ticket(int ticket_id, Passenger passenger, String seatNo, Flight flight) {  
        this.ticket_id = ticket_id;  
        this.passenger = passenger;  
        this.seatNo = seatNo;  
        this.flight = flight;
    }  

}