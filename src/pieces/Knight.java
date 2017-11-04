package pieces;

public class Knight extends Piece {
    Knight() {
        super("n");
    }

    public Knight(Color color) {
        this();
        this.color = color;
    }
}
