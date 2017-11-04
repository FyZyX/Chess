package board;

import pieces.*;
import player.Color;
import player.Player;

public class Board {
    private Square[][] grid = new Square[8][8];

    public Board() {
        this(new String[][] {
            {"-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-"}
        });
    }

    public Board(String[][] boardString) {
        for (File file : File.values()) {
            for (Rank rank : Rank.values()) {
                int i = rank.ordinal(), j = file.ordinal();
                grid[i][j] = new Square(file, rank);
                Piece piece = Piece.fromString(boardString[i][j]);
                if (piece != null) {
                    placePiece(piece, grid[i][j]);
                }
            }
        }
    }

    public Square getSquare(Square square) {
        return getSquare(square.getFile(), square.getRank());
    }

    public Square getSquare(int file, int rank) {
        return grid[rank][file];
    }

    public void placePiece(Piece piece, Square square) {
        piece.setSquare(square);
        getSquare(square).setPiece(piece);
    }

    public void clearSquare(Square square) {
        square.clearPiece();
    }

    public Piece pieceOn(Square square) {
        return getSquare(square).getPiece();
    }

    public void setPiecesFor(Player player) {
        Piece[] pieces = player.getPieces();
        int l = pieces.length;
        if (player.getAllegiance().equals(Color.WHITE)) {
            for (int i = 0; i < l/2; i++) {
                // set white pawn row
                getSquare(i, 6).setPiece(pieces[l/2 + i]);
                // set white back row
                getSquare(i, 7).setPiece(pieces[i]);
            }
        } else {
            for (int i = 0; i < l/2; i++) {
                // set black back row
                getSquare(i, 0).setPiece(pieces[i]);
                // set black pawn row
                getSquare(i, 1).setPiece(pieces[l/2 + i]);
            }
        }
    }

    public String toString() {
        String string = "";
        for (Square[] squares : this.grid) {
            for (Square square : squares) {
                Piece piece = square.getPiece();
                string += (piece == null ? "-" : piece.toString()) + ' ';
            }
            string += '\n';
        }
        return string + '\n';
    }

    public void print() {
        System.out.print(this.toString());
    }
}
