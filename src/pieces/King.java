package pieces;

public class King extends Piece {
    King() {
        super("k");
    }

    public King(Color color) {
        this();
        this.color = color;
    }
}
