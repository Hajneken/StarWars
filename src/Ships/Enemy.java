package Ships;

/**
 * @author Hynek Zemanec
 * @version 1.0
 * @project StarWars
 * @created July 2018
 * <p>
 * Interface for all enemies.
 */

public interface Enemy {
    /**
     * @return the Health Points of the enemy
     */
    int getHP();

    /**
     * sets Health Points of the enemy
     *
     * @param newHp
     */
    void setHP(int newHp);
}
