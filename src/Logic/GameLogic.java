package Logic;

import Locations.Location;
import Ships.DeathStar;
import Ships.Player;
import Ships.TieFighters;


import java.util.*;


/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public class GameLogic {
    private GameInit gameInit;
    private Player player;
    private DeathStar deathStar;
    private TieFighters tieFighters;
    private boolean gameOver = false;
    private boolean gameLost = false;
    private boolean gameWon = false;

    public GameLogic() {
        player = new Player();
        gameInit = new GameInit();
        deathStar = new DeathStar();
        tieFighters = new TieFighters();
    }

    public String greetingMessage() {
        return "Welcome to the STAR WARS - The Last Battle adventure game! \n" +
                "Are you ready for an adventure? \n PRESS ENTER for a new game";
    }

    public String getIntro() {
        return "A long time ago in the galaxy far, far away..." +
                "\n\n ** STAR WARS The Last Battle ** \n \n A war is raging across the galaxy.\n" +
                "Mighty imperial forces with it's destructive weapon, the Death Star, have dominated most of the galaxy.\n"
                + "The struggle of the Rebels will climax in the last battle of this cruel war." +
                "\n You, the best pilot in the galaxy, are the last hope for ending the cruel war. \n" +
                "Your actions will decide the destiny of the galaxy. \n\n" +
                "PRESS ENTER to continue";
    }

    //    return true if game is over
    public boolean isOver() {
        return gameOver;
    }

    // method for when player looses
    private void getGameLost() {
        gameLost = true;
    }

    // method for when player wins
    public void getGameWin() {
        gameWon = true;
    }

    public String getCongratulationsText() {
        return "Congratulations! You have won and thanks to your effort the peace reign across The Galaxy." +
                "\n\nContinue by pressing Enter";
    }

    // epilog
    public String getEpilogue() {
        return "Thank You for playing my game!\nI hope you had fun.\n\nHave a nice day! \n\n A Game By: Hynek Zemanec " +
                "2018 ";
    }
// static UI remains the same, dynamicUI are actions which change dynamically with location

    public String initUI() {
        String staticUI =
                "***********************************************************" +
                        "********************************************************\n" +
                        "| CURRENT LOCATION: " + gameInit.getNameOfCurrentLocation() + "\n" +
                        "| DESCRIPTION:      " + gameInit.getDescriptionOfLocation() + "\n" +
                        "| Ship statistics:  " + "Ship: [" + player.getShip() + "] " + "HP:[" + player.getHP() + "] " + "FUEL:[" + player.getFuel() + "] " + "\n" +
                        "|---------------------------------------------------------" +
                        "--------------------------------------------------------- \n" +
                        "|******************|  ENEMY STATISTICS  |******************\n" +
                        "| Death Star :  HP:[" + deathStar.getHP() + "] " + "\n" +
                        "| Tie-fighters: HP:[ " + tieFighters.getHP() + "] " + "Status: " + tieFighters.statusInfo() + "\n" +
                        "***********************************************************" +
                        "********************************************************\n";
        String howTo = "\n Choose your next action by entering the corresponding number:\n\n";
        String dynamicUI = howTo + gameInit.getActionsOfCurrentLocation();
        return staticUI + dynamicUI;
    }

    //    potřebujeme se dostat k hodnotě reaction, hpVal, fuelVal
//    ta je v seznamu actionList v Location
//    getter k actionListu, getter k akci, pak gettery ke všem ostatním
//    for cyklem proiterovat a najít akci

    public List<Action> getActionListOfCurrentLocation() {
        return gameInit.getCurrentLocation().getActionList();
    }

    private boolean inputTranslator(String input) {
        try {
            int parsed = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException formatError) {
            String formattedInput = input.trim().toUpperCase();
            if (formattedInput.equals("H")) {
                System.out.println("HINT: " + gameInit.getHintOfCurrentLocation());
                return false;
            } else if (formattedInput.equals("E")) {
                exitGame();
            } else if (input.isEmpty() || !input.isEmpty()) {
                doNothing();
                return false;
            }
        }
        return true;
    }

    private Action iterateActionList(String input) {
//        parse int from String
        int parsedInt = Integer.parseInt(input);
//        invoke list of actions
        List<Action> listOfActions = getActionListOfCurrentLocation();
//    Iterates over list of actions, choosing the one we want
//    returns Null if noneFound
        for (Action action :
                listOfActions) {
            if (action.getNumOfCase() == parsedInt) {
                return action;
            }
        }
        return null;
    }

    private void doNothing() {
//        outputs to invalid input to cli
        System.out.println("Invalid input");
    }

    private void showHint() {
//        outputs the hint to cli
        System.out.println(gameInit.getHintOfCurrentLocation());
    }

    public void exitGame() {
//        immediately exits the game
        System.exit(0);
    }

    private void changeLocation(Action action) {
        LinkedList<Location> locationList = gameInit.getCurrentLocation().getExits();
/*
gets the int from action corresponding to the location and gets the location from the list of exits
the location is then changed
afterwards it changes stats as well
*/
        gameInit.setCurrentLocation(locationList.get(action.getLocation()));
        changeStats(action);
    }

//    checks players hp returns true if < 0
    private boolean checkPlayersHP(){
      return player.getHP() <= 0;
    }

//    checks players fuel returns true if < 0
    private boolean checkPlayersFuel(){
        return player.getFuel() <= 0;
    }

    /*
    returns true if game over
    checks players hp and fuel value,
    if either under 0 returns false
    */
    private boolean checkPlayerStats() {
        return checkPlayersHP() || checkPlayersFuel();
    }

    //    returns true if DeathStar is accessible for enter
    private boolean checkDeathStarStats() {
        return deathStar.getHP() <= 15;
    }

    // checks if tieFigters are destroyed and death star has the limit needed
    private void deathStarAccessable(){
        if(checkDeathStarStats() && checkTieFightersStats()){ deathStar.isReady(); }
    }

    //    returns true if tie fighters are destroyed
    private boolean checkTieFightersStats() {
        return tieFighters.getHP() <= 0;
    }

    private void checkGameStatus() {
        if (checkPlayerStats()) {
            getGameLost();
            handleLostGame();
        }
        if (checkTieFightersStats()){
            tieFighters.setDestroyed();
        }
    }

    //    alters players HP and Fuel based on Action
    private void changeStats(Action action) {
//        gets values from the passed action
        player.changeHP(action.getHpVal());
        player.changeFuel(action.getFuelVal());
    }

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
            default:
                doNothing();
                break;
        }
    }

    public static void clearScreen() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    private void handleLostGame(){
        if (checkPlayersHP()){
            clearScreen();
            System.out.println("GAME OVER: \n" +
                    "You ran out of lives. \n" +
                    "Your ship has suffered unbearable amount of damage " +
                    "and exploded.");
            exitGame();
        } else if (checkPlayersFuel()){
            clearScreen();
        System.out.println("GAME OVER: \n" +
                "You ran out of fuel and became an easy target.");
            exitGame();}
        clearScreen();
        System.out.println("GAME OVER: \n" +
                "Your action was a failure and led to the destruction" +
                "of the entire Rebel fleet.\n" +
                "Only terrifying void has been left behind" +
                "The last hope has vanished.");
        exitGame();
    }

// checks if player HP and Fuel > 0
    private void magicHappening(String input) {
        checkGameStatus();

        if(gameLost){
            handleLostGame();
        }

        //passes argument to find out if the input is valid
        if (inputTranslator(input) && iterateActionList(input) != null) {
            reactionProcess(iterateActionList(input));
        } else {
            System.out.println("Invalid Input");
        }
    }

    public String processInput(String input) {
        magicHappening(input);
        return initUI();
    }

}

