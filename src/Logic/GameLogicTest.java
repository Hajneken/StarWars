package Logic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Hynek Zemanec
 * @version 1.0
 * @project StarWars
 * @created June 2018
 * <p>
 * Testing class GameLogicTest is used to test the functionality of the class GameLogic
 */
public class GameLogicTest {

    private GameLogic game = new GameLogic();

    /**
     * Method simulates players consecutive inputs.
     * Inputs represent the shortest path to the victory.
     * Method tests if it is possible to end the game and win.
     */
    @Test
    public void processInput() {
        game.processInput("1");
        game.processInput("3");
        game.processInput("5");
        game.processInput("4");
        game.processInput("1");
        game.processInput("2");
        game.processInput("4");
        game.processInput("2");
        game.processInput("3");
        game.processInput("3");
        game.processInput("3");
        game.processInput("5");
        game.processInput("4");
        game.processInput("2");
        game.processInput("3");
        game.processInput("3");
        assertTrue(game.isOver());
    }
}