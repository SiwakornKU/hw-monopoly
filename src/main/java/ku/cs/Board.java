package ku.cs;

import java.util.List;

public class Board {

    List<Square> squares;

    public Square getSquare(Square oldLoc, int faceTotal){
        int index;
        boolean find = false;
        for(index=0; index < squares.size(); index++){
            if(squares.get(index).equals(oldLoc)){
                find = true
                break;
            }
        }

        if(!find){
            return null;
        }

        int check = index+faceTotal;
        int walk;
        if(check >= squares.size()){
            walk = check-squares.size();
        }else{
            walk = check;
        }

        return squares.get(walk);
    }
}
