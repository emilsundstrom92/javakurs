public class GameLogic {

    public int numberOfMatches;
    public int playerTurn;

    public GameLogic() {
    }

    public void greeting(){
        System.out.println("Welcome to Nm");
    }

    public int getPlayerTurn(int playerNumber) {
        if(playerNumber % 2 == 1){
            return 1;
        } else {
            return 0;
        }
    }

    public void printMatches(){
        System.out.println("Remaining matches: " + this.numberOfMatches);
    }

    public int getNumberOfMatches() {
        return numberOfMatches;
    }

    public void setNumberOfMatches(int numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }
/*
    public boolean illegalMove(int move){
        if(move > this.numberOfMatches/2){
            return false;
        }
        else{
            return true;
        }


    }

 */


}
