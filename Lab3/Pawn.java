package Labs.Lab3;

import java.util.Objects;

public class Pawn extends Piece{
    private int value = 1;
    public boolean promoted;
    public Piece newPiece;

    public Pawn(int value, boolean isWhite, boolean promoted){
        super(value, isWhite);
        this.promoted = promoted;
    }
    public Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece){
        super(value, isWhite);
        this.promoted = promoted;
        this.newPiece = newPiece;
    }

    @Override
    public String move() {
        return "Forward 1";
    }

    @Override
    public String toString() {
        return "Pawn{value='" + value + "'}";
    }

    public void promote(Piece newPiece){
        promoted = true;
        newPiece = new Queen(8,true);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pawn pawn = (Pawn) o;
        return value == pawn.value && promoted == pawn.promoted && Objects.equals(newPiece, pawn.newPiece);
    }

}
