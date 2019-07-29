import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
//    calling class then call an instance object of that class
    Passenger passenger;

    @Before

    public void setUp() {

        passenger = new Passenger("Jamie", 1);
    }

    @Test
    public void canFindPassengerName() {
        assertEquals("Jamie", passenger.findPassengerName());
    }

    @Test
    public void canFindBags() {
        assertEquals(1, passenger.findBags());
    }


}


