import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {


    Plane plane;
    Passenger passenger;
    Flight flight;

    @Before

    public void setUp() {

        plane = new Plane(PlaneType.BOING737);

        passenger = new Passenger("Jamie",1);

        flight = new Flight("26", "Glasgow", "Malaga", "2pm", plane);

    }

    @Test
    public void planeStartsEmpty() {
        assertEquals(0, flight.numberOfPassengers());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(passenger);
        assertEquals(1, flight.numberOfPassengers());
    }

    @Test
    public void cannotAddTooManyPassengers() {
        int pass = 0;
                while (pass < 5) {
                    flight.bookPassenger(passenger);
                    pass += 1;
                }
                assertEquals(2, flight.numberOfPassengers());
    }

    @Test

    public void canGetRemaningSeats() {
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(0,flight.seatsRemaining());
    }

}
