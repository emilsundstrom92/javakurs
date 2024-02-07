import java.util.Random;

public class Computer extends Player{

    public Computer(int sticks, String name, int turn) {
        super(sticks, name, turn);
    }


    @Override
    public int move(int sticksLeft) {
        Random random = new Random();
        int answer =  random.nextInt((sticksLeft / 2)+1);
        System.out.println("Computer picked " + answer + " matches");
        return sticksLeft-answer;

    }
}
