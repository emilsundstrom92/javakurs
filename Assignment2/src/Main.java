import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        GameLogic g = new GameLogic();
        int numberOfMatches = Integer.parseInt(arg[0]);
        g.setNumberOfMatches(numberOfMatches);
        Human h = new Human(numberOfMatches,"Human");
        Computer c = new Computer(numberOfMatches,"Computer");

        boolean gameOver = false;
        g.greeting();
        h.greeting(1);
        c.greeting(2);
        while (!gameOver){
            if (g.getNumberOfMatches() != 1){
                g.printMatches();
                numberOfMatches = h.move(numberOfMatches);
                g.setNumberOfMatches(numberOfMatches);
                g.printMatches();
                numberOfMatches = c.move(numberOfMatches);
                g.setNumberOfMatches(numberOfMatches);
            }
            else{
                gameOver = true;
            }

        }

    }
}
