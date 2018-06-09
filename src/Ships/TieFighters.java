package Ships;

/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public class TieFighters implements Enemy {

    private int hp;
    private boolean destroyed;

    /**
     *
     */
    public TieFighters() {
        this.hp = 5;
        this.destroyed = false;
    }

    /**
     *
     * @return
     */
    public boolean getDestroyed() {
        return destroyed;
    }

    /**
     *
     */
    public void setDestroyed() {
        destroyed = true;
    }

    /**
     *
     * @return
     */
    @Override
    public int getHP() {
        if (destroyed) {
            return 0;
        }
        return hp;
    }

    /**
     *
     * @param newHp
     */
    @Override
    public void setHP(int newHp) {
        hp = newHp;
    }

    /**
     *
     * @return
     */
    public String statusInfo() {
        if (destroyed) {
            return "Destroyed";
        }
        return "Actively engaged in the fight";
    }
}
