package pieces;

public class Knight extends Piece {
    public Knight() {
        super("n");
    }

    public Knight(Color color) {
        this();
        this.color = color;
    }
}
