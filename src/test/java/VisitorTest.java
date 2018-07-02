import org.junit.Before;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void setUp(){
        visitor = new Visitor(24, 178, 50);
    }

}
