/**
 * @author Hynek Zemanec
 * @project ${PROJECT_NAME}
 */
package Logic;

import Locations.Base;
import Ships.DeathStar;

public class Game {
//    Game logic here
     private boolean over = false;
     private DeathStar deathStar;

     public Game(boolean over) {
          this.over = over;
     }

     public void setOver(boolean over) {
          this.over = over;
     }

     public boolean getOver(){
          return this.over;
     }

     public String gameOver(){
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

     public void isOver(){
          over = true;
     }

     TextUI ui = new TextUI();

     Base base = new Base();



}
