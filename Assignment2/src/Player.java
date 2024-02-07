abstract public class Player {

    public int sticks;
    public String name;

    public int turn;

    public Player() {
    }


    public Player(int sticks, String name, int turn) {
        this.sticks = sticks;
        this.name = name;
        this.turn = turn;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int move(int sticksLeft){
        return sticks;
    }

    public int getSticks() {
        return sticks;
    }

    public void setSticks(int sticks) {
        this.sticks = sticks;
    }

    public void greeting(int number){
        System.out.println("Player " + number + ": " + name);
    }
}