package Labs.Lab3;

public abstract class Piece {
    private int field;
    private boolean isWhite;

    public Piece(int field, boolean isWhite) {
        this.field = field;
        this.isWhite = isWhite;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract String move();

    @Override
    public String toString() {
        return "Piece{" +
                "field=" + field +
                ", isWhite=" + isWhite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o && this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piece piece = (Piece) o;
        return field == piece.field && isWhite == piece.isWhite;
    }
}
