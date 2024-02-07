public class Game {


    public void greeting(String name){
        System.out.println("Player 1: " + name);
    }

    //Metod för att print ut hur många stickor som är kvar
    public void remainingMatches(int matches){
        System.out.println("Remaining matches: " + matches);
    }


    //metod för att verifiera move används ej.
    /*
        public boolean correctMove(int playerMove){
        if(playerMove > sticksLeft/2){
            System.out.println("Wrong, maximum number of sticks that can be picked are " + sticksLeft/2 + "\nPlease pick a number");
            return false;
        }
        return true;
    }
     */


    //metod för att kolla vem som vinner.
    public void gameWinner(String name, int matches){
        if (matches == 1){
            System.out.println(name + " has won the game!");
        }
    }

    //Metod för att kolla om spelet är över eller ej
    public boolean gameOver(int matches){
        if(matches <= 1){
            return true;
        }
        return false;
    }
}
