package Attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before

    public void before() {
        dodgems = new Dodgems("Batman", 5);
    }


    @Test
    public void hasName(){
        assertEquals("Batman", dodgems.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(5, dodgems.getRating());
    }

}
