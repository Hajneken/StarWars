package Ships;

/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public interface Enemy {
    //returns the Health Points of the enemy
    public int getHP();

    //sets Health Points of the enemy
    public void setHP(int newHp);
}
