package ku.cs;

public class Piece {
    Square square;

    public Square getLocation(){
        return square;
    }

    public void setLocation(Square newLoc){
        this.square = newLoc;
    }
}
