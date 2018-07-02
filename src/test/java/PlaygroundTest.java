import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void setUp(){
        playground = new Playground("active fun");
    }

    @Test
    public void hasType(){
        assertEquals("active fun", playground.getType());
    }

}
