package board;

import pieces.Color;
import pieces.Piece;
import player.Player;

import java.util.Arrays;

public class Board {
    private Piece[][] grid;

    public Board() {
        Piece[] emptyRow = {new Piece(), new Piece(), new Piece(), new Piece(),
                new Piece(), new Piece(), new Piece(), new Piece()};
        this.grid = new Piece[][] {
                emptyRow,
                emptyRow,
                emptyRow,
                emptyRow,
                emptyRow,
                emptyRow,
                emptyRow,
                emptyRow
        };
    }

    private void placePiece(Piece piece, Square square) {
        this.grid[square.getFile()][square.getRank()] = piece;
    }

    private Piece pieceOnSquare(Square square) {
        return this.grid[square.getFile()][square.getRank()];
    }

    public void print() {
        for (Piece[] pieces : this.grid) {
            for (Piece piece : pieces) {
                System.out.print(piece.getString() + ' ');
            }
            System.out.println();
        }
    }

    public void setPiecesFor(Player player) {
        Piece[] pieces = player.getPieces();
        if (player.getAllegiance().equals(Color.WHITE)) {
            // set white pawn row
            grid[6] = Arrays.copyOfRange(pieces, pieces.length/2, pieces.length);
            // set white back row
            grid[7] = Arrays.copyOfRange(pieces, 0, pieces.length/2);
        } else {
            // set black back row
            grid[0] = Arrays.copyOfRange(pieces, 0, pieces.length/2);
            // set black pawn row
            grid[1] = Arrays.copyOfRange(pieces, pieces.length/2, pieces.length);
        }
    }
}
