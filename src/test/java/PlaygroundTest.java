import Attractions.Playground;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import ThemePark.Visitor;



public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;

    @Before
    public void setUp(){
        playground = new Playground("active fun");
        visitor1 = new Visitor(12, 115, 10);
    }

    @Test
    public void hasType(){
        assertEquals("active fun", playground.getType());
    }

    @Test
    public void visitorUnder15(){
        assertEquals(true, playground.allowEntry(visitor1));
    }


}
