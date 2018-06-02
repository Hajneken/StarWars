package Locations;

import java.net.ProxySelector;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Hynek Zemanec
 * @project StarWars
 */

public class Location {
//    base
//    battle
//    nearAsteroidBelt
//    asteroidBelt
//    withinDeathStar 

    private String name;
    private String description;
    private Set<Location> exits;

//    constructor
//    each Location has name and description
//    it has a collection of exits which
    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        exits = new HashSet<>();
    }

//  setter of exit of a location
    public void setExit(Location nextLocation) {
        exits.add(nextLocation);
    }

// Location getter
    public Collection<Location> getExits() {
        return Collections.unmodifiableCollection(exits);
    }

// getter of name
    public String getName() {
        return name;
    }
// setter of name
    public void setName(String name) {
        this.name = name;
    }
// getter of description
    public String getDescription() {
        return description;
    }
// setter of description
    public void setDescription(String description) {
        this.description = description;
    }


    public Location returnNeighbouringLocation(String nameOfNextLocation) {
        List<Location> searchedLocations = exits.stream()
                .filter(neighbour -> neighbour.getName().equals(nameOfNextLocation))
                .collect(Collectors.toList());
        if (searchedLocations.isEmpty()) {
            return null;
        } else {
            return searchedLocations.get(0);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(name, location.name) &&
                Objects.equals(description, location.description) &&
                Objects.equals(exits, location.exits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, exits);
    }
}
