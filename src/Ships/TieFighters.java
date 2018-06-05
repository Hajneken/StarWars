package Ships;

import javax.rmi.CORBA.Tie;

/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public class TieFighters implements Enemy{

    private int hp;
    private boolean destroyed;

    public TieFighters(){
        this.hp = 5;
        this.destroyed = false;
    }

    public boolean getDestroyed(){ return destroyed; };

    public void setDestroyed(){ destroyed = true; };

    @Override
    public int getHP() {
        if (destroyed){
            return 0;
        }
        return hp;
    }

    @Override
    public void setHP(int newHp) {
        hp = newHp;
    }

    public String statusInfo(){
        if (destroyed){
            return "Destroyed";
        }
        return "Actively engaged in the fight";
    }
}
