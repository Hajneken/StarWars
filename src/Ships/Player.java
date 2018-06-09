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
    private boolean exists;

    /**
     * Creates an instance at the beginning of the game
     * which will be changed afterwards
     */
    public Player() {
        this.name = "player1";
        this.ship = "Unavailable";
        this.HP = 1;
        this.fuel = 1;
        this.exists = false;
    }

    /**
     *
     * @param name
     * @param ship
     * @param hp
     * @param fuel
     */
    public Player(String name, String ship, int hp, int fuel) {
        this.name = name;
        this.ship = ship;
        this.HP = hp;
        this.fuel = fuel;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getShip() {
        return ship;
    }

    /**
     *
     * @param ship
     */
    public void setShip(String ship) {
        this.ship = ship;
    }

    /**
     *
     * @return
     */
    public int getHP() {
        return HP;
    }

    /**
     *
     * @param HP
     */
    public void setHP(int HP) {
        this.HP = HP;
    }

    /**
     *
     * @return
     */
    public int getFuel() {
        return fuel;
    }

    /**
     *
     * @param fuel
     */
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    /**
     *
     * @param changeValue
     */
    public void changeHP(int changeValue) {
        this.HP += changeValue;
    }

    /**
     *
     * @param changeValue
     */
    public void changeFuel(int changeValue) {
        this.fuel += changeValue;
    }


}

