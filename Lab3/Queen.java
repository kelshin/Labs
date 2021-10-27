package Labs.Lab3;

public class Queen extends Piece{
    private int value = 9;

    public Queen(int value, boolean isWhite){
        super(value, isWhite);
        this.value = value;
    }

    @Override
    public String move() {
        return "Like a bishop and rook";
    }

    @Override
    public String toString() {
        return "Queen{value='" + value + "'}";
    }
}
