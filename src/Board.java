public class Board {
    private Character[][] grid;

    Board() {
        this.grid = new Character[8][8];
    }

    private void placePiece(Piece pce, Square sqr) {
        this.grid[sqr.getFile()][sqr.getRank()] = pce.getCharacter();
    }

    public void print() {
        System.out.println("");
    }
}
