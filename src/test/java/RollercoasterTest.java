import Attractions.Rollercoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp(){
        rollercoaster = new Rollercoaster("adrenaline");
        visitor1 = new Visitor(12, 115, 10);
        visitor2 = new Visitor(32, 180, 50);
    }

    @Test
    public void hasType(){
        assertEquals("adrenaline", rollercoaster.getType());
    }

    @Test
    public void isTallEnough(){
        assertEquals(true, rollercoaster.allowEntry(visitor2));
    }
}
