import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void setUp(){
        dodgems = new Dodgems("adrenaline");
    }

    @Test
    public void hasType(){
        assertEquals("adrenaline", dodgems.getType());
    }

}
