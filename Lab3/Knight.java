package Labs.Lab3;

public class Knight extends Piece{
    private int value = 2;

    public Knight(int value, boolean isWhite){
        super(value, isWhite);
        this.value = value;
    }

    @Override
    public String move() {
        return "Like an L";
    }

    @Override
    public String toString() {
        return "Knight{value='" + value + "'}";
    }
}
