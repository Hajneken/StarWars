package Ships;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Hynek Zemanec
 * @version 1.0
 * @project StarWars
 * @created July 2018
 * <p>
 * Testing Class for PlayerTest
 */
public class PlayerTest {

    Player player1 = new Player("TestName", "TestShip", 20, 15);

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void setShip() {
        player1.setShip("Different");
        assertEquals("Different", player1.getShip());
    }

    @Test
    public void getName() {
        assertEquals("TestName", player1.getName());
    }

    @Test
    public void getHP() {
        assertEquals(20, player1.getHP());
    }

    @Test
    public void setHP() {
    }

    @Test
    public void getFuel() {
    }

    @Test
    public void setFuel() {
    }
}