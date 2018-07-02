import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp(){
        tobaccoStall = new TobaccoStall("Smokey Tokey", "James Blunt", 3);
    }

    @Test
    public void hasOwnerName() {
        assertEquals("James Blunt", tobaccoStall.getOwnerName());
    }

}
