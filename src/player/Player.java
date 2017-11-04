package player;

import pieces.*;

public class Player {
    private final Color allegiance;
    private Piece[] pieces;

    public Player(Color allegiance) {
        this.allegiance = allegiance;
        this.pieces = new Piece[] {
                new Rook(allegiance), new Knight(allegiance), new Bishop(allegiance), new Queen(allegiance),
                new King(allegiance), new Bishop(allegiance), new Knight(allegiance), new Rook(allegiance),
                new Pawn(allegiance), new Pawn(allegiance), new Pawn(allegiance), new Pawn(allegiance),
                new Pawn(allegiance), new Pawn(allegiance), new Pawn(allegiance), new Pawn(allegiance)
        };
    }

    public Color getAllegiance() {
        return this.allegiance;
    }

    public Piece[] getPieces() {
        return this.pieces;
    }
}
