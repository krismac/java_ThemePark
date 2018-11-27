package Attractions;

import Parents.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void before(){
        rollerCoaster = new Rollercoaster("BigRoller", 7);
        visitor1 = new Visitor(13, 146, 10);
        visitor2 = new Visitor(11, 146, 10);
        visitor3 = new Visitor(13, 142, 10);
    }

    @Test
    public void hasName(){
        assertEquals("BigRoller", rollerCoaster.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(7, rollerCoaster.getRating());
    }

    @Test
    public void isAllowed(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));

    }

    @Test
    public void isNotATall(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));

    }

    @Test
    public void isNotOld(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));

    }
}
