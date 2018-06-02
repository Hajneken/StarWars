package Logic;

import Ships.Player;

/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public class UserInterface {

    public UserInterface(){
    }

    private String greetingMessage(){
        return  "Welcome to the STAR WARS - The Last Battle adventure game! \n" +
                "Are you ready for an adventure? \n PRESS ENTER for a new game";
    }
    private String intro(){
        return "A long time ago in the galaxy far, far away..." +
                "\n STAR WARS The Last Battle \n \n A war is raging across the galaxy." +
                "Mighty imperial forces with it's destructive weapon, the Death Star, has dominated most of the galaxy \n"
                + "Formerly known as the Republic.";
    }

    private String initUI(){
        return " ***********************************************************/n" +
                "* Current location: [LocationName] /n" +
                "* Ship statistics: Ship=[NAME] HP=[HP] Fuel=[Fuel] /n" +
                "*--------------------------------------------------------- /n" +
                "* Death Star: HP = [30] /n" +
                "* Tie-fighters: [Aktivní / Zničeny] /n" +
                "***********************************************************";
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
