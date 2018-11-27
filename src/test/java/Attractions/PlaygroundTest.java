package Attractions;

import Parents.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
public void before(){
        playground = new Playground("GroundPlay", 5);
        visitor1 = new Visitor(16, 146, 10);
        visitor2 = new Visitor(14, 146, 10);
    }

    @Test
    public void hasName(){
        assertEquals("GroundPlay", playground.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(5, playground.getRating());
    }

    @Test
    public void isAllowed(){
        assertEquals(true, playground.isAllowed(visitor2));

    }

    @Test
    public void isTooOldToBeAllowed(){
        assertEquals(false, playground.isAllowed(visitor1));
    }

}
