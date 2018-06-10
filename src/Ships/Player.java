package Ships;

/**
 * @author Hynek Zemanec
 * @project StarWars
 * @version 1.0
 * @created June 2018
 * <p>
 * Class representing the main hero (the player) of the game.
 * Provides setters and getters for the values of hero.
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
     * Getter of the players name
     *
     * @return String - name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Setter of the players name
     *
     * @param name String - name of the player to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter of the players name
     *
     * @return String - name of the player
     */
    public String getShip() {
        return ship;
    }

    /**
     * Setter of the players ship
     *
     * @param ship String - name of the players ship
     */
    public void setShip(String ship) {
        this.ship = ship;
    }

    /**
     * Getter of the players HP
     *
     * @return Integer - current value of the HP
     */
    public int getHP() {
        return HP;
    }

    /**
     * Setter of the players HP
     *
     * @param HP Integer - value of the HP to be set
     */
    public void setHP(int HP) {
        this.HP = HP;
    }

    /**
     * Getter of the players name
     *
     * @return Integer - current value of the fuel
     */
    public int getFuel() {
        return fuel;
    }

    /**
     * Setter of the players Fuel
     *
     * @param fuel Integer - value of the fuel to be set
     */
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    /**
     * Changes value of the players HP by given amount
     *
     * @param changeValue - value of the HP by which should be original value changed
     */
    public void changeHP(int changeValue) {
        this.HP += changeValue;
    }

    /**
     * Changes value of the players Value by given amount
     *
     * @param changeValue - value of the fuel by which should be original value changed
     */
    public void changeFuel(int changeValue) {
        this.fuel += changeValue;
    }


}

