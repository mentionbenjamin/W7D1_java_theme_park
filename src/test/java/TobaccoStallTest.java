import Stalls.TobaccoStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp(){
        tobaccoStall = new TobaccoStall("Smokey Tokey", "James Blunt", 3);
        visitor1 = new Visitor(12, 115, 10);
        visitor2 = new Visitor(32, 180, 50);
    }

    @Test
    public void hasOwnerName() {
        assertEquals("James Blunt", tobaccoStall.getOwnerName());
    }

    @Test
    public void visitorIsOverAge18(){
        assertEquals(true, tobaccoStall.allowEntry(visitor2));
    }

    @Test
    public void visitorIsUnderAge18(){
        assertEquals(false, tobaccoStall.allowEntry(visitor1));
    }




}
