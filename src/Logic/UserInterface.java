package Logic;

import java.util.Scanner;

/**
 * @author Hynek Zemanec
 * @project StarWars
 * @version 1.0
 * @created June 2018
 * <p>
 * Class representing the user interface displayed in the cli.
 * The class divides the game into 3 sections. The intro part, main game and end of the game.
 * It uses GameLogic class as it's back-end.
 *
 */
public class UserInterface {
    private GameLogic game;

    /**
     * Initialization of the game object where logic of the game resides
     */
    public UserInterface() {
        game = new GameLogic();
    }

    /**
     * The main method which divides the game logic into 3 parts
     * beginning, main game and the end,
     * Continuously checks if the game is not over and passes the user input to process in the game logic.
     */
    public void play() {
        playIntro();
        System.out.println(game.initUI());
//        game starts here
        while (!game.isOver()) {
            String input = readInput();
            System.out.println(game.processInput(input));
        }
        playEnd();
    }

    /**
     * Method gets all needed messages and prints it to the CLI.
     * It stops every time, requiring user to press enter.
     */
    private void playIntro() {
        System.out.println(game.greetingMessage());
        readInput();
        System.out.println(game.getIntro());
        readInput();
    }

    /**
     * The last part of the game, printing all the messages.
     */
    private void playEnd() {
        System.out.println(game.getCongratulationsText());
        readInput();
        System.out.println(game.getEpilogue());
        readInput();
        game.exitGame();
    }

    /**
     * Reads the input from the User in CLI and returns it for further processing
     *
     * @return String - Input from the user
     */
    public String readInput() {
        System.out.print("> ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
