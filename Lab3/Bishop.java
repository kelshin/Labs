package Labs.Lab3;

public class Bishop extends Piece {
    private int value = 3;

    public Bishop(int value, boolean isWhite){
        super(value, isWhite);
        this.value = value;
    }

    @Override
    public String move() {
        return "Diagonally";
    }

    @Override
    public String toString() {
        return "Bishop{value='" + value + "'}";
    }
}
