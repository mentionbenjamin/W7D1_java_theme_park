import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void setUp(){
        iceCreamStall = new IceCreamStall("Death Certificate", "Ice Cube", 1);
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Ice Cube", iceCreamStall.getOwnerName());
    }

}
