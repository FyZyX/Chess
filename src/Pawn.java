public class Pawn extends Piece {
    Pawn() {
        super("p");
    }

    Pawn(Color color) {
        this();
        this.color = color;
    }
}
