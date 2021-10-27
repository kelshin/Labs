package Labs.Lab3;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Piece> pieces = new ArrayList<>();
        pieces.add(new Bishop(3,true));
        pieces.add(new King(1000,true));
        pieces.add(new Knight(2,true));
        pieces.add(new Pawn(1,true,false));
        pieces.add(new Queen(9,true));
        pieces.add(new Rook(5,true));

        for (Piece p : pieces){
            System.out.println(p.move());
            System.out.println(p.toString());
        }

        Piece p1 = new Pawn(1,true,true, new Queen(1,true));
        Piece p2 = new Pawn(1,true,false);
        Piece p3 = new Pawn(1,false,false);
        Piece p4 = new Pawn(1,false,true,new Queen(1,true));
        Piece p5 = new Pawn(1,true,true,new King(1,true));
        Piece p6 = new Pawn(1,true,false);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));
    }
}
