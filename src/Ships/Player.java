package Ships;

/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public class Player {

    private String name;
    private String ship;
    private int HP;
    private int fuel;

    public Player(String name, String ship, int hp, int fuel){
        this.name = name;
        this.ship = ship;
        this.HP = hp;
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

}