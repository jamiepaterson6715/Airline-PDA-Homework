import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {


//    Class calling intance of object
    private Plane plane;

    @Before

    public void setUp() {
        plane = new Plane(PlaneType.BOING737);

    }
    @Test
    public void canFindCapacity() {
        plane = new Plane(PlaneType.BOING737);
        assertEquals(2, plane.findCapacity());
    }

    @Test
    public void canFindTotalWeight() {
        plane = new Plane(PlaneType.BOING737);
        assertEquals(100, plane.findWeight());
    }

}
