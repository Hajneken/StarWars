package Ships;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Hynek Zemanec
 * @project StarWars
 * @version 1.0
 * @created June 2018
 * <p>
 * Testing class TieFightersTest is used to test the functionality of the class TieFighters
 */

public class TieFightersTest {
    TieFighters ts = new TieFighters();

    /**
     * Tests the destroyed property before and after setting it to true
     * Also tests status message passed to the text UI.
     */
    @Test
    public void getDestroyed() {
        assertFalse(ts.getDestroyed());
        assertEquals(5,ts.getHP());
        assertEquals("Actively engaged in the fight", ts.statusInfo());
        ts.setDestroyed();
        assertTrue(ts.getDestroyed());
        assertEquals(0,ts.getHP());
        assertEquals("Destroyed", ts.statusInfo());
    }

}