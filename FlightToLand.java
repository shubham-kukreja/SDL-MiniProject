public class FlightToLand extends Flight {
    public int expectedTimetoLand;
    
    public FlightToLand(int flight_id, String name, String source, String destination, int capacity, int expectedTimetoLand) {
        super(flight_id, name, source, destination, capacity);  
        this.expectedTimetoLand = expectedTimetoLand;
    } 

    public String getFlight() {
        return this.flight_id + "   " + this.name + "   " + "Expected Time To Land  "+ this.expectedTimetoLand + " mins";
    }
} 