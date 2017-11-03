public class Board {
    private Piece[][] grid;

    Board() {
        Piece[] emptyRow = {new Piece(), new Piece(), new Piece(), new Piece(),
                new Piece(), new Piece(), new Piece(), new Piece()};
        this.grid = new Piece[][] {
                emptyRow, emptyRow, emptyRow, emptyRow, emptyRow, emptyRow, emptyRow, emptyRow
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
}
