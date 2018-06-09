package Ships;

/**
 * @author Hynek Zemanec
 * @project StarWars
 * @version 1.0
 * @created July 2018
 * <p>
 * Class representing an enemy, Tie Fighters which have to be destroyed before entering the Death Star.
 * Simple setters and getters are implemented only.
 */
public class TieFighters implements Enemy {

    private int hp;
    private boolean destroyed;

    /**
     * Constructor initializing TieFighters
     */
    public TieFighters() {
        this.hp = 5;
        this.destroyed = false;
    }

    /**
     * Getter of destroyed value
     *
     * @return boolean - true if destroyed
     */
    public boolean getDestroyed() {
        return destroyed;
    }

    /**
     * Setter of destroyed value to true
     */
    public void setDestroyed() {
        destroyed = true;
    }

    /**
     *  Getter of HP value of tie fighters
     *
     * @return Integer - value
     */
    @Override
    public int getHP() {
        if (destroyed) {
            return 0;
        }
        return hp;
    }

    /**
     * Setter of HP value of Tie Fighter
     *
     * @param newHp - Integer value that sets the new HP
     */
    @Override
    public void setHP(int newHp) {
        hp = newHp;
    }

    /**
     * Information for that is included in the text User Interface.
     *
     * @return String - message to be printed in text User Interface
     */
    public String statusInfo() {
        if (destroyed) {
            return "Destroyed";
        }
        return "Actively engaged in the fight";
    }
}
