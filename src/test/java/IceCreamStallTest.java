import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void setUp(){
        iceCreamStall = new IceCreamStall("brainfreeze calories");
    }

    @Test
    public void hasType(){
        assertEquals("brainfreeze calories", iceCreamStall.getType());
    }

}
