package pieces;

import player.Color;

public class Bishop extends Piece {
    public Bishop() {
        super("b");
    }

    public Bishop(Color color) {
        this();
        this.color = color;
    }
}
