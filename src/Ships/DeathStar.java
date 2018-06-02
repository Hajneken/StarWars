package Ships;

/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public class DeathStar implements Enemy{
    private int hp;
    private boolean ready;
    private boolean destroyed;
    /*
    The Deathstar starts with 30 Health Points
     */
    public DeathStar(){
        this.hp = 30;
        this.ready = false;
        this.destroyed = false;
    }

    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public void setHP(int newHp) {
        hp = newHp;
    }
}
