public class Bishop extends Piece {
    Bishop() {
        super("b");
    }

    Bishop(Color color) {
        this();
        this.color = color;
    }
}
