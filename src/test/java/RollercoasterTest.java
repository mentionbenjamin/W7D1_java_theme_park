import Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void setUp(){
        rollercoaster = new Rollercoaster("adrenaline");
    }

    @Test
    public void hasType(){
        assertEquals("adrenaline", rollercoaster.getType());
    }

}
