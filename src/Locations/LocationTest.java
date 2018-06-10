package Locations;

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
 * Testing class LocationTest is used to test the functionality of the class Location
 */
public class LocationTest {
    private Location location = new Location("Test","A location that is being tested", "Test Actions","Test Hint");
    private Location secondLocation = new Location("Second Test","A second location that is being tested", "Test Actions","Test Hint");
    private Location thirdLocation = new Location("Third Test","A Third location that is being tested", "Test Actions","Test Hint");

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    /**
     * Tests if exits are being set and are added to the List
     */
    @Test
    public void locationSizeTest() {
        location.setExit(secondLocation);
        assertEquals(1,location.getExits().size());
        location.setExit(thirdLocation);
        assertEquals(2,location.getExits().size());
    }

    /**
     * Tests if action of a location is changed after using the setter of action
     */
    @Test
    public void setActionTest() {
        location.setActions("New Action");
        assertEquals("New Action",location.getActions());
    }

    /**
     * Tests the implementation of equals method
     */
    @Test
    public void equalsTest() {
        assertTrue(location.getName().equals("Test"));
        assertTrue(secondLocation.getName().equals("Second Test"));
        assertTrue(thirdLocation.getName().equals("Third Test"));
    }

    /**
     * Test the implementation of hashCode method
     */
    @Test
    public void hashCodeTest() {
        assertTrue( location.hashCode() != secondLocation.hashCode());
        assertTrue( location.hashCode() == location.hashCode());
    }

}