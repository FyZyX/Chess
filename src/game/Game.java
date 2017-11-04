package game;

import board.Board;
import board.File;
import board.Rank;
import board.Square;
import pieces.Color;
import pieces.Piece;
import player.Player;

public class Game {
    private Board board;
    private Player white;
    private Player black;

    public Game() {
        board = new Board();
        white = new Player(Color.WHITE);
        black = new Player(Color.BLACK);
        board.setPiecesFor(white);
        board.setPiecesFor(black);
    }

    private void move(Player player, Square current, Square destination) {
        Piece piece = board.pieceOn(current);
        board.placePiece(new Piece(), current);
        board.placePiece(piece, destination);
    }

    public void play() {
        Square c = new Square(File.FILE_A, Rank.RANK_2);
        Square d = new Square(File.FILE_A, Rank.RANK_4);
        board.print();
        move(white, c, d);
        board.print();
    }
}
