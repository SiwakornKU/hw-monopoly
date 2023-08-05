package ku.cs;

import java.util.List;

public class Player {
    String name;
    List<Dice> dices;

    Piece piece;
    Board board;

    public Player(String name, List<Dice> dices, Piece piece, Board board) {
        this.name = name;
        this.dices = dices;
        this.piece = piece;
        this.board = board;
    }

    void takeTurn(){
        int[] fv = new int[dices.size()];
        for (int i=0; i<dices.size(); i++){
            dices.get(i).roll();
            fv[i] = dices.get(i).getFaceValue();
        }

        int fvTot = fv[0] + fv[1];

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc,fvTot);
        piece.setLocation(newLoc);

    }

}
