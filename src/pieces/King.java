package pieces;

public class King extends Piece {
    public King() {
        super("k");
    }

    public King(Color color) {
        this();
        this.color = color;
    }
}
