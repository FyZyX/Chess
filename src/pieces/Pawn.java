package pieces;

public class Pawn extends Piece {
    Pawn() {
        super("p");
    }

    public Pawn(Color color) {
        this();
        this.color = color;
    }
}
