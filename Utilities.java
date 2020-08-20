import java.util.*;  
import java.io.IOException;  
import java.util.Scanner;


public class Utilities {

    public String first_name, flight_name, source, destination;
    public String last_name, seatNo;
    public int flight_id, age, capacity,minutes; 
    public Flight flight;
    public LinkedList<Flight> all_flights = new LinkedList<Flight>();
    public PriorityQueue<FlightToLand> flights_to_land = new PriorityQueue<FlightToLand>(20, new FlightPriorityComparator()); 


    void addDummyFlights() throws IOException{
        Flight flight1 = new Flight(1, "FLIGHT1", "Mumbai", "Delhi", 300);
        Flight flight2 = new Flight(2, "FLIGHT2", "Mumbai", "Banglore", 200);
        Flight flight3 = new Flight(3, "FLIGHT3", "Mumbai", "Nagpur", 150);
        Flight flight4 = new Flight(4, "FLIGHT4", "Jaipur", "Mumbai", 375);
        Flight flight5 = new Flight(5, "FLIGHT5", "Pondicherry", "Kolkata", 400);
        Flight flight6 = new Flight(6, "FLIGHT6", "Manglore", "Dhanbad", 120);
        Flight flight7 = new Flight(7, "FLIGHT7", "Calicut", "Mumbai", 160);
        Flight flight8 = new Flight(8, "FLIGHT8", "Delhi", "Jamshedpur", 200);
        Flight flight9 = new Flight(9, "FLIGHT9", "Banglore", "Kochi", 250);
        Flight flight10 = new Flight(10, "FLIGHT10", "Pune", "Ahemdabad", 300);
        all_flights.add(flight1);
        all_flights.add(flight2);
        all_flights.add(flight3);
        all_flights.add(flight4);
        all_flights.add(flight5);
        all_flights.add(flight6);
        all_flights.add(flight7);
        all_flights.add(flight8);
        all_flights.add(flight9);
        all_flights.add(flight10);
    }

    void addFlight() throws IOException{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Flight ID");
        flight_id = s.nextInt();
        System.out.println("Enter Flight Name");
        flight_name = s.next();
        System.out.println("Enter Flight Source");
        source = s.next();
        System.out.println("Enter Flight Destination");
        destination = s.next();
        System.out.println("Enter Flight Capacity");
        capacity = s.nextInt();
        Flight new_flight = new Flight(flight_id, flight_name, source, destination, capacity);
        System.out.println("Flight Added Successfully.");
        all_flights.add(new_flight);
    }

    void searchFlight() throws IOException{
        int c;
        Scanner s = new Scanner(System.in);
        System.out.println("Search Flight by :");
        System.out.println("1. Source");
        System.out.println("2. Destination");
        c = s.nextInt();
        if(c == 1) {
            System.out.println("Enter Source : ");
            this.source = s.next();
            for(Flight cFlight : all_flights) {
                if(cFlight.source.equals(this.source)) System.out.println("ID : " + cFlight.flight_id + "      "+ "Name : " + cFlight.name +"      "+  "Source : " + cFlight.source + "      "+ "Destination : " + cFlight.destination +"      "+  "Capacity : " + cFlight.capacity + "      "+ "Seats Booked" + cFlight.noSeatsBooked + "      ") ;   
            }
        }
        else {
            System.out.println("Enter Destination : ");
            destination = s.next();
            for(Flight cFlight : all_flights) {
                if(cFlight.destination.equals( destination)) System.out.println("ID : " + cFlight.flight_id + "      "+ "Name : " + cFlight.name +"      "+  "Source : " + cFlight.source + "      "+ "Destination : " + cFlight.destination +"      "+  "Capacity : " + cFlight.capacity + "      "+ "Seats Booked" + cFlight.noSeatsBooked + "      ");
            }

        }
    }

    void addDummyFlightsToLand() throws IOException {
        FlightToLand flight1 = new FlightToLand(11, "FLIGHT11", "Mumbai", "Delhi", 300, 100);
        FlightToLand flight2 = new FlightToLand(12, "FLIGHT12", "Mumbai", "Banglore", 200, 240);
        FlightToLand flight3 = new FlightToLand(13, "FLIGHT13", "Mumbai", "Nagpur", 150, 210);
        FlightToLand flight4 = new FlightToLand(14, "FLIGHT14", "Jaipur", "Mumbai", 375, 180);
        FlightToLand flight5 = new FlightToLand(15, "FLIGHT15", "Pondicherry", "Kolkata", 400, 200);
        FlightToLand flight6 = new FlightToLand(16, "FLIGHT16", "Manglore", "Dhanbad", 120, 110);
        FlightToLand flight7 = new FlightToLand(17, "FLIGHT17", "Calicut", "Mumbai", 160, 220);
        FlightToLand flight8 = new FlightToLand(18, "FLIGHT18", "Delhi", "Jamshedpur", 200, 230);
        FlightToLand flight9 = new FlightToLand(19, "FLIGHT19", "Banglore", "Kochi", 250, 140);
        FlightToLand flight10 = new FlightToLand(20, "FLIGHT20", "Pune", "Ahemdabad", 300, 120);
        flights_to_land.add(flight1);
        flights_to_land.add(flight2);
        flights_to_land.add(flight3);
        flights_to_land.add(flight4);
        flights_to_land.add(flight5);
        flights_to_land.add(flight6);
        flights_to_land.add(flight7);
        flights_to_land.add(flight8);
        flights_to_land.add(flight9);
        flights_to_land.add(flight10);
    }

    void addFlightToLand() throws IOException{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Flight ID");
        flight_id = s.nextInt();
        System.out.println("Enter Flight Name");
        flight_name = s.next();
        System.out.println("Enter Flight Source");
        source = s.next();
        System.out.println("Enter Flight Destination");
        destination = s.next();
        System.out.println("Enter Flight Capacity");
        capacity = s.nextInt();
        System.out.println("Enter Expected Time to land in minutes");
        minutes = s.nextInt();
        FlightToLand new_flight = new FlightToLand(flight_id, flight_name, source, destination, capacity, minutes);
        System.out.println("Flight Added Successfully.");
        flights_to_land.add(new_flight);
    }

    void showAllFlights() {
        for(Flight cFlight : all_flights) {
            System.out.println("ID : " + cFlight.flight_id + "      "+ "Name : " + cFlight.name +"      "+  "Source : " + cFlight.source + "      "+ "Destination : " + cFlight.destination +"      "+  "Capacity : " + cFlight.capacity + "      "+ "Seats Booked" + cFlight.noSeatsBooked + "      ");
        } 
    }


    public Flight getFlight(int flight_id) {
        Flight error = new Flight(0,"Error", "Error", "Error", 0);
        for(Flight cFlight : all_flights) {
            if(cFlight.flight_id == flight_id)
            {
                return cFlight;
            }
        }
        return error;
    }


    void bookTicket() throws IOException{
        Scanner s = new Scanner(System.in);
        showAllFlights();
        System.out.println("Enter Flight ID to Book Tickets for : ");
        flight_id = s.nextInt();
        flight = getFlight(flight_id);
        System.out.println("Enter Your First Name ");
        first_name = s.next();
        System.out.println("Enter Your Last Name : ");
        last_name = s.next();
        System.out.println("Enter Your Age : ");
        age = s.nextInt();
        Passenger new_passenger = new Passenger(age, first_name, last_name);
        flight.showFlightStructure();
        System.out.println("Select Seat No : ");
        seatNo = s.next();
        Ticket new_ticket = new Ticket(0, new_passenger, seatNo, flight);
        flight.bookTicket(new_ticket, new_passenger);
        System.out.println("Ticket Booked! Happy Journey.");
        flight.showBookedSeats();
    }


    void showBookedTicketsForFlight() throws IOException{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Flight ID to View : ");
        flight_id = s.nextInt();
        flight = getFlight(flight_id);
        flight.showBookedSeats();
    }


    void showFlightStructure() throws IOException{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Flight ID to View : ");
        flight_id = s.nextInt();
        flight = getFlight(flight_id);
        flight.showFlightStructure();
    }


    void showFlightsToLand() {
        System.out.println("Flights to Land served in their priority order");
        while (!this.flights_to_land.isEmpty()) { 
        System.out.println(this.flights_to_land.poll().getFlight()); 
        }  
    }
}

class FlightPriorityComparator implements Comparator<FlightToLand> { 
    public int compare(FlightToLand f1, FlightToLand f2) { 
        if (f1.expectedTimetoLand > f2.expectedTimetoLand) 
            return 1; 
        else if (f1.expectedTimetoLand < f2.expectedTimetoLand) 
            return -1; 
        return 0; 
    } 
} 