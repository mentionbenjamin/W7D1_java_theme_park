import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void setUp(){
        candyFlossStall = new CandyFlossStall("Sugar Daddy", "Mr. Whip", 2);
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Mr. Whip", candyFlossStall.getOwnerName());
    }

}