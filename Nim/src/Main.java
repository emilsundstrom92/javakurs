
public class Main {
    public static void main(String[] arg) {

        int numberOfMatches = Integer.parseInt(arg[0]);
        Human player1 = new Human("Human");
        Computer player2 = new Computer("Computer");
        Game g = new Game();


        g.greeting(player1.name);
        g.greeting(player2.name);
        g.remainingMatches(numberOfMatches);

        int count = 1;

        while (!g.gameOver(numberOfMatches)){
            if(count %2 == 1 && numberOfMatches != 1){
                numberOfMatches = player1.move(numberOfMatches);
                g.remainingMatches(numberOfMatches);
                g.gameWinner(player1.name, numberOfMatches);
                count++;
            } else if (numberOfMatches != 1){
                numberOfMatches = player2.move(numberOfMatches);
                g.remainingMatches(numberOfMatches);
                g.gameWinner(player2.name, numberOfMatches);
                count++;

            }
        }


    }
}
