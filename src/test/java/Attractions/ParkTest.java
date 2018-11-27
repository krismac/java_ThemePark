package Attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Swings", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Swings", park.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(2, park.getRating());
    }

}
