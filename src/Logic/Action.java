package Logic;

/**
 * @author Hynek Zemanec
 * @project StarWars
 * @version 1.0
 * @created July 2018
 * <p>
 * Class representing Action that object which includes identifier, description, reaction, location HP and fuel change
 */
public class Action {
    private int numOfCase;
    private String description;
    private int reaction;
    private int hpVal;
    private int fuelVal;
    private int location;

    /**
     *
     * @param numOfCase
     * @param description
     * @param reaction
     * @param hpVal
     * @param fuelVal
     * @param location
     */
    public Action(int numOfCase, String description, int reaction, int hpVal, int fuelVal, int location) {
        this.numOfCase = numOfCase;
        this.description = description;
        this.reaction = reaction;
        this.hpVal = hpVal;
        this.fuelVal = fuelVal;
        this.location = location;
    }

    /**
     * Setter of HP value for the player
     *
     * @param hpVal - Integer value
     */
    public void setHpVal(int hpVal) {
        this.hpVal = hpVal;
    }

    /**
     * Setter of Fuel value for the player
     *
     * @param fuelVal - Integer value
     */
    public void setFuelVal(int fuelVal) {
        this.fuelVal = fuelVal;
    }

    /**
     * Getter of the location
     *
     * @return - Integer value of the location
     */
    public int getLocation() {
        return location;
    }

    /**
     * Setter of the location which to which it should be changed
     *
     * @param location
     */
    public void setLocation(int location) {
        this.location = location;
    }

    /**
     * Getter of number of case
     *
     * @return integer - identifier of the particular action
     */
    public int getNumOfCase() {
        return numOfCase;
    }

    /**
     * Setter of number of case
     *
     * @param numOfCase integer - identifier of the particular action
     */
    public void setNumOfCase(int numOfCase) {
        this.numOfCase = numOfCase;
    }

    /**
     * Getter of number of case
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter of the description Value
     *
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter of reaction value
     *
     * @return Integer value corresponding to the reaction of the action
     */
    public int getReaction() {
        return reaction;
    }

    /**
     * Setter of reaction value
     *
     * @param reaction Integer value corresponding to the reaction of the action
     */
    public void setReaction(int reaction) {
        this.reaction = reaction;
    }

    /**
     * Getter of HP value of the player
     *
     * @return Integer value of HP
     */
    public int getHpVal() {
        return hpVal;
    }

    /**
     * Getter of HP value of the player
     *
     * @return Integer value of Fuel
     */
    public int getFuelVal() {
        return fuelVal;
    }
}
