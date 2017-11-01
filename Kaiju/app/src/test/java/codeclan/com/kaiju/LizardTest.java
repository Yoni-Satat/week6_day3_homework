package codeclan.com.kaiju;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 01/11/2017.
 */

public class LizardTest {

    Lizard lizard;
    @Before
    public void before(){
        lizard = new Lizard("Mewooo", 70, 120);
    }

    @Test
    public void canRoar(){
        assertEquals("ROAR!!!", lizard.roar());
    }

    @Test
    public void canGetName(){
        assertEquals("Mewooo", lizard.getName());
    }
}
