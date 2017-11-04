package pieces;

public class Piece {
    protected Color color;
    protected String string;

    public Piece() {
        this("-");
    }

    Piece(String string) {
        this.string = string;
        color = Color.WHITE;
    }

    public Color getColor() {
        return color;
    }

    public String getString() {
        return color.equals(Color.WHITE) ? string.toUpperCase() : string;
    }
}
