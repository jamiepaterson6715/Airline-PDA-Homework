import java.util.ArrayList;

public class Flight {

//    instance variables
    private String flightNumber;
    private String departureAirport;
    private String destinatiton;
    private String departureTime;
    private Plane plane;
    private ArrayList<Passenger> passengers;

//    constructor cmd N
    public Flight(

            String flightNumber,
            String departureAirport,
            String destinatiton,
            String departureTime,
            Plane plane)
    {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinatiton = destinatiton;
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
    }

    public int numberOfPassengers() {
       return this.passengers.size();

    }

    public void bookPassenger(Passenger passenger) {
        if (numberOfPassengers() < plane.findCapacity()) {
            this.passengers.add(passenger);
        }

    }


    public int seatsRemaining() {
        return (plane.findCapacity() - numberOfPassengers());
    }

//    function to populate a plane in flightManager
    public Plane getPlane() {
        return this.plane;
    }
}
