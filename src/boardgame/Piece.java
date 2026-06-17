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
}
