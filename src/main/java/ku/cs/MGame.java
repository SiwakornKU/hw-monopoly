package ku.cs;

import java.util.List;

public class MGame {
    int roundCat;
    List<Dice> dices; // 2 dices

    List<Player> players; // 2-8 players

    Board board;

    public void playGame(){
        for(int i=0; i<players.size(); i++){
            this.playRound(i);
        }
    }

    private void playRound(int i){
        players.get(i).takeTurn();
    }
}
