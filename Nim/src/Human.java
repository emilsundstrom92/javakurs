import java.util.Random;
import java.util.Scanner;

public class Human extends Player{


    Scanner scanner = new Scanner(System.in);

    public Human(String name) {
        super(name);
    }



    public int move(int sticksLeft) {
        System.out.println("Please pick a number");
        int userAnswer = scanner.nextInt();
        while (userAnswer > (sticksLeft /2)){
            System.out.println("Wrong, maximum number of sticks that can be picked are " + sticksLeft/2
                    + "\nPlease pick a number");
            userAnswer = scanner.nextInt();
        }
        System.out.println(name + " picked " + userAnswer + " matches");
        return sticksLeft-userAnswer;
    }

}
