package pieces;

import board.Square;
import player.Color;

public abstract class Piece {
    protected Color color;
    protected String string;
    private Square square = null;

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

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public String toString() {
        return color.equals(Color.WHITE) ? string.toUpperCase() : string;
    }

    public static Piece fromString(String pieceString) {
        switch (pieceString) {
            case "P": return new Pawn();
            case "p": return new Pawn(Color.BLACK);
            case "R": return new Rook();
            case "r": return new Rook(Color.BLACK);
            case "N": return new Knight();
            case "n": return new Knight(Color.BLACK);
            case "B": return new Bishop();
            case "b": return new Bishop(Color.BLACK);
            case "Q": return new Queen();
            case "q": return new Queen(Color.BLACK);
            case "K": return new King();
            case "k": return new King(Color.BLACK);
            default: return null;
        }
    }
}
