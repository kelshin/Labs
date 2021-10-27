package Labs.Lab3;

public class Rook extends Piece{
    private int value = 5;

    public Rook(int value, boolean isWhite){
        super(value, isWhite);
        this.value = value;
    }

    @Override
    public String move(){
        return "Horizontally or vertically";
    }

    @Override
    public String toString() {
        return "Rook{value='" + value + "'}";
    }
}
