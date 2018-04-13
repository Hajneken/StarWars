package Ships;

/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public class HeroShip {

    private int x_wing;
    private String name;
    private int HP;
    private int speed;
    private int fuel;

    public HeroShip(){
        this.name = "Millenium Falcon";
        this.HP = 10;
        this.speed = 5;
        this.fuel = 10;
    }

/*
allows to have one class instead of two classes
if int is passed in the constructor, X-wing is instantiated
 */

    public HeroShip(int x_wing){
        this.name = "X-Wing";
        this.HP = 5;
        this.speed = 10;
        this.fuel = 10;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

//    I might use it in the story development
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
