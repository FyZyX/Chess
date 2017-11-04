package board;

import pieces.*;
import player.Player;

import java.util.Arrays;

public class Board {
    private Piece[][] grid = new Piece[8][8];

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
        Piece piece;

        for (int i = 0; i < boardString.length; i++) {
            for (int j = 0; j < boardString[0].length; j++) {
                switch (boardString[i][j]) {
                    case "P":
                        piece = new Pawn();
                        break;
                    case "p":
                        piece = new Pawn(Color.BLACK);
                        break;
                    case "R":
                        piece = new Rook();
                        break;
                    case "r":
                        piece = new Rook(Color.BLACK);
                        break;
                    case "N":
                        piece = new Knight();
                        break;
                    case "n":
                        piece = new Knight(Color.BLACK);
                        break;
                    case "B":
                        piece = new Bishop();
                        break;
                    case "b":
                        piece = new Bishop(Color.BLACK);
                        break;
                    case "Q":
                        piece = new Queen();
                        break;
                    case "q":
                        piece = new Queen(Color.BLACK);
                        break;
                    case "K":
                        piece = new King();
                        break;
                    case "k":
                        piece = new King(Color.BLACK);
                        break;
                    default:
                        piece = new Piece();
                        break;
                }
                grid[i][j] = piece;
            }
        }
    }

    public void placePiece(Piece piece, Square square) {
        this.grid[square.getRank()][square.getFile()] = piece;
    }

    public Piece pieceOn(Square square) {
        return this.grid[square.getRank()][square.getFile()];
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

    public String toString() {
        String string = "";
        for (Piece[] pieces : this.grid) {
            for (Piece piece : pieces) {
                string += piece.getString() + ' ';
            }
            string += '\n';
        }
        return string + '\n';
    }

    public void print() {
        System.out.print(this.toString());
    }
}
