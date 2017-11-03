public class Piece {
    protected Color color;
    protected String string;

    Piece() {
        this("-");
    }

    Piece(String string) {
        this.string = string;
        this.color = Color.WHITE;
    }

    public String getString() {
        return this.color.equals(Color.WHITE) ? this.string.toUpperCase() : this.string;
    }
}
