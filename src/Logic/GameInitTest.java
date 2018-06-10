package Logic;

import Locations.Location;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Hynek Zemanec
 * @project StarWars
 * @version 1.0
 * @created June 2018
 * <p>
 * Testing class GameInitTest is used to test the functionality of the class GameInit
 */
public class GameInitTest {

    private GameInit game = new GameInit();

    /**
     * Tests that the game starts at the base
     * Then tests that the location can be changed to the first exit
     * Then tests that the previous location can be removed by comparing the size of the list of exits
     */
    @Test
    public void loacationChange() {
        assertEquals("Base",game.getNameOfCurrentLocation());
        game.setCurrentLocation(game.getCurrentLocation().getExits().getFirst());
        assertEquals("Airport",game.getNameOfCurrentLocation());
        game.removeLocationFromTheList(2);
        assertEquals(2,game.getCurrentLocation().getExits().size());
    }

    /**
     * Tests that the method getActionsOfCurrentLocation returns actions in formatted String
     * suitable for text UI.
     * Then tests, that actions change with location.
     */
    @Test
    public void actionsGetterTest() {
        assertEquals("\n  1: Millenium Falcon\n  2: X-Wing\n",game.getActionsOfCurrentLocation());
        game.setCurrentLocation(game.getCurrentLocation().getExits().getFirst());
        assertNotEquals("\n  1: Millenium Falcon\n  2: X-Wing\n",game.getActionsOfCurrentLocation());
    }

    /**
     * Tests that the action of a location can be removed.
     * Also tests that the removed action will not appear in the text UI.
     */
    @Test
    public void actionRemovalTest() {
        game.removeActionFromTheList(1);
        assertEquals(1,game.getCurrentLocation().getActionList().size());
        assertEquals("\n  1: Millenium Falcon\n",game.getActionsOfCurrentLocation());
    }
}