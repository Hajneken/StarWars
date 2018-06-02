package Logic;

import Ships.Player;

/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public class UserInterface {
    private GameLogic game;

//    constructor
    public UserInterface(GameLogic game) {
        this.game = game;
    }

    public void play(){
        System.out.println(game);
    }




    //manual
//    User interface will look like this:
//    ***********************************************************
//    * Current location: [LocationName]                        * /n
//    * Ship statistics: Ship=[NAME] HP=[HP] Fuel=[Fuel]        * /n
//    *---------------------------------------------------------*
//    * Death Star: HP = [30]                                   * /n
//    * Tie-fighters: [Aktivní / Zničeny]                       * /n
//    ***********************************************************
//    For your next choice, press the corresponding number:
//        1.    [Choice]
//        2.    [Choice]
//        3.    [Choice]
//        4.    [Choice]
//        5.    Exit GameInit

//
//    System.out.println("A Long Time Ago in a Galaxy Far Far Away...");
//    System.out.println("War rages across the republic! The mighty Imperial troops with their weapon of doom, the Death Star, are devastating the rebellion");


}
