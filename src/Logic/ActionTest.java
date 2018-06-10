package Logic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Hynek Zemanec
 * @project StarWars
 * @version 1.0
 * @created June 2018
 * <p>
 * Testing class ActionTest is used to test the functionality of the class Action
 */
public class ActionTest {

    Action action = new Action(1,"Description Test",1,3,3,1);
    Action action2 = new Action(2,"Description Test",2,5,5,1);
    Action action3 = new Action(3,"Description Test",3,6,1,2);

    @Test
    public void setHpVal() {
        action.setHpVal(1);
        assertEquals(1,action.getHpVal());
    }

    /**
     * Tests the functionality of setters and getters of reactions
     */
    @Test
    public void reactionTest() {
        assertEquals(1,action.getReaction());
        action.setReaction(2);
        assertEquals(2,action.getReaction());
        assertNotEquals(4,action3.getReaction());
    }

    /**
     * Tests the functionality of fuel and HP modifiers
     */
    @Test
    public void fuelHpModifier() {
        assertEquals(1,action3.getFuelVal());
        action3.setDescription("Something");
        assertNotEquals(2,action3.getFuelVal());
        action3.setFuelVal(3);
        assertEquals(3,action3.getFuelVal());
        action3.setHpVal(20);
        assertEquals(20,action3.getHpVal());
    }
    /**
     * Tests the functionality of location setters and getters
     */
    @Test
    public void locationModifier() {
        assertEquals(1, action2.getLocation());
        action2.setLocation(4);
        assertNotEquals(1, action2.getLocation());
        assertEquals(4, action2.getLocation());
        action2.setReaction(2);
        assertNotEquals(2,action2.getLocation());
    }

}