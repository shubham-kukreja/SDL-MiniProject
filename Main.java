import java.util.*;  
import java.io.IOException;  
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Utilities u = new Utilities();
        u.addDummyFlights();
        u.addDummyFlightsToLand();
        Scanner s = new Scanner(System.in);
        int c;
        boolean e = false;
        do{
            System.out.println(" ");
            System.out.println("Commands for Normal User.");
            System.out.println("1. Show All Flights.");
            System.out.println("2. Book Tickets for a Flight.");
            System.out.println("3. View Flight Structure of a Flight.");
            System.out.println("4. View Booked Seats for a Flight.");
            System.out.println("5. Show Flights to Land.");
            System.out.println("6. Search for a Flight.");

            System.out.println("Commands for SuperUser / Admin.");
            System.out.println("6. Add a Flight.");
            System.out.println("7. Add a Flight which is expected to land soon.");

            System.out.println("Enter Choice : ");
            c = s.nextInt();
            System.out.println(" ");

            switch(c) {

                case 1:
                u.showAllFlights();
                break;

                case 2:
                u.bookTicket();
                break;

                case 3:
                u.showFlightStructure();
                break;

                case 4:
                u.showBookedTicketsForFlight();
                break;

                case 5:
                u.showFlightsToLand();
                break;

                case 6:
                u.searchFlight();
                break;

                case 7:
                u.addFlight();
                break;

                case 8:
                u.addFlightToLand();
                break;

                default:
                System.out.println("Wrong Choice.");
                break;

                
            }
            System.out.println(" ");
        }while(!e);
    }
} 