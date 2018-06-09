package Logic;

/**
 * @author Hynek Zemanec
 * @project StarWars
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
     *
     * @param hpVal
     */
    public void setHpVal(int hpVal) {
        this.hpVal = hpVal;
    }

    /**
     *
     * @param fuelVal
     */
    public void setFuelVal(int fuelVal) {
        this.fuelVal = fuelVal;
    }

    /**
     *
     * @return
     */
    public int getLocation() {
        return location;
    }

    /**
     *
     * @param location
     */
    public void setLocation(int location) {
        this.location = location;
    }

    /**
     *
     * @return
     */
    public int getNumOfCase() {
        return numOfCase;
    }

    /**
     *
     * @param numOfCase
     */
    public void setNumOfCase(int numOfCase) {
        this.numOfCase = numOfCase;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public int getReaction() {
        return reaction;
    }

    /**
     *
     * @param reaction
     */
    public void setReaction(int reaction) {
        this.reaction = reaction;
    }

    /**
     *
     * @return
     */
    public int getHpVal() {
        return hpVal;
    }

    /**
     *
     * @return
     */
    public int getFuelVal() {
        return fuelVal;
    }
}
