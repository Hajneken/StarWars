package Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import  java.util.Scanner;


/**
 * @author Hynek Zemanec
 * @project StarWars
 */
public class UserInterface {
    private GameLogic game;

    public UserInterface(){
        game = new GameLogic();
    }

    private void playIntro(){
        System.out.println(game.greetingMessage());
        readInput();
        System.out.println(game.getIntro());
        readInput();
    }

    private void playEnd(){
        System.out.println(game.getCongratulationsText());
        readInput();
        System.out.println(game.getEpilogue());
        readInput();
        game.exitGame();
    }

//    need some pregame logic that would choose the ship and name player first

    public void play(){
        playIntro();
        System.out.println(game.initUI());
//        game starts here
        while(!game.isOver()){
            String input = readInput();
            System.out.println(game.processInput(input));
        }
        playEnd();
    }

    private String readInput(){
        System.out.print("> ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
