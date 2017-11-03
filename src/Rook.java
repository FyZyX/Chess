public class Rook extends Piece {
    Rook() {
        super("r");
    }

    Rook(Color color) {
        this();
        this.color = color;
    }
}
