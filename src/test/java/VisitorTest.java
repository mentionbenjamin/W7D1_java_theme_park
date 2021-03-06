import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void setUp(){
        visitor = new Visitor(24, 178, 50);
    }

    @Test
    public void hasAge(){
        assertEquals(24, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(178, visitor.getHeight());
    }

}
