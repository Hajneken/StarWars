package Locations;

import Logic.Action;

import java.util.*;

/**
 * @author Hynek Zemanec
 * @version 1.0
 * @project StarWars
 * @created June 2018
 * <p>
 * Class representing each location, having name, description, list of actions, list of exits and hint.
 */

public class Location {

    private String name;
    private String description;
    private List<Action> actionList;
    private String actions;
    private String hint;
    private List<Location> exits;

    /**
     * @param name
     * @param description
     * @param actions
     * @param hint
     */
    public Location(String name, String description, String actions, String hint) {
        this.name = name;
        this.description = description;
        this.actions = actions;
        this.hint = hint;
        actionList = new LinkedList<>();
        exits = new LinkedList<>();
    }

    /**
     * Setter of the location's exits
     *
     * @param nextLocation - Location which is set as a possible exit
     */
    //  Adds exit to a location
    public void setExit(Location nextLocation) {
        exits.add(nextLocation);
    }

    /**
     * Adds action to a location
     *
     * @param action Action - to be added in the list
     */
    public void addAction(Action action) {
        actionList.add(action);
    }

    /**
     * Getter of list of actions
     *
     * @return List - list of actions of a location
     */
    public List<Action> getActionList() {
        return actionList;
    }

    /**
     * Getter of list of locations
     *
     * @return LinkedList - List of exits to each location
     */
    public LinkedList<Location> getExits() {
        return (LinkedList<Location>) exits;
    }

    /**
     * @return String - name of location
     */
    public String getName() {
        return name;
    }

    /**
     * @param name String - name of location to be set
     */
    // setter of name
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter of description
     *
     * @return String - description of the location
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter of description
     *
     * @param description String - description to be set
     */
    // setter of description
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter of actions in String
     *
     * @return String - representation of actions attatched to the object rather than list
     */
    public String getActions() {
        return actions;
    }

    /**
     * Setter of actions
     *
     * @param actions - action to be set
     */
    public void setActions(String actions) {
        this.actions = actions;
    }

    /**
     * @param o - object to be compared with
     * @return boolean - true if object equals to something
     */
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

    /**
     * method returning int hashCode of an instance of certain object
     *
     * @return Integer - representation of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, description, actionList, actions, hint, exits);
    }

    /**
     * Getter of a hint
     *
     * @return String - representation of a hint of an object
     */
    public String getHint() {
        return hint;
    }
}
