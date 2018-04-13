package Logic;
import java.util.Scanner;
/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public class TextUI {

    private String userInterface;
    private int situation;

    public TextUI(String userInterface) {
        this.userInterface = userInterface;
    }

    public String getUserInterface() {
        return userInterface;
    }

    public String gameOver() {
        return "Game Over";
    }

    //manual
//    User interface will look like this:
//    ***********************************************************
//    * Current location: [LocationName]                        * /linebreak
//    * Ship statistics: Ship=[NAME] HP=[HP] Fuel=[Fuel]        * /linebreak
//    *---------------------------------------------------------*
//    * Death Star: HP = [30]                                   * /linebreak
//    * Tie-fighters: [Aktivní / Zničeny]                       * /linebreak
//    ***********************************************************
//    For your next choice, press the corresponding number:
//        1.    [Choice]
//        2.    [Choice]
//        3.    [Choice]
//        4.    [Choice]
//        5.    Exit Game

//
//    System.out.println("A Long Time Ago in a Galaxy Far Far Away...");
//    System.out.println("War rages across the republic! The mighty Imperial troops with their weapon of doom, the Death Star, are devastating the rebellion");


}
