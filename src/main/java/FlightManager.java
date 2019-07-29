public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int luggageAllowance() {
        Plane plane = flight.getPlane();
        return (((plane.findWeight()/2)/2));
    }

    public int luggageWeight() {
        Plane plane = flight.getPlane();
        return luggageAllowance() * flight.numberOfPassengers();
    }

    public int remainingWeight() {
        Plane plane = flight.getPlane();
        return ((plane.findWeight() /2)  - luggageWeight());
    }
}
