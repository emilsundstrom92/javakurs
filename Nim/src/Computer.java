import java.util.Random;

public class Computer extends Player{

    public Computer(String name) {
        super(name);
    }

    @Override
    public int move(int sticksLeft) {
        Random random = new Random();
        int answer =  random.nextInt(sticksLeft / 2) + 1;
        System.out.println(name + " picked " + answer + " matches");
        return sticksLeft-answer;

    }
}

