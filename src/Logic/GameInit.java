/**
 * @author Hynek Zemanec
 * @project ${PROJECT_NAME}
 */
package Logic;

import Locations.Location;
import java.util.List;

/**
 *
 */

public class GameInit {

    private Location currentLocation;

    /**
     *List of Locations
     *
     */
    public GameInit() {
        initLocations();
    }

    /**
     *
     */
    private void initLocations() {
        Location base = new Location("Base",
                "The rebel HQ, where the fleet is preparing for the last battle. ",
                "\n Choose your ship: \n" +
                        "   1: Millenium Falcon \n" +
                        "   2: X-Wing",
                "Choose one ship by pressing the corresponding number and confirm by pressing enter");
        Location airport = new Location("Airport",
                "Military Airport where the rebel fleet is getting ready for the final hyperspace jump.",
                "   1.Jump to the hyperspace and be the first to enter the battlefield\n" +
                        "   2.Send in the fleet first and then follow them into battle\n" +
                        "   3.Enter the battlefield together with the Rebel Fleet\n" +
                        "   4.Return to choose a different ship\n" +
                        "\n('H' for Hint |'E' to Exit the Game",
                "Choose an action by pressing the corresponding number and confirm by pressing 'Enter' key\n" +
                        "Note that every action has its consequence, e.g. decreasing HP or Fuel. Choose wisely.");
        Location battle = new Location("Battle",
                "Epicentre of the battle where fighting between Rebels forces and Imperial fleet is taking place.",
                "   1.Fire at the Death Star shields\n" +
                        "   2.Hold and defend the position\n" +
                        "   3.Launch offensive attack against the Death Star.\n" +
                        "   4.Focus the attack at Tie-Fighters\n" +
                        "   5.Retreat towards nearby Asteroid Belt\n" +
                        "\n('H' for Hint |'E' to Exit the Game",
                "Choose an action by pressing the corresponding number and confirm by pressing 'Enter' key\n" +
                        "You must first destroy Tie-Fighters and decrease HP of the Death Star sufficiently before attacking the Death Star\n" +
                        "You might not be able to do destroy tie-fighters in this location.");
        Location nearAsteroidBelt = new Location("Near Asteroid Belt",
                "Haven of the Rebels Fleet providing support for the ongoing battle.",
                "\n Choose your next action by entering the corresponding number:\n" +
                        "   1.Fly within the Belt of explosive Asteroids in hope of getting rid of Tie-Fighters.\n" +
                        "   2.Return to the battle.\n" +
                        "   3.Fight Tie-Fighters\n" +
                        "   4.Repair your ship and fill-up the tank with fuel\n" +
                        "\n('H' for Hint |'E' to Exit the Game",
                "Choose an action by pressing the corresponding number and confirm by pressing 'Enter' key\n" +
                        "It would be advisable to try your luck in the asteroid belt\n" +
                        "Beware of the status of your ship! You can repair it and tank fuel if necessary.");
        Location asteroidBelt = new Location("Within Asteroid Belt",
                "Spiral collection of explosive asteroids with a very little space for flying.",
                "   1.Fire at Asteroids with hope of destroying Tie-Fighters\n" +
                        "   2.Use the force and move with an Asteroid\n" +
                        "   3.Manoeuvre the ship as best as you can\n" +
                        "   4.Leave the Asteroid Belt\n" +
                        "\n('H' for Hint |'E' to Exit the Game",
                "Choose an action by pressing the corresponding number and confirm by pressing 'Enter' key\n" +
                        "There is a reason why Jedi skills prove useful.");
        Location withinDeathStar = new Location("Within Death Star",
                "The heart of the Death Star where the right choice can liberate the galaxy.",
                "   1.Fire at the engines\n" +
                        "   2.Fire at the laser system\n" +
                        "   3.Plant a bomb and start the countdown\n" +
                        "   4.Leave the heart of the Death Star\n" +
                        "\n('H' for Hint |'E' to Exit the Game",
                "Choose an action by pressing the corresponding number and confirm by pressing 'Enter' key\n" +
                        "If you play with fire, you'll get burnt");


//        initNeighbours
        base.setExit(airport);
        base.setExit(airport);
        airport.setExit(airport);
        airport.setExit(battle);
        airport.setExit(base);
        battle.setExit(battle);
        battle.setExit(nearAsteroidBelt);
        battle.setExit(withinDeathStar);
        nearAsteroidBelt.setExit(nearAsteroidBelt);
        nearAsteroidBelt.setExit(asteroidBelt);
        nearAsteroidBelt.setExit(battle);
        asteroidBelt.setExit(asteroidBelt);
        asteroidBelt.setExit(nearAsteroidBelt);
        withinDeathStar.setExit(withinDeathStar);
        withinDeathStar.setExit(battle);

//        game begins at the base
        currentLocation = base;

//      adding actions to base

        base.addAction(new Action(1, "  1: Millenium Falcon", 5, 0, 0, 1));
        base.addAction(new Action(2, "  2: X-Wing", 5, 0, 0, 1));
//      adding actions to the airport
        airport.addAction(new Action(1, "   1.Jump to the hyperspace and be the first to enter the battlefield",
                2, -5, -3, 1));
        airport.addAction(new Action(2, "   2.Send in the fleet first and then follow them into battle",
                2, -3, -3, 1));
        airport.addAction(new Action(3, "   3.Enter the battlefield together with the Rebel Fleet",
                2, -1, -3, 1));
        airport.addAction(new Action(4, "   4.Return to choose a different ship",
                2, 0, -3, 2));

        battle.addAction(new Action(1, "   1.Fire at the Death Star shields",
                7, -4, -2, 0));
        battle.addAction(new Action(2, "   2.Hold and defend the position",
                1, -5, 0, 0));
        battle.addAction(new Action(3, "   3.Launch offensive attack and try to enter the Death Star",
                7, -4, -2, 2));
        battle.addAction(new Action(4, "   4.Focus the attack at Tie-Fighters",
                3, -30, -30, 0));
        battle.addAction(new Action(5, "   5.Retreat towards nearby Asteroid Belt",
                2, 0, -2, 1));

        nearAsteroidBelt.addAction(new Action(1, "   1.Fly within the Belt of explosive Asteroids in hope of getting rid of Tie-Fighters",
                2, 0, -2, 1));
        nearAsteroidBelt.addAction(new Action(2, "   2.Return to the battle",
                2, 0, -2, 2));
        nearAsteroidBelt.addAction(new Action(3, "   3.Fight Tie-Fighters",
                3, -4, -1, 0));
        nearAsteroidBelt.addAction(new Action(4, "   4.Repair your ship and fill-up the tank with fuel",
                1, 5, 10, 0));

        asteroidBelt.addAction(new Action(1, "   1.Fire at Asteroids with hope of destroying Tie-Fighters",
                6, -3, 0, 1));
        asteroidBelt.addAction(new Action(2, "   2.Use the force and move with an Asteroid",
                6, -1, 0, 1));
        asteroidBelt.addAction(new Action(3, "   3.Manoeuvre the ship as best as you can",
                1, -1, -4, 0));
        asteroidBelt.addAction(new Action(4, "   4.Leave the Asteroid Belt",
                2, 0, -1, 1));

        withinDeathStar.addAction(new Action(1, "   1.Fire at the fuel tanks of the Death Star",
                1, -30, -30, 0));
        withinDeathStar.addAction(new Action(2, "   2.Fire at the laser system",
                4, -3, 0, 0));
        withinDeathStar.addAction(new Action(3, "   3.Plant a bomb and start the countdown",
                4, -3, 0, 0));
        withinDeathStar.addAction(new Action(4, "   4.Leave the heart of the Death Star",
                2, -1, 0, 1));

    }

    /**
     *
     * @return
     */
    public Location getCurrentLocation() {
        return currentLocation;
    }

    /**
     *
     * @return
     */
    public String getDescriptionOfLocation() {
        return currentLocation.getDescription();
    }

    /**
     *
     * @return
     */
    public String getNameOfCurrentLocation() {
        return currentLocation.getName();
    }

    /**
     *
     * @return
     */
    public String getActionsOfCurrentLocation() {
//        gets all the actions for current location
        List<Action> actions = currentLocation.getActionList();
        String actionsOutput = "\n";
        for (Action action :
                actions) {
            actionsOutput += action.getDescription() + "\n";
        }
        return actionsOutput;
//        return currentLocation.getActions();
    }

    /**
     *
     * @return
     */
    public String getHintOfCurrentLocation() {
        return currentLocation.getHint();
    }

    /**
     *
     * @param otherLocation
     */

    public void setCurrentLocation(Location otherLocation) {
        currentLocation = otherLocation;
    }

    /**
     *
     * @param indexOfLocation
     */
    //    gets the exits and removes those we don't need anymore as well as the action that goes with them
    public void removeLocationFromTheList(int indexOfLocation) {
        currentLocation.getExits().remove(indexOfLocation);

    }

    /**
     *
     * @param indexOfAction
     */
    public void removeActionFromTheList(int indexOfAction) {
        currentLocation.getActionList().remove(indexOfAction);
    }


}
