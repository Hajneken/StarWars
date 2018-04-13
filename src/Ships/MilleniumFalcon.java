package Ships;

import java.util.Objects;

/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public class MilleniumFalcon {
    private String name;
    private int HP;
    private int fuel;

    public MilleniumFalcon(String name) {
        this.name = name;
        this.HP = HP;
        this.fuel = fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MilleniumFalcon that = (MilleniumFalcon) o;
        return HP == that.HP &&
                fuel == that.fuel &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, HP, fuel);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
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
