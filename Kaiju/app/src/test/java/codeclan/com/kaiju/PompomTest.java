package codeclan.com.kaiju;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 * Created by user on 01/11/2017.
 */

public class PompomTest {

    Pompom pompom;

    @Before
    public void before(){
        pompom = new Pompom("Yoni", 30, 50);
    }

    @Test
    public void canRoar(){
      assertEquals("ROAR!!!", pompom.roar());
    }

    @Test
    public void canGetName(){
        assertEquals("Yoni", pompom.getName());
    }
}
