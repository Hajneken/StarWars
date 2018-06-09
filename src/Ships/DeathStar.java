package Ships;

/**
 * @author Hynek Zemanec
 * @version 1.0
 * @project StarWars
 * @created July 2018
 * <p>
 * Class representing the Death Star enemy, implementing the Enemy interface.
 * It creates hp and boolean values determining if the death star is ready to be entered and if it is destroyed.
 */
public class DeathStar implements Enemy {
    private int hp;
    private boolean ready;
    private boolean destroyed;

    /**
     * The Deathstar starts with 30 Health Points
     */
    public DeathStar() {
        this.hp = 30;
        this.ready = false;
        this.destroyed = false;
    }

    /**
     * Getter of the death star's HP value
     *
     * @return Integer - value representing HP
     */
    @Override
    public int getHP() {
        return hp;
    }

    /**
     * Setter of the death star's HP value
     *
     * @param newHp Integer - value to be set to
     */
    @Override
    public void setHP(int newHp) {
        hp = newHp;
    }

    /**
     * turns destroyed property to true
     */
    public void isReady() {
        destroyed = true;
    }

    /**
     * Checks if the Death Star is destroyed.
     *
     * @return boolean - status of the death star
     */
    public boolean isDestroyed() {
        return destroyed;
    }
}
