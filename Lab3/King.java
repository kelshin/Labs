package Labs.Lab3;

public class King extends Piece{
    private int value = 1000;

    public King(int value, boolean isWhite){
        super(value, isWhite);
        this.value = value;
    }

    @Override
    public String move() {
        return "One square";
    }

    @Override
    public String toString() {
        return "King{value='" + value + "'}";
    }
}
