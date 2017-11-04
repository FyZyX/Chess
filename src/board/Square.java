package board;

import pieces.Piece;

public class Square {
    private final File file;
    private final Rank rank;
    private Piece piece;

    public Square(File file, Rank rank, Piece piece) {
        this.file = file;
        this.rank = rank;
        this.piece = piece;
    }

    public Square(File file, Rank rank) {
        this(file, rank, null);
    }

    public int getFile() {
        return this.file.ordinal();
    }

    public int getRank() {
        return this.rank.ordinal();
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
