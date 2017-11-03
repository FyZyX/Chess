public class Board {
    private Piece[][] grid;

    Board() {
        Piece[] emptyRow = {new Piece(), new Piece(), new Piece(), new Piece(),
                new Piece(), new Piece(), new Piece(), new Piece()};
        this.grid = new Piece[][] {
                {new Rook(Color.BLACK), new Knight(Color.BLACK), new Bishop(Color.BLACK), new Queen(Color.BLACK),
                        new King(Color.BLACK), new Bishop(Color.BLACK), new Knight(Color.BLACK), new Rook(Color.BLACK)},
                {new Pawn(Color.BLACK), new Pawn(Color.BLACK), new Pawn(Color.BLACK), new Pawn(Color.BLACK),
                        new Pawn(Color.BLACK), new Pawn(Color.BLACK), new Pawn(Color.BLACK), new Pawn(Color.BLACK)},
                emptyRow,
                emptyRow,
                emptyRow,
                emptyRow,
                {new Pawn(), new Pawn(), new Pawn(), new Pawn(),
                        new Pawn(), new Pawn(), new Pawn(), new Pawn()},
                {new Rook(), new Knight(), new Bishop(), new Queen(),
                        new King(), new Bishop(), new Knight(), new Rook()}
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
