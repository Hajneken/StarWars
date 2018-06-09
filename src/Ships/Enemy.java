package Ships;

/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public interface Enemy {
    //returns the Health Points of the enemy
    int getHP();

    //sets Health Points of the enemy
    void setHP(int newHp);
}
