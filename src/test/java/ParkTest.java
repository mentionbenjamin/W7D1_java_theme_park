import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setUp(){
        park = new Park("relaxation");
    }

    @Test
    public void hasType(){
        assertEquals("relaxation", park.getType());
    }

}
