package Logic;

import Locations.Location;
import Ships.DeathStar;
import Ships.Player;
import Ships.TieFighters;

import java.util.*;


/**
 * @author Hynek Zemanec
 * @version 1.0
 * @project StarWars
 * @created June 2018
 * <p>
 * The logic of the game where input from the user is being processed.
 * Additionally, user text interface template, messages are included to be returned
 * for display in the UserInterface class.
 */
public class GameLogic {
    private GameInit gameInit;
    private Player player;
    private DeathStar deathStar;
    private TieFighters tieFighters;
    private boolean gameOver = false;
    private boolean gameLost = false;
    private boolean gameWon = false;

    /**
     * Initializes all needed objects
     */
    public GameLogic() {
        player = new Player();
        gameInit = new GameInit();
        deathStar = new DeathStar();
        tieFighters = new TieFighters();
    }

    /**
     * Method which accepts String input from user and passes it to other methods.
     *
     * @param input is String given by the user
     * @return method which returns text user interface with current values of main objects
     */
    public String processInput(String input) {
        magicHappening(input);
        return initUI();
    }

    /**
     * Placeholder method returning greeting message
     *
     * @return String - greeting message at the beginning of game
     */
    public String greetingMessage() {
        return "Welcome to the > STAR WARS - The Last Battle  adventure game! <\n" +
                "               ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾\n" +
                " Are you ready for an adventure? \n PRESS ENTER to start a new game";
    }

    /**
     * Placeholder method returning intro message
     *
     * @return String - message at the beginning of game
     */
    public String getIntro() {
        return "\n\n\n\n\n\n\n\nA long time ago in the galaxy far, far away..." +
                "\n\n\n\n\n *** STAR WARS The Last Battle *** \n" +
                "    ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ \n A war is raging across the galaxy!\n| " +
                "Mighty imperial forces with it's destructive weapon,\n| the Death Star, have dominated most of the galaxy.\n"
                + "| The struggle of the Rebels will climax in the last battle of this cruel war." +
                "\n| You, the best pilot in the galaxy, are the last beacon of hope. \n| " +
                "Will you be the one to bring ballance to the force? " +
                "Your actions will decide the destiny of the galaxy. \n\n" +
                "PRESS ENTER to continue";
    }

    /**
     * Returns boolean value of gameover
     *
     * @return boolean - true or false depending on the boolean of gameOver
     */
    //    return true if game is over
    public boolean isOver() {
        return gameOver;
    }

    /**
     * Method for when user wins.
     * Sets properties gameWon and gameOver to true
     */
    public void getGameWin() {
        gameWon = true;
        gameOver = true;
    }

    /**
     * Placeholder method returning congratulations message
     * Makes some space first for better UX
     *
     * @return String - message at when the game is won
     */
    public String getCongratulationsText() {
        clearScreen();
        return "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@                                                                                             @\n" +
                "@ Congratulations! You have won and thanks to your effort the peace reigns across the Galaxy. @\n" +
                "@                                                                                             @\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" +
                "\n\nContinue by pressing Enter";
    }

    /**
     * Makes some space first for better UX
     *
     * @return String - epilogue message
     */
    // epilog
    public String getEpilogue() {
        clearScreen();
        return "Thank You for playing my game!\nI hope you had fun.\n\nHave a nice day! \n\nA Game By:\n© Hynek Zemanec\n" +
                "2018 " +
                "\n\nHit Enter to Exit";
    }

    /**
     * Template for the text User Interface which is displayed every cycle
     * Makes some space first for better UX
     * Gets all player and enemy values and combines them in a neat text User Interface
     * Dynamic part includes actions to each location
     *
     * @return String - UI template with current Values
     */
// static UI remains the same, dynamicUI are actions which change dynamically with location
    public String initUI() {
        clearScreen();
        String staticUI =
                "***********************************************************" +
                        "********************************************************\n" +
                        "| CURRENT LOCATION: " + gameInit.getNameOfCurrentLocation() + "\n" +
                        "|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾\n" +
                        "| DESCRIPTION:      " + gameInit.getDescriptionOfLocation() + "\n" +
                        "|‾‾‾‾‾‾‾‾‾‾‾‾\n" +
                        "| SHIP STATISTICS:  " + "Ship: [" + player.getShip() + "] " + "HP:[" + player.getHP() + "] " + "FUEL:[" + player.getFuel() + "] " + "\n" +
                        "|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾" +
                        "\n" +
                        "|******************|  ENEMY STATISTICS  |******************\n" +
                        "|                   ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾\n" +
                        "| Death Star :  HP:[" + deathStar.getHP() + "] " + "\n" +
                        "| Tie-fighters: HP:[ " + tieFighters.getHP() + "] " + "Status: " + tieFighters.statusInfo() + "\n" +
                        "***********************************************************" +
                        "********************************************************\n";
        String howTo = "\n Choose your next action by entering the corresponding number:\n\n";
        String dynamicUI = howTo + gameInit.getActionsOfCurrentLocation();
        return staticUI + dynamicUI;
    }

    /**
     * Prints out number of linebreaks creating the illusion of clear screen command from UNIX cli
     */
    public static void clearScreen() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    /**
     * Help method which gets actions of current location
     *
     * @return List of actions to of the current location
     */
    public List<Action> getActionListOfCurrentLocation() {
        return gameInit.getCurrentLocation().getActionList();
    }

    /**
     * Immediately exits the game
     */
    public void exitGame() {
        System.exit(0);
    }

    /**
     * Immediately exits the game and politely says bye
     * Makes some space first for better UX
     */
    private void exitGameWithGoodBye() {
        clearScreen();
        System.out.println("Good bye!");
        System.exit(0);
    }

    /**
     * Checks if the input can be parsed into string
     * If not checks if E or H matches the input
     * E - exits the game
     * H - gives hint
     * Adds some space for better UX using clearScreen method
     *
     * @param input is String given by the user
     * @return true if the input is parsable integer
     */
//    returns true if possible otherwise returns false
    private boolean inputTranslator(String input) {
        try {
            int parsed = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException formatError) {
            String formattedInput = input.trim().toUpperCase();
            if (formattedInput.equals("H")) {
                clearScreen();
                System.out.println("HINT: \n" + gameInit.getHintOfCurrentLocation());
                System.out.print("\n\nContinue by pressing ENTER");
                Scanner sc = new Scanner(System.in);
                sc.nextLine();
                return false;
            } else if (formattedInput.equals("E")) {
                exitGameWithGoodBye();
            } else if (input.isEmpty() || !input.isEmpty()) {
                clearScreen();
                doNothing();
                System.out.print("\n\nContinue by pressing ENTER");
                Scanner sc = new Scanner(System.in);
                sc.nextLine();
                return false;
            }
        }
        return true;
    }

    /**
     * part of logic where player looses
     * changes the boolean gameLost to true
     */
    private void getGameLost() {
        gameLost = true;
    }

    /**
     * parses integer from String and then iterates over list of current actions
     * over a list of actions comparing each numOfAction with parsed int
     *
     * @param input from which integer is parsed
     * @return Action - action which is equal to the parsedInt, returns null if there is no match
     */
    private Action iterateActionList(String input) {
        int parsedInt = Integer.parseInt(input);
        List<Action> listOfActions = getActionListOfCurrentLocation();
        for (Action action :
                listOfActions) {
            if (action.getNumOfCase() == parsedInt) {
                return action;
            }
        }
        return null;
    }

    /**
     * Simply prints out to the cli invalid input
     */
    private void doNothing() {
        System.out.println("Invalid input");
    }

    /**
     * Gets Exits of the current location first and changes current location
     * based on the extracted int of the location stored in action
     * Player statistics are changed afterwards accordingly in the same manner
     * <p>
     * For a special situation when tie fighters are destroyed, actions that are redundant make sense are removed
     *
     * @param action - action chosen by user
     */
    private void changeLocation(Action action) {
        LinkedList<Location> locationList = gameInit.getCurrentLocation().getExits();
        gameInit.setCurrentLocation(locationList.get(action.getLocation()));
        changeStats(action);
        if (checkTieFightersStats() && gameInit.getCurrentLocation().getName().equals("Battle") && getActionListOfCurrentLocation().size() == 5) {
            gameInit.removeActionFromTheList(3);
        }
    }

    /**
     * @return boolean - true if players HP is below 0
     */
    private boolean checkPlayersHP() {
        return player.getHP() <= 0;
    }

    /**
     * @return boolean - true if players Fuel is below 0
     */
    private boolean checkPlayersFuel() {
        return player.getFuel() <= 0;
    }

    /**
     * checks players hp and fuel value,
     * if either under 0 returns false
     *
     * @return true if one of either HP or Fuel is below 0
     */
    private boolean checkPlayerStats() {
        return checkPlayersHP() || checkPlayersFuel();
    }

    /**
     * @return boolean - true if Death Star HP is below 16
     */
    private boolean checkDeathStarStats() {
        return deathStar.getHP() <= 15;
    }

    /**
     * Sets deatStar property ready to true, enabling the Death Star for access if condition is true
     *
     * @return boolean - true checkDeathStarStats and checkTieFightersStats are true
     */
    private boolean deathStarAccessable() {
        if (checkDeathStarStats() && checkTieFightersStats()) {
            deathStar.isReady();
            return true;
        }
        return false;
    }

    /**
     * Checks if HP of Tie Fighters is below 0
     *
     * @return boolean - true if tie fighters are destroyed
     */
    private boolean checkTieFightersStats() {
        return tieFighters.getHP() <= 0;
    }

    /**
     * Checks if players HP or Fuel are not below 0
     * Casuses the end of game if true
     * If not, checks if Tie Fighters are destroyed
     * Sets property of tie fighters destroyed to true
     */
    private void checkGameStatus() {
        if (checkPlayerStats()) {
            getGameLost();
            handleLostGame();
        }
        if (checkTieFightersStats()) {
            tieFighters.setDestroyed();
        }
    }

    /**
     * Alters players HP and Fuel based on Action
     * <p>
     * quickCheck and checkHp ensure that player cannot infinitely tank fuel and get HP
     * checks if the location is Near Asteroid Belt and checks players stats
     *
     * @param action - Action passed by the user
     */
    private void changeStats(Action action) {
        boolean quickCheck = gameInit.getCurrentLocation().getName().equals("Near Asteroid Belt");
        boolean checkHP = player.getHP() < 15 || player.getFuel() < 15;

        if (quickCheck && checkHP) {
            player.changeHP(action.getHpVal());
            player.changeFuel(action.getFuelVal());
        } else if (!quickCheck) {
            player.changeHP(action.getHpVal());
            player.changeFuel(action.getFuelVal());
        }

    }

    /**
     * Executes reaction based on the chosen action
     *
     * @param action - Action passed by the user
     */
    private void reactionProcess(Action action) {
        switch (action.getReaction()) {
            case 1:
                changeStats(action);
                break;
            case 2:
                changeLocation(action);
                break;
            case 3:
                this.getGameLost();
                break;
            case 4:
                this.getGameWin();
                break;
            case 5:
                this.initNewPlayer(action);
                break;
            case 6:
                destroyTieFighters(action);
                break;
            case 7:
                attackTheDeathStar(action);
                break;
            default:
                doNothing();
                break;
        }
    }

    /**
     * checks if deathstar is accessable and changes the location if true
     * If not and tie figters are not destroyed, attacks on the Death Star only decreases 2 HP
     * When tie figters are destroyed, attacks decrease -5 HP to the Death Star.
     *
     * @param action
     */
    private void attackTheDeathStar(Action action) {
        if (deathStarAccessable()) {
            changeLocation(action);
        } else if (!checkTieFightersStats()) {
            deathStar.setHP(deathStar.getHP() - 2);
            changeStats(action);
            return;
        }
        deathStar.setHP(deathStar.getHP() - 5);
        changeStats(action);
    }

    /**
     * Set property of tieFighters destroyed to true and
     * removes location of Asteroid Belt as well as actions corresponding to it that no longer make sense anymore.
     * <p>
     * Also resets positions of individual actions in the list.
     *
     * @param action - Action passed by the user
     */
    private void destroyTieFighters(Action action) {
        tieFighters.setDestroyed();
        changeLocation(action);
        gameInit.removeLocationFromTheList(0);
        gameInit.removeActionFromTheList(0);
        gameInit.removeActionFromTheList(1);

        List<Action> listOfChangedActions = getActionListOfCurrentLocation();
        for (Action actionChange :
                listOfChangedActions) {
            actionChange.setLocation(actionChange.getLocation() - 1);
        }
    }

    /**
     * Based on the users action either Millenium Falcon or X - Wing is set as a players ship
     *
     * @param action - Action passed by the user
     */
    private void initNewPlayer(Action action) {
        switch (action.getNumOfCase()) {
            case 1:
                this.player = new Player("player1", "Millenium Falcon", 10, 10);
                break;
            case 2:
                this.player = new Player("player1", "X-Wing", 5, 10);
                break;
        }
        changeLocation(action);
    }

    /**
     * Prints different messages depending on what happened
     * Possibilities - HP <= 0 ; Fuel <= 0, Action that led immediately to the demise
     * <p>
     * Makes some space first for better UX before printing the message
     * <p>
     * Invokes method that ends the game.
     */
    private void handleLostGame() {
        if (checkPlayersHP()) {
            clearScreen();
            System.out.println("GAME OVER: \n" +
                    "You ran out of lives. \n" +
                    "Your ship has suffered unbearable amount of damage " +
                    "and exploded.");
            exitGame();
        } else if (checkPlayersFuel()) {
            clearScreen();
            System.out.println("GAME OVER: \n" +
                    "You ran out of fuel and became an easy target.");
            exitGame();
        }
        clearScreen();
        System.out.println("GAME OVER: \n" +
                "Your action was a failure and led to the destruction" +
                " of the entire Rebel fleet.\n\n" +
                "Only terrifying void has been left behind.\n" +
                "The last hope has vanished.");
        exitGame();
    }

    /**
     * The most highest node in the tree of methods
     * checks if the input is valid and not null
     * then passes it to compare it with each action in the list of actions of current location
     * <p>
     * Checks the game status so the text user interface won't display misleading values
     *
     * @param input is String given by the user
     */
    private void magicHappening(String input) {

        //passes argument to find out if the input is valid
        if (inputTranslator(input) && iterateActionList(input) != null) {
            reactionProcess(iterateActionList(input));
        } else {
            System.out.println("Invalid Input");
        }
        if (gameLost) {
            handleLostGame();
        }
        checkGameStatus();
    }


}

