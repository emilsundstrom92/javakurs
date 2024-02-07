abstract class Player {

    public String name;
    public int playerNumber;

    public Player(String name) {
        this.name = name;
    }

    public abstract int move(int sticksLeft);




}
