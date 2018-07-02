import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void setUp(){
        candyFlossStall = new CandyFlossStall("sugary goodness");
    }

    @Test
    public void hasType(){
        assertEquals("sugary goodness", candyFlossStall.getType());
    }

}
