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

    public Action(int numOfCase, String description, int reaction, int hpVal, int fuelVal, int location) {
        this.numOfCase = numOfCase;
        this.description = description;
        this.reaction = reaction;
        this.hpVal = hpVal;
        this.fuelVal = fuelVal;
        this.location = location;
    }

    public void setHpVal(int hpVal) {
        this.hpVal = hpVal;
    }

    public void setFuelVal(int fuelVal) {
        this.fuelVal = fuelVal;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getNumOfCase() {
        return numOfCase;
    }

    public void setNumOfCase(int numOfCase) {
        this.numOfCase = numOfCase;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReaction() {
        return reaction;
    }

    public void setReaction(int reaction) {
        this.reaction = reaction;
    }

    public int getHpVal() {
        return hpVal;
    }

    public int getFuelVal() {
        return fuelVal;
    }
}
