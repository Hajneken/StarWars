package Logic;

import Ships.DeathStar;
import Ships.Player;
import Ships.TieFighters;

/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public class GameLogic {
    private GameInit gameInit;
    private UserInterface userInterface;
    private Player player;
    private DeathStar deathStar;
    private TieFighters tieFighters;
    private boolean gameOver = false;

    public GameLogic(){
        gameInit = new GameInit();

    }

    private String greetingMessage() {
        return "Welcome to the STAR WARS - The Last Battle adventure game! \n" +
                "Are you ready for an adventure? \n PRESS ENTER for a new game";
    }

    private String getIntro() {
        return "A long time ago in the galaxy far, far away..." +
                "\n STAR WARS The Last Battle \n \n A war is raging across the galaxy." +
                "Mighty imperial forces with it's destructive weapon, the Death Star, has dominated most of the galaxy \n"
                + "Formerly known as the Republic.";
    }

    private String getGameOver(){
        return "Game Over: You ran out of lives.";
    }



    private String getWin(){
        return "Congratulations! You have won, the Galaxy is saved thanks to your effort." +
                "\nContinue by pressing Enter";
    }

    private String getEnd(){
        return "Thank You for playing my game!\nI hope you had fun.\n\nHave a nice day! \n\n A Game By: Hynek Zemanec " +
                "2018 ";
    }

    private String initUI() {
        return " ***********************************************************\n" +
                "| CURRENT LOCATION: " + gameInit.getNameOfCurrentLocation() + "\n" +
                "| DESCRIPTION:      " + gameInit.getDescriptionOfLocation() + "\n" +
                "| Ship statistics:  " + "Ship: [" + player.getShip() + "] " + "HP:[" + player.getHP() + "] " + "FUEL:[" + player.getFuel() + "] " + "\n"+
                "|--------------------------------------------------------- \n" +
                "|******************|  ENEMY STATISTICS  |******************\n" +
                "| Death Star :  HP:[" + deathStar.getHP() + "] "+ "\n" +
                "| Tie-fighters: HP:[ "+ tieFighters.getHP() + "] "+ "Status: " + tieFighters.statusInfo() + "\n" +
                "***********************************************************";
    }
}
