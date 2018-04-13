package Ships;

/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public class DeathStar {
    private int HP;
    /*
    The Deathstar starts with 30 Health Points
     */
    public DeathStar(){
        this.HP = 30;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
