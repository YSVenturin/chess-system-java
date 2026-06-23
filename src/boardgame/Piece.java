package boardgame;

public abstract class Piece {
    private Board board;
    protected Position position;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return this.board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return this.possibleMoves()[position.getRow()][position.getCol()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
