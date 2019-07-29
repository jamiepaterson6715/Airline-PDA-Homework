import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Plane plane;
    private Flight flight;
    private Passenger passenger;



    @Before

    public void  setUp() {

        plane = new Plane(PlaneType.BOING737);

        flight = new Flight(
                "23",
                "LWK",
                "EDI",
                "10am Monday 29th July",
                plane);

        flightManager = new FlightManager(flight);

        passenger = new Passenger("Jamie", 2);

    }

//    BOING737(2,100);
//    luggage allowance 25 pp

    @Test
    public void canGetLuggageAllowancePP() {
        Plane plane = flight.getPlane();
        assertEquals(25, flightManager.luggageAllowance());
    }

    @Test

    public void howMuchLuggageIsBookedByAPassenger() {
        Plane plane = flight.getPlane();
        flight.bookPassenger(passenger);
        assertEquals(25, flightManager.luggageWeight());
    }
    @Test
    public void canFindRemainingWeight() {
        Plane plane = flight.getPlane();
        flight.bookPassenger(passenger);
        assertEquals(25, flightManager.remainingWeight());
    }
}
