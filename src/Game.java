import board.Board;
import pieces.Color;
import player.Player;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        Player white = new Player(Color.WHITE);
        Player black = new Player(Color.BLACK);
        board.setPiecesFor(white);
        board.setPiecesFor(black);
        board.print();
    }
}
