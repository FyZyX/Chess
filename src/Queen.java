public class Queen extends Piece {
    Queen() {
        super("q");
    }

    Queen(Color color) {
        this();
        this.color = color;
    }
}
