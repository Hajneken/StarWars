package Logic;


public class Main {

    public static String main(String[] args) {
//        Only instances of the class
//        řešit pomocí konstant
//        Export the final result as a JAR class > navigate to Main when exporting

       Game game = new Game();
       while (game.getOver() == false){
           System.out.println(game.gameOver());
       }

    }
}
