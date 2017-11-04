package pieces;

public class Queen extends Piece {
    Queen() {
        super("q");
    }

    public Queen(Color color) {
        this();
        this.color = color;
    }
}
