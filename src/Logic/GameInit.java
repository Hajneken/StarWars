/**
 * @author Hynek Zemanec
 * @project ${PROJECT_NAME}
 */
package Logic;

import Locations.Location;


public class GameInit {

    private Location currentLocation;

    //    List of Locations
    public GameInit() {
        initLocations();
    }

    private void initLocations() {
        Location base = new Location("Base", "The rebel HQ, where the fleet is preparing for the last battle.");
        Location battle = new Location("Battle", "Epicentre of the battle where fighting between Rebels and Imperial fleet is taking place.");
        Location nearAsteroidBelt = new Location("Near Asteroid Belt", "Haven of the Rebels Fleet providing support for the ongoing battle.");
        Location asteroidBelt = new Location("Within Asteroid Belt", "Spiral collection of explosive asteroids with a very little space for flying.");
        Location withinDeathStar = new Location("Within Death Star", "The heart of the Death Star where the right choice can liberate the galaxy.");

//        initNeighbours
        base.setExit(battle);
        battle.setExit(nearAsteroidBelt);
        battle.setExit(withinDeathStar);
        nearAsteroidBelt.setExit(asteroidBelt);
        nearAsteroidBelt.setExit(battle);
        asteroidBelt.setExit(nearAsteroidBelt);
//        game begins at the base
        currentLocation = base;
    }

    public Location getCurrentLocation() {return currentLocation;}

    public void setCurrentLocation(Location otherLocation){ currentLocation = otherLocation;}


}
