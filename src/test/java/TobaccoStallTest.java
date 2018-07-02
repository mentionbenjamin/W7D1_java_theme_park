import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp(){
        tobaccoStall = new TobaccoStall("smokey quarters");
    }

    @Test
    public void hasType(){
        assertEquals("smokey quarters", tobaccoStall.getType());
    }

}
