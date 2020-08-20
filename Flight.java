import java.util.*;  
public class Flight { 
    public int flight_id;  
    public String name,source,destination;  
    public int capacity;  
    public boolean isFull;
    public int noSeatsBooked;
    public HashSet<String> bookedSeats = new HashSet<String>();
    public HashMap<String, String> all_seats = new HashMap<String, String>();
    public String[][] flight_structure = { {"A1", "A2", "A3", "A4", "A5", "A6", "A7"}, {"B1", "B2", "B3", "B4", "B5", "B6", "B7"}, {"C1", "C2", "C3", "C4", "C5", "C6", "C7"}, {"D1", "D2", "D3", "D4", "D5", "D6", "D7"}, {"E1", "E2", "E3", "E4", "E5", "E6", "E7"}, {"F1", "F2", "F3", "F4", "F5", "F6", "F7"}, {"G1", "G2", "G3", "G4", "G5", "G6", "G7"}, {"H1", "H2", "H3", "H4", "H5", "H6", "H7"}, {"I1", "I2", "I3", "I4", "I5", "I6", "I7"}, {"J1", "J2", "J3", "J4", "J5", "J6", "J7"}, {"K1", "K2", "K3", "K4", "K5", "K6", "K7"}, {"L1", "L2", "L3", "L4", "L5", "L6", "L7"}, {"M1", "M2", "M3", "M4", "M5", "M6", "M7"} };
    
    public Flight(int flight_id, String name, String source, String destination, int capacity) {  
        this.flight_id = flight_id;  
        this.name = name;  
        this.source = source;  
        this.destination = destination;  
        this.capacity = capacity;  
        this.isFull = false;
        this.noSeatsBooked = 0;
    } 

    public void showBookedSeats() {
        this.all_seats.forEach((key, value) -> {
            System.out.print("Seat No: "+ key + " -------> ");
            System.out.println("Passenger : "+ value);
            });
    }

    public void bookTicket(Ticket new_ticket, Passenger new_passenger) {
        if(this.bookedSeats.contains(new_ticket.seatNo)) return;
        this.noSeatsBooked ++;
        this.bookedSeats.add(new_ticket.seatNo);
        this.all_seats.put(new_ticket.seatNo, new_passenger.first_name + " " + new_passenger.last_name );
    }   

    public void showFlightStructure() {
        for (int j = 0; j < flight_structure.length; ++j) {
            for(int i = 0; i < flight_structure[j].length; ++i) {
                if(this.bookedSeats.contains(flight_structure[j][i]))
                    System.out.print("██ ");
                else 
                    System.out.print(flight_structure[j][i] + " ");
                if(i==1 || i==4 ) System.out.print("   ");
            }
            System.out.println("");
        }
    }

}
