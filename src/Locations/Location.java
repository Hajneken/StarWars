package Locations;

import Logic.Action;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Hynek Zemanec
 * @project StarWars
 */

public class Location {

    private String name;
    private String description;
    private List<Action> actionList;
    private String actions;
    private String hint;
    private List<Location> exits;

    //    constructor
//    each Location has name and description
//    it has a collection of exits which
    public Location(String name, String description, String actions, String hint) {
        this.name = name;
        this.description = description;
        this.actions = actions;
        this.hint = hint;
        actionList = new LinkedList<>();
        exits = new LinkedList<>();
    }

    //  Adds exit to a location
    public void setExit(Location nextLocation) {
        exits.add(nextLocation);
    }

    //  Adds action to a location
    public void addAction(Action action) {
        actionList.add(action);
    }

    public List<Action> getActionList() {
        return actionList;
    }

    // Location getter
    public LinkedList<Location> getExits() {
        return (LinkedList<Location>) exits;
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

    // getter of actions
    public String getActions() {
        return actions;
    }

    // setter of actions
    public void setActions(String actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(name, location.name) &&
                Objects.equals(description, location.description) &&
                Objects.equals(actionList, location.actionList) &&
                Objects.equals(actions, location.actions) &&
                Objects.equals(hint, location.hint) &&
                Objects.equals(exits, location.exits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, actionList, actions, hint, exits);
    }

    public String getHint() {
        return hint;
    }
}
