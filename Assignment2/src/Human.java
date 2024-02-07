import java.util.Scanner;

public class Human extends Player {

    Scanner scanner = new Scanner(System.in);


    public Human(int playerNumber, String name) {
        super(playerNumber, name);
    }

    public int move(int sticksLeft) {
        System.out.println("Please pick a number");
        int userAnswer = scanner.nextInt();
        while (userAnswer > (sticksLeft /2)){
            System.out.println("Wrong, maximum number of sticks that can be picked are" + sticksLeft/2 + "Please pick a number");
            userAnswer = scanner.nextInt();
        }
        System.out.println("Player picked " + userAnswer + " matches");
        return sticksLeft-userAnswer;
    }
}
