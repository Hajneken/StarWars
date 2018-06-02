package Logic;
import Locations.Location;

public class Main {

    public static void main(String[] args) {
        Location testovaciLokace = new Location("Test", "testingTheString");
        Location test1 = new Location("Test", "testingTheString");
        Location testovaciLokace2 = new Location("Jinak", "testingTheString");
        Location testovaciLokace3 = new Location("Jinak2", "testingTheString");
        Location testovaciLokace4 = new Location("Jinak3", "testingTheString");

        testovaciLokace.setExit(test1);
        test1.setExit(testovaciLokace2);
        testovaciLokace3.setExit(testovaciLokace4);
        testovaciLokace3.setExit(test1);

        System.out.println(testovaciLokace3.getExits());


    }
}
    