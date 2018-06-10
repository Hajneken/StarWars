package Ships;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Hynek Zemanec
 * @project StarWars
 * @version 1.0
 * @created June 2018
 * <p>
 * Testing class PlayerTest is used to test the functionality of the class Player
 */
public class PlayerTest {

    Player player1 = new Player("TestName", "TestShip", 20, 15);

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Tests that the name of the players ship can be changed without modification of Fuel and HP
     */
    @Test
    public void shipModificationTest() {
        player1.setShip("Different");
        assertEquals("Different", player1.getShip());
        assertEquals(20, player1.getHP());
        assertEquals(15,player1.getFuel());
    }

    /**
     * Tests changing values of player HP and Values
     * Depending on the use of method values change differently in the prescribed manner
     */
    @Test
    public void method() {
        assertEquals(15,player1.getFuel());
        player1.setFuel(10);
        player1.changeFuel(5);
        assertEquals(15,player1.getFuel());
        player1.changeFuel(-2);
        assertEquals(13,player1.getFuel());
        assertEquals(20,player1.getHP());
        player1.changeHP(-10);
        assertEquals(10,player1.getHP());
    }

}