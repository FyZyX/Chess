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
                placePiece(Piece.fromString(boardString[i][j]), grid[i][j]);
            }
        }
    }

    public void placePiece(Piece piece, Square square) {
        piece.setSquare(square);
        this.grid[square.getRank()][square.getFile()].setPiece(piece);
    }

    public Piece pieceOn(Square square) {
        return this.grid[square.getRank()][square.getFile()].getPiece();
    }

    public void setPiecesFor(Player player) {
        Piece[] pieces = player.getPieces();
        int l = pieces.length;
        if (player.getAllegiance().equals(Color.WHITE)) {
            for (int i = 0; i < l/2; i++) {
                // set white pawn row
                grid[6][i].setPiece(pieces[l/2 + i]);
                // set white back row
                grid[7][i].setPiece(pieces[i]);
            }
        } else {
            for (int i = 0; i < l/2; i++) {
                // set black back row
                grid[0][i].setPiece(pieces[i]);
                // set black pawn row
                grid[1][i].setPiece(pieces[l/2 + i]);
            }
        }
    }

    public String toString() {
        String string = "";
        for (Square[] squares : this.grid) {
            for (Square square : squares) {
                string += square.getPiece().toString() + ' ';
            }
            string += '\n';
        }
        return string + '\n';
    }

    public void print() {
        System.out.print(this.toString());
    }
}
