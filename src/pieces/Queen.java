package pieces;

public class Queen extends Piece {
    public Queen() {
        super("q");
    }

    public Queen(Color color) {
        this();
        this.color = color;
    }
}
